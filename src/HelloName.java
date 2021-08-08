import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Введите имя ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello, "+name);
    }
}
