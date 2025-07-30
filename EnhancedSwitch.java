import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        System.out.print("enter a week day: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch(day){
//            case ("monday") -> System.out.println("it is a weekday");
//            case ("tueday") -> System.out.println("it is a weekday");
//            case ("wedday") -> System.out.println("it is a weekday");
//            case ("thursday") -> System.out.println("it is a weekday");
//            case ("friday") -> System.out.println("it is a weekday");
//            case ("satday") -> System.out.println("it is a weekend");
//            case ("sunday") -> System.out.println("it is a weekend");
//            default-> System.out.println("invalid day");

        //short code
            case "monday","tuesday","wednesday","thursday","Friday" -> System.out.println("it is a weekday");
            case "saturday","sunday" -> System.out.println("it is a weekend");
            default-> System.out.println("invalid day");

        }


        scanner.close();
    }
}
