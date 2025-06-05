import java.util.ArrayList;
public class Library {
    static String hours = "8am to 5Pm";
    ArrayList<Book> library;
    String address;

    //constructor
    Library(String address){
        library = new ArrayList<>();
        this.address = address;
    }

    //add book to library
    public void addBook(Book book){
        library.add(book);
    }

    //prints address
    public String getAddress(){
        return address;
    }

    //prints size of library
    public Integer size(){
        return library.size();
    }

    //prints opening hours of the library
    public static void printOpeningHours(){
        System.out.println(hours);
    }

    //prints the address of library
    public void printAddress(){
        System.out.println(address);
    }

    //removes a book fromthe library
    public void borrowBook(String title) {//Sorry, this book is already borrowed.
        for(int i = 0; i < library.size(); i++) {
            if(library.get(i).getTitle().equals(title)){
                library.remove(i);
            }
        }
    }

    //prints the books availible in the library
    public void printAvailableBooks(){
        for(int i = 0; i < library.size(); i++ ){
            System.out.println(library.get(i).getTitle());
        }
        if(library.size() == 0 ){
            System.out.println("no books in catalog");
        }
    }

    //returns a book to the library
    public void returnBook(String title){
        Book book = new Book(title);
        library.add(book);
    }


    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        //Sorry, this book is already borrowed.
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
