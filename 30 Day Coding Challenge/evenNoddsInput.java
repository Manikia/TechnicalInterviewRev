import java.io.*;
import java.util.*;

public class evenNoddsInput {

    public static void main(String[] args) {

        System.out.println("How many strings do you want to input?");
        Scanner input = new Scanner(System.in);

        int amount = input.nextInt();

        // String userInput = input.nextLine();
        int counter = 0;
        // gets the userinput and puts it in userInput

        for (int j = 0; j < amount; j++) {
            String s, s1 = "", s2 = "";
            s = input.next();

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    s1 = s1 + s.charAt(i);
                } 
                else {
                    s2 = s2 + s.charAt(i);
                }
            }
            System.out.println(s1 + " " + s2);
        }

        input.close();
    }
}