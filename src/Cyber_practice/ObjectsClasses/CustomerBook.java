package Cyber_practice.ObjectsClasses;

public class CustomerBook {

    String title;
    String author;
    int pages;


    public CustomerBook (String title, String author, int pages) {

    }

    public CustomerBook (){}

    public void customerBookInfo(){
        System.out.println("'" + this.title  + "' " + this.author + " " + this.pages);
    }
}
