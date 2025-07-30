import java.time.LocalTime;

public class testLoop {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Start Time: " + currentTime);

        for(int i = 0; i < 1000000000; i++) {
//            System.out.println("instance " + i);
        }
        System.out.println("End Time:   " + currentTime);

    }
}
