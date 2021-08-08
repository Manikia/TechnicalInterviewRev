import java.io.*;

/*
Things we know
-Even numbers are always divisible by 2
-if not divisible then it means its odd so we can create a for loop

-n = odd 
    -print 'weird'
-n = even between 2 - 5
    - print 'not weird'
-n = even between 6 - 20
    -print 'weird'
-n = even > 20
    -print 'not weird'
From the above restrictions we know we will need an if statement within an if statement since we need a restriction, one for odd and one for even and under the even if statment we add other if statments under it to show the other possibilities and outputs.
*/

public class evenodds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // check if its even or odd (2 options)
        if ((n % 2) == 0) // if ita even modulos
        {
            if (n > 2 && n < 5) // if n is between 2 - 5
            {
                System.out.println("Not Weird");
            } else if (n > 6 && n <= 20) // if n is between 6 - 20
            {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
            // do even options of restriction
        } else // if its an odd number
        {
            System.out.println("Weird");
        }

        bufferedReader.close();
    }
}
