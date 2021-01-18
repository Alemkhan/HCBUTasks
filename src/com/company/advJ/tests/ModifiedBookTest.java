package com.company.advJ.tests;

import com.company.advJ.models.Author;
import com.company.advJ.models.ModifiedBook;

public class ModifiedBookTest {

    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        ModifiedBook javaDummy = new ModifiedBook("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

    }

}
