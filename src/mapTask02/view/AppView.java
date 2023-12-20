package mapTask02.view;
import java.util.Scanner;

public class AppView {
    private final Scanner scan = new Scanner(System.in);

    public String getData() {
        System.out.println("Enter product name: ");
        String prodName = scan.nextLine().trim();
        return prodName;
    }

    public void printResult(String result) {
        System.out.println(result);
    }
}
