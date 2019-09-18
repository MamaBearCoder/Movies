import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        ArrayList movies  = new ArrayList<>();

        System.out.println("Enter your favorite movie:");
        String input = keyboard.nextLine();
        movies.add(input);

        while(!input.equalsIgnoreCase("q")) {
                System.out.println("Enter another movie");
                input = keyboard.nextLine();
            movies.add(input);

        }

        System.out.println(movies);
    }
}
