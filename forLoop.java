import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws InterruptedException {

        int start;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many loops: ");
        start = scanner.nextInt();

        for(int i=start;i>=0;i--){
            System.out.println("number "+i);
            Thread.sleep(400);
        }
        System.out.println("BOOM BOOM!!!");
    }
}
