package solid.codeRefactoring.OCPSRP;



public class MainActivity extends AppCompatActivity {
    private Button searchBtn;
    private AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        searchBtn = (Button) findViewById(R.id.searchButton);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.ACTextView);
        String[] suggestions = new String[]{
                "서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "제주특별자치도"
        };

        // ArrayAdapter를 사용하여 자동완성 데이터를 제공
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_dropdown_item_1line, suggestions);

        // AutoCompleteTextView에 어댑터 설정
        autoCompleteTextView.setAdapter(adapter);


        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = autoCompleteTextView.getText().toString().replaceAll("\\s", "");;

                LocationInfo info = LoactionRepository.find(str);

                if (info == null) {
                    Toast.makeText(MainActivity.this, "해당 도시를 찾을 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(MainActivity.this, ShowWeather.class);
                    intent.putExtra("location", info.getCity());
                    intent.putExtra("nx", info.getNx());
                    intent.putExtra("ny", info.getNy());
                    startActivity(intent);
                }

            }
        });
    }
}