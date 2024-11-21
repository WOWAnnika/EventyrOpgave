import java.util.ArrayList;
import java.util.List;
public class UserManager {
    private static UserManager instance;

    private List<User> users;
    private UserManager() {
        users = new ArrayList<>();
        users.add(new User("Hedwig", "hedhed",
                "hedhedgutten", 500));
    }
    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }
    public User login(String username, String password) {
        for (User user : users ) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("login vellykket " + user.getName());
                return user;
            }
        }
        System.out.println("login mislykket: ugyldigt brugernavn eller password");
        return null;
    }
}
