import java.util.Scanner;

public class UssdMenu {
    private Scanner sc;
    private int userInput;
    void startMenu() {
        sc = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("1 - для получения информации о тарифак компании");
        System.out.println("2 - для связи с оператором");

        userInput = sc.nextInt();

        if (userInput == 1) {

        }
    }
}
