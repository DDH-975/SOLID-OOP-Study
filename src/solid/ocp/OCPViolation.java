package solid.ocp;

//OCP 위반 예시
//포지션이 추가될때 마다 코드를 변경해줘야 하는 번거로움이 생긴다
//기존 코드 수정 발생 -> OCP 위반

public class OCPViolation {
    private static void ManUnitedPlayerList(String position){
        if(position.equals("FW")){
            System.out.println("마테우스 쿠냐, 호일룬, 아마드 디알로, ...");
        }else if(position.equals("MF")){
            System.out.println("브루노 페르난데스, 카세미루, 우가르테, ...");
        }else return;
    }
}


