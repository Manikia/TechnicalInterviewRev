import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a Double");
        System.out.println("Insert an Integer");
        System.out.println("Insert a String");

        d = scan.nextDouble();
        int newi = scan.nextInt();
        scan.nextLine();
        String As = scan.nextLine(); // reads the string we already have

        d = d * 2;
        i = i + newi;
        s = s + As;

        System.out.println(s + " " + d + " " + i);
        
        scan.close(); // closes the scanner since we arent using it

    }
}
