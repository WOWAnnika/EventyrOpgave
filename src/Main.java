import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    UserManager userManager = UserManager.getInstance();
    LoginService loginService = new LoginService();
    Scanner input = new Scanner(System.in);

        System.out.println("Indtast brugernavn: ");
        String username = input.nextLine();
        System.out.println("Indtast adgangskode: ");
        String password = input.nextLine();

    User loggedInUser = loginService.login(username, password);

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("Menu: ");
            System.out.println("1. Indsæt penge");
            System.out.println("2. Hæv penge");
            System.out.println("3. Tjek konto oversigt");
            System.out.println("4. log ud");
            int choice = input.nextInt();
            input.nextLine();

            switch(choice) {

            }
    }
    }
}