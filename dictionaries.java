import java.util.*;

public class dictionaries
{
    public static void main(String[] args)
    {
        //english to spanish dictionary
        //but java doesnt have dictionaries and instead are called maps

        Map<String, String> engtospandictionary = new HashMap<String, String>();

        //adding definitions to dictionary (MAP)
        engtospandictionary.put("Monday", "Lunes");
        engtospandictionary.put("Tuesday", "Martes");
        engtospandictionary.put("Wednesday", "Miercoles");
        engtospandictionary.put("Thursday", "Jueves");
        engtospandictionary.put("Friday", "Viernes");
        engtospandictionary.put("Saturday", "Sabado");
        engtospandictionary.put("Sunday", "Domingo");

//keyset prints everything with no organization
        for (String key : engtospandictionary.keySet())
        {
            String key2 = key.toString();
            String value = engtospandictionary.get(key).toString();

            System.out.println(key2);
            System.out.println(value);
        }

        System.out.println("Prints the whole array (values)");
        System.out.println(engtospandictionary.values());

        System.out.println("\n Shopping list \n");

        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        //two ways we can do true boolean is shown above and
        //the reason why its green is because it is an object

        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));

        //we can print the keys w their values
        System.out.println("Printing keys w their values:\n");
        System.out.println(shoppingList.toString());

        //to clear our list we can do
        //shoppingList.clear(); this didnt delete anything it just
        //set our pointer to an empty list

        //to check if our list is empty we do
        System.out.println(shoppingList.isEmpty());

        //if we want to remove something from the map we do
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        //if we want to replace a value of a key we do
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());


        // System.out.println("\nInsert things to the list and type 'end' to finish listing\n");

        // Scanner input = new Scanner(System.in);
        // String user = input.nextLine();
        //im trying to create a loop where the user inputs the 
        //ingredients but i need to get key and value to do this
//so i need to figure that out
        // while(!(user.equals("end")))
        // {
        //     shoppingList.put();

        // }
        // System.out.println(shoppingList.values());
    }
}