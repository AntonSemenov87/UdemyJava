package Cyber_practice.ObjectsClasses;

import java.util.Scanner;

public class CustomerBook_Program {
    public static void main(String[] args) {
        System.out.println("Please enter number of books you have:");
        Scanner scanner = new Scanner(System.in);
        CustomerBook [] books = new CustomerBook[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < books.length; i++) {
            System.out.println("Please enter title of book #" + (i+1) + ":");
            CustomerBook book = new CustomerBook();
            book.title = scanner.nextLine();
            System.out.println("Please enter author of this book:");
            book.author = scanner.nextLine();
            System.out.println("And number of pages?");
            book.pages = scanner.nextInt();
            scanner.nextLine();
            books[i] = book;
        }

        for (CustomerBook cb: books) {
            cb.customerBookInfo();
        }
    }
}
