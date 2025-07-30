import java.util.Scanner;

public class Pizza{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item woud you like to buy? : ");
        String item = scanner.nextLine();
        System.out.println("What is the price of each? : ");
        Double price = scanner.nextDouble();
        System.out.println("How many would u like? : ");
        int many = scanner.nextInt();
        scanner.close();

        System.out.println("You have ordered "+item+"\n"+"your total is : "+price*many+"$");

    }
}