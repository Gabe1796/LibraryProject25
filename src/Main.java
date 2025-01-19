import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args) {
        mainMenu();
    }
    
    private static void mainMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Java Library! The date and time is currently " + LocalDateTime.now());
            System.out.println("1. See available Books");
            //Show all books
            System.out.println("2. Checkout a Book");
            //User should check out an available book
            System.out.println("3. Sort Books?");
            //Sort Books by Genre or year published
            System.out.println("4. Exit");
            //Exit program
            System.out.println("Choose an option: ");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    library.listAllBooks();
                    break;
                case 2:
                    System.out.println("Which book would you like to print out?");
                    library.listAllAvailableBooks();
                    
                    int bookSelection = Integer.parseInt(scanner.nextLine());
                    library.retrieveBookByNumber(bookSelection);

                    System.out.println("Thanks, Have a great day!");
                    break;

                case 3:
                    sort();
                    break;
                     
                case 4:
                default:
                    exit = true;
            }
        }
    }

    public static void sort() {
        System.out.println("What would you like to sort by?");
        System.out.println("1. See different genres?");
        System.out.println("2. Sort all books by year?");

        int option = Integer.parseInt(scanner.nextLine());
        
        switch (option) {
            case 1:
                library.listAllGenres();
                System.out.println("What genre would you like to view the books from?");
                String genreOption = (scanner.nextLine());
                library.listBasedOffGenre(genreOption);

                break;
            case 2:
                library.sortByYear();
                break;
        }
    }
}
