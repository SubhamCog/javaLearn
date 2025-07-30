import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        char ch;
        System.out.print("enter symbol: ");
        ch = scanner.next().charAt(0);
        System.out.print("enter rows: ");
        rows = scanner.nextInt();
        System.out.print("enter columns: ");
        columns = scanner.nextInt();

        for(int i = 0;i<rows;i++){
            for(int j = 0;j< columns;j++) {
                System.out.print(ch+ "  ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
