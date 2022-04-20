import java.util.ArrayList;



public class CafeUtil {



        public int getStreakGoal(int numWeeks) {

        int result = 0;

        for (int i = 0; i <= numWeeks; i++){
            result = result + i;
        }

        return result;
    }




    public double getOrderTotal(double[] prices) {

        double result = 0;

        for (int i = 0; i < prices.length; i++){
            result = result + prices[i];
        }

        return result;
    }



    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }

    }



    public void addCustomer(ArrayList<String> customers) {

        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        System.out.printf(" There are %s in front of you. \n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }



}

// There are additional Bonuses that I can go back an complete.