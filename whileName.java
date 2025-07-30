import java.util.Scanner;

public class whileName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.print("enter name here:");
            name = scanner.nextLine();
        }

        System.out.println("hello "+ name);
        scanner.close();
    }
}
