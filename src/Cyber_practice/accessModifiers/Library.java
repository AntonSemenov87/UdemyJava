package Cyber_practice.accessModifiers;

import Cyber_practice.ObjectsClasses.Author;

public class Library {

    public static void main(String[] args) {

        Author author = new Author();
        author.name = "James";
        //author.info(); --> cannot access class Author mathod since it's private
    }

}
