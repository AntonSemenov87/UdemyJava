package Cyber_practice.ObjectsClasses;

public class CD {

    String title;
    String artist;
    int year;
    double price;

    public CD(){

    }

    public CD (String title, String artist, int year, double price) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public void infoCD(){
        System.out.println("Artist: " + this.artist);
        System.out.println("Title: " + this.title);
        System.out.println("Year: " + this.year);
        System.out.println("Price: " + this.price);
    }


}
