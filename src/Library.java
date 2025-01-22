import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Library {
    Book[] books = {
            new Book("Reefscape Rule Book", 1, "Dean Kamen", "FRC", 2025, false),
            new Book("Diary of a Wimpy Kid", 2, "Jeff Kinney", "Childrens Book", 2007, true),
            new Book("Wonder", 3, "R. J. Palacio", "Childrens Book", 2012, true),
            new Book("1984: The Book", 4, "George Orwell", "Science Fiction", 1949, true),
            new Book("Harry Potter and the Sorcerers Stone", 5, "J. K. Rowling", "Fantasy", 1997, false),
            new Book("Star Wars: The Force Unleashed", 6, "Sean Williams", "Science Fiction", 2008, true),
            new Book("Crescendo Rule Book", 7, "Dean Kamen", "FRC", 2024, true),
            new Book("Lord of the Rings: Fellowship of the Ring", 8, "J. R. R. Tolken", "Fantasy", 1954, true),
            new Book("Deep Space Rule Book", 9, "Dean Kamen", "FRC", 2019, false),
            new Book("Blade Runner", 10, "Phillip K. Dick", "Science Fiction", 1968, false)
    };

    public Library() {

    }

    public void listAllBooks() { // Book Names
        for (int i = 0; i < books.length; i++) {
            books[i].printName();
        }
    }

    public void listAllGenres() { // Book Genres
        Set<String> set = new HashSet<>();
        for (int i = 0; i < books.length; i++) {
            set.add(books[i].recieveGenres());
        }
        System.out.println(set);
    }

    public void listBasedOffGenre(String correctGenre) { // Listing Genres
        for (int i = 0; i < books.length; i++) {
            if (books[i].recieveGenres().equals(correctGenre)) {
                books[i].printName();
            }
            // returnList.add(books[i].recieveGenres());
        }
    }

    public void sortByYear() { // Book Names
        Book[] bookArrayClone = books.clone();
        Arrays.sort(bookArrayClone, (a, b) -> Integer.valueOf(a.recieveYear()).compareTo(b.recieveYear()));
        for (Book book : bookArrayClone) {
            System.out.println(book.recieveYear() + ": " + book.recieveName());
        }
    }

    public void listAllAvailableBooks() { // List all available Books and print
        for (Book availableBooks : books) {
            if (availableBooks.recieveStatus()) {
                System.out.println(availableBooks.recieveBookNumber() + ". " + availableBooks.recieveName());
            }

        }
    }

    public void listAllBooksToReturn() { // List all available Books to return and print
        for (Book unAvailableBooks : books) {
            if (unAvailableBooks.recieveStatus() == false) {
                System.out.println(unAvailableBooks.recieveBookNumber() + ". " + unAvailableBooks.recieveName());
            }

        }
    }

    public void retrieveBookByNumberCheckout(int correctBookNumberCheckout) {
        for (Book book : books) {
            if (book.recieveBookNumber() == (correctBookNumberCheckout)) {
                book.checkoutBook();
        }
    }
    
}

public void retrieveBookByNumberReturn(int correctBookNumberReturn) {
    for (Book book : books) {
        if (book.recieveBookNumber() == (correctBookNumberReturn)) {
            book.returnBook();
    }
}
}
}
