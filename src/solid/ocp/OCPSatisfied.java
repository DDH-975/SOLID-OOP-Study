package solid.ocp;

//OCP를 만족한 예시
//새로운 포지션을 추가할때는 기존의 로직은 건드리지 않고,
//기존 클래스를 상속받거나, 구조체만 생성하여 기능을 확장할 수 있다.

abstract class Position{
    abstract void player();
}

class FW extends Position{
    @Override
    void player(){
        System.out.println("마테우스 쿠냐, 호일룬, 아마드 디알로, ...");
    }
}

class MF extends Position{
    @Override
    void player(){
        System.out.println("브루노 페르난데스, 카세미루, 우가르테, ...");
    }
}

class DP extends Position{
    @Override
    void player(){
        System.out.println("리산드로 마르티네즈, 요로, 더 리흐트, ...");
    }
}


class ManUnitedPlayer{
    void search(Position position){
        position.player();
    }
}

public class OCPSatisfied {
    public static void main(String[] args){
        Position FW = new FW();
        Position MF = new MF();
        Position DP  = new DP();

        ManUnitedPlayer manUnitedPlayer = new ManUnitedPlayer();
        manUnitedPlayer.search(FW);
        manUnitedPlayer.search(MF);
        manUnitedPlayer.search(DP);
    }
}
