package Cyber_practice.encapsulation;

import java.util.ArrayList;

// We create App with instance variables, create constructor so app can be created ONLY with specific variables.
// Also we have static variable numOfApps to track how many apps were created. Although we don't have set method for it so no one could
//change number of apps, but we do have a get method to find out num of apps, static numOfApps is private
// we have getters and setter for all instance variables, also String message can be added to arraylist as a review list

public class App {

    private static int numberOfApps;

    static {
        numberOfApps = 0;
    }


    private String name;
    private String category;
    private int rating;
    private String description;
    private double size;
    private ArrayList<String> reviews;

    public App (String name, String category, double size) {
        this.reviews = new ArrayList<>();
        //this.name = name;
        this.setName(name); // same thing as line 26, used when we have if/else conditions in method AND here in Constructor
        this.category = category;
        this.size = size;
        numberOfApps++;
    }

    public void open(){
        System.out.println(this.name + " is opening");
    }

    public void close(){
        System.out.println(this.name + " is closing");
    }

    public void update(){
        System.out.println(this.name + " is updating");
    }

    public void info(){
        System.out.println("Name: " + this.name + "\nCategory: " + this.category + "\nRating: " + this.rating +
                "\nDescription: " + this.description + "\nSize: " + this.size);
    }

    public void setReview(String message) {
        if (message.length() > 3){
            this.reviews.add(message);
            System.out.println("Thank you for your review");
        } else {
            System.out.println("Sorry, your review is invalid. Try again.");
        }
    }


    public static int getNumberOfApps() {
        return numberOfApps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }
}
