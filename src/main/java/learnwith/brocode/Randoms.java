package learnwith.brocode;
import java.util.Random;
public class Randoms {
    public static void main(String[] args) {

        Random random = new Random();  // This is a created random class!

       // int x = random.nextInt();  // we can also bound a number to generate beetween in this case 0-33 : int x = random.nextInt(33);
        int x = random.nextInt(6)+1;
      //  double y = random.nextDouble();
     //  boolean z = random.nextBoolean();

        System.out.println(x);


    }
}