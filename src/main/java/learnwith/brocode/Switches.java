package learnwith.brocode;

//Swiches in Java! Switch is an statement that allows an variable to be tested for equality aganist a list of values!
// IF we work much with If-else statments swiches are better way to go!
// NOTE!!! break; is very important to stop execution of other lines when we got a match!

public class Switches {
    public static void main(String[] args) {

        String day = "Friday";

        switch (day) {
            case "Monday": System.out.println("It is Monday");
                break;
            case "Tuesday": System.out.println("It is Tuesday");
                break;
            case "Wednesday": System.out.println("It is Wednesday");
                break;
            case "Thursday": System.out.println("It is Thursday");
                break;
            case "Friday": System.out.println("It is Friday");
                break;
            case "Saturday": System.out.println("It is Saturday");
                break;
            case "Sunday": System.out.println("It is Sunday");
                break;
            default: System.out.println("That's not a day");

        }

    }
}