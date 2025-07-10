package solid.lsp;

//LSP 위반 예시
class Bird{
    void fly(){
        System.out.println("하늘을 난다.");
    }
}

class Sparrow extends Bird{
    @Override
    void fly(){
        System.out.println("참새가 난다.");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("타조는 날지 못한다");
    }
}

public class LSPViolation {
    public static void birdFly(Bird bird){
        bird.fly();
    }

    public static void main(String[]args){
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        birdFly(sparrow); // 정상작동
        birdFly(ostrich); //예외 발생 ->LSP위반
    }
}
