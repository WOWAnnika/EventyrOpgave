public class User {
    private String name;
    private String username;
    private String password;
    private int amount;

    public User (String name, String username, String password, int amount) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public String getUsername () {
        return username;
    }
    public String getPassword () {
        return password;
    }
    public int getAmount () {
        return amount;
    }
}
