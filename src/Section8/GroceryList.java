package Section8;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList <String> groceryList = new ArrayList<>();

    // method for adding new item
    public void addGroceryItem (String item) {
        groceryList.add(item);
    }

    // method for printing size and each item
    public void printGroceryList (ArrayList <String> al) {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    // method for modifying items in list

    public static void main(String[] args) {

    }


}
