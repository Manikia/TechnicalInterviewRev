import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = (meal_cost / 100) * tip_percent;
        int tax = tax_percent * ((tax_percent / 100) * tip_percent);

        double ntax = (double) tax * .1;

        double total_cost = meal_cost + tip + ntax + 1;

        System.out.println(Math.round(total_cost));
    }

}
