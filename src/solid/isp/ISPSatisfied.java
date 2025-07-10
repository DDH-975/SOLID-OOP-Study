package solid.isp;

//ISP 만족 예시
interface Dribble{
    void dribble();
}

interface Shoot {
    void shoot();
}

interface Pass{
    void pass();
}

interface Header{
    void header();
}


class BasketballPlayer2 implements Dribble, Shoot, Pass  {
    public void dribble() { System.out.println("농구 드리블"); }
    public void shoot() { System.out.println("농구 슛"); }
    public void pass() { System.out.println("농구 패스"); }
}

class FootballPlayer implements Dribble, Shoot, Pass, Header{
    public void dribble() { System.out.println("축구 드리블"); }
    public void shoot() { System.out.println("축구 슛"); }
    public void pass() { System.out.println("축구 패스"); }
    public void header() { System.out.println("헤더");}
}


public class ISPSatisfied {
    public static void main(String [] args){

    }
}