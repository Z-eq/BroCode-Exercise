package learnwith.brocode;

public class IfStatments  {
    public static void main(String[] args) {
        int age = 18;

        if(age>=75) {
            System.out.println("Ok boomer!");
        }
        else if(age>=18) {
            System.out.println("You are an adult!");
        }
        else if (age>=15) {
            System.out.println("You are an teenager!");
        }
        else {
            System.out.println("You are not an adult!  ");
        }
    }
}
