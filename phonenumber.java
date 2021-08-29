import java.util.*;

public class phonenumber {
    public static void main(String[] args)
    {
        //lets create a map w string and int
        Map<String, Integer> contact = new HashMap<String, Integer>();

        System.out.println("How many people do you want to add to the phone book?\n");
        Scanner input = new Scanner(System.in);

        // gets how many users a person wants to add to the phone book
        int users = input.nextInt();
        
        // we are going to ask for the persons name and # to create our keys
        System.out.println("Insert the persons name then their phone number\n");

        for (int i = 0; i < users; i++)
        //we are going to create a phonebook for the amount of users insertted
        {
            String cname = input.next();
            int cnumber = input.nextInt();
            contact.put(cname, cnumber);

        }
        //now we check if the user they wanna find is in the contact list
        System.out.println("Who do you want to pull from the contact info\n");
        String pname = input.next();



        for (String key : contact.keySet()) {
            String key2 = key.toString();
            String value = contact.get(key).toString();

            if (contact.containsKey(pname)) {
                System.out.println(key2 + "=" + value);
            } 
            else {
                System.out.println("Not found");
            }
        }

        input.close();
    }
}
