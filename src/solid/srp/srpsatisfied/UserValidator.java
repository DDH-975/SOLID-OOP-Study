package solid.srp.srpsatisfied;

public class UserValidator {
    public void validator(String email, String password){
        if(email.contains("@")||password.length()<6){
            System.out.println("잘못된 이메일 또는 비밀번호 입니다.");
        }
    }
}
