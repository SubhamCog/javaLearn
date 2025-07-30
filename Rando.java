import java.util.Random;

public class Rando{
    public static void main(String[] args){
        Random random = new Random();
        //random double generator 
        // double num = random.nextDouble(1.0,10.0);
        // System.out.println(num);

        Boolean coin = random.nextBoolean();
        System.out.println(coin);

        // coin flipping
        if(coin){
            System.out.println("head!!!");
        }else{
            System.out.println("tail!!!");
        }

    }
}