public class LoginService {
    private UserManager userManager = UserManager.getInstance();
    public User login (String username, String password) {
        return userManager.login(username, password);
    }
}
