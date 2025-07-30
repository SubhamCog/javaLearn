import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String a,b,c,d;
        String text="";

        Scanner scanner = new Scanner(System.in);

        // traditional code
//        System.out.println("write here:");
//        //variable
//        a = scanner.nextLine();
//        b = scanner.nextLine();
//        c = scanner.nextLine();
//        d = scanner.nextLine();
//        //output
//        System.out.println("Output:"+a+" "+b+" "+c+" "+d);

//----------------------------------------------------------

        // optimised code
        for (int i = 0; i < 4; i++) {
            System.out.printf("write %s here: \n",i);
            a = scanner.next();
            text = text + a + " ";
        }
        System.out.println(text);


        scanner.close();
    }
}
