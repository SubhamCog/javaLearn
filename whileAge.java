import java.util.Scanner;

public class whileAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("enter your age: ");
        age = scanner.nextInt();


        while(age<0){
            System.out.println("age cannot be negative");
            System.out.println("enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("your age is :" + age);
        scanner.close();
    }
}
