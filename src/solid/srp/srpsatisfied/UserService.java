package solid.srp.srpsatisfied;

public class UserService {
    private static SendEmail sendEmail = new SendEmail();
    private static UserRepository userRepository = new UserRepository();
    private static UserValidator userValidator = new UserValidator();

    public static void user(String email, String password){
        sendEmail.send(email);
        userRepository.save(email,password);
        userValidator.validator(email,password);
    }

}
