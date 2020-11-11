package Cyber_practice.ObjectsClasses;

public class Book {

    String name;
    int pages;
    String author;

    public Book (String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public Book () {

    }

    public void info(){
        System.out.println("Book name: " + this.name);
        System.out.println("Book author: " + this.author);
        System.out.println("Num of pages: " + this.pages);
    }



}
