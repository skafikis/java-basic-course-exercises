package lesson24.labs.exercise04;

import java.util.Date;

public class BookLibraryTest {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();

        bookLibrary.nameBook = "Mistborn: The Final Empire";
        bookLibrary.athorBook = "Brandon Sanderson";

        bookLibrary.isBorrowed = true;
        bookLibrary.nameBorrower = "Jesse Pinkman";
        bookLibrary.dateBorrowed = new Date("23/08/2024");
        bookLibrary.borrowedTimeDays = 7;
        bookLibrary.dateReturning = new Date("30/08/2024");
    }
}
