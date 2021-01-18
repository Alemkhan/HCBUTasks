package com.company.advJ.tests;

import com.company.advJ.models.Author;
import com.company.advJ.models.Book;

public class BookTest {

    public static void main(String[] args) {

        Author author = new Author("Tah Ah Teck", "ahteck@gmail.com", 'm');
        Book book = new Book("Java for dummy", author, 19.50, 50);
        System.out.println(book);
        book.setPrice(22.00);
        book.setQty(80);
        System.out.println("name is: " + book.getName());
        System.out.println("price is: " + book.getPrice());
        System.out.println("qty is: " + book.getQty());
        System.out.println("Author is: " + book.getAuthor());

        //Using Book methods
        System.out.println("Author name is: " + book.getAuthorName() + " got using Book method!");

        System.out.println("Author's name is: " + book.getAuthor().getName());
        System.out.println("Author's email is: " + book.getAuthor().getEmail());
        Book anotherBook = new Book("more Java", new Author("New Author",
                "new_author@gmail.com", 'm'), 25.60);
        System.out.println(anotherBook);

    }

}
