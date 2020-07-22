package Section8;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList <String> groceryList = new ArrayList<>();

    // method for adding new item
    public void addGroceryItem (String item) {
        groceryList.add(item);
    }

    // method for printing size and each item
    public void printGroceryList () {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String newItem) {
        int position = findItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }


    // method for modifying items in list
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified to " + newItem);
    }

    public void removeGroceryItem (String item) {
        int position = findItem(item);
        if (position >= 0) {
            modifyGroceryItem(position, item);
        }
    }

    //method for removing an item
    public void removeGroceryItem (int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public int findItem (String searchItem) {
    //    boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }




}
