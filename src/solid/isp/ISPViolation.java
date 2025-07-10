package solid.isp;

//ISP 위반 예시
interface SportsPlayer {
    void dribble();     // 드리블
    void shoot();       // 슛
    void pass();        // 패스
    void header();      // 헤딩
}


class BasketballPlayer implements SportsPlayer {
    public void dribble() { System.out.println("농구 드리블"); }
    public void shoot() { System.out.println("농구 슛"); }
    public void pass() { System.out.println("농구 패스"); }
    public void header(){throw new UnsupportedOperationException("Scan not supported");}
}



public class ISPViolation {
}
