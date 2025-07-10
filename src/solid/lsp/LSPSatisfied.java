package solid.lsp;

//LSP 만족 예시

class Bird2{
    // 공통 속성
}

interface Flyablbe{
    void fly();
    void land();
}
class Sparrow2 extends Bird2 implements Flyablbe{
    @Override
    public void fly(){
        System.out.println("참새가 난다.");
    }

    @Override
    public void land(){
        System.out.println("참새가 착륙한다.");
    }
}

class Ostrich2 extends Bird2 {
    void run() {
        System.out.println("타조는 달린다.");
    }
}

public class LSPSatisfied {
    public static void birdActive(Bird2 bird){
        if(bird instanceof Sparrow2){
            ((Sparrow2) bird).fly();
        } else if (bird instanceof Ostrich2) {
            ((Ostrich2) bird).run();
        }else{}
    }


    public static void main(String[]args){
        Bird2 sparrow = new Sparrow2();
        Bird2 ostrich = new Ostrich2();

        birdActive(sparrow);
        birdActive(ostrich);
    }
}
