public class Book {
    private String name;
    private int bookNumber;
    private String author;
    private String genre;
    private int yearPublished;
    private boolean status;

    Book(String name, int bookNumber, String author, String genre, int yearPublished, boolean status){
        this.name = name;
        this.bookNumber = bookNumber;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.status = status;
    
    }

    public void printName() {
        System.out.println(name);
    }

    public String recieveName() {
        return name;
    }

    public String recieveGenres() {
        return genre;
    }

    public int recieveYear() {
        return yearPublished;
    }

    public boolean recieveStatus() {
        return status;
    }

    public int recieveBookNumber() {
        return bookNumber;
    }

    public void checkoutBook() {
        status = false;
    }

    public void returnBook() {
        status = true;
    }
}
