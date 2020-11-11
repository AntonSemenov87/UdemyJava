package Cyber_practice.ObjectsClasses;

public class BookStore {
    public static void main(String[] args) {

        Book book1 = new Book("Java", "Cyber", 200);
        Book book2 = new Book("Automation", "Povetkin", 150);
        Book book3 = new Book("QA", "Mike Perk", 100);

        Book [] myBooks = new Book[3];
        myBooks[0] = book1;
        myBooks[1] = book2;
        myBooks[2] = book3;

        for (Book book: myBooks) {
           // System.out.println(book.name + " written by " + book.author + " has " + book.pages + " pages");
            // OR:
            book.info();
        }


        Book book4 = new Book();
        book4.pages = 400;
        book4.name = "Mathor";
        book4.name = "Default Constructor";

        book4.info();
        System.out.println("----------------***-----------------");

        for (int i = 0; i < myBooks.length; i++) {
            myBooks[i].pages = 450;
            System.out.println("Book " + (i+1) + ":");
            myBooks[i].info();
        }

    }
}
