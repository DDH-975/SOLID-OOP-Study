package solid.srp;

//SRP 위반 예시
//하나의 클래스에 이메일 전송, 저장, 유효성 확인등 여러가지 기능이 들어가있음
//각 기능들을 각각의 클래스로 나눠줄 필요가 있다.
public class SRPViolation {
    //이메일 전송 기능
    public void send(String email) {
        System.out.println("이메일 전송" + email);
    }

    //저장기능
    public void save(String emil, String password){
        System.out.println("저장완료");
    }

    //유효성 확인기능
    public void validator(String email, String password){
        if(email.contains("@")||password.length()<6){
            System.out.println("잘못된 이메일 또는 비밀번호 입니다.");
        }
    }
}
