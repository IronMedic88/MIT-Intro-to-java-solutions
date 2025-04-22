import java.util.ArrayList;
public class Library {
    static String hours = "8am to 5Pm";
    ArrayList<Book> library;
    String address;

    Library(String address){
        library = new ArrayList<>();
        this.address = address;
    }
    public void addBook(Book book){
        library.add(book);
    }
    public String getAddress(){
        return address;
    }
    public void print(){
        for(int i = 0; i < library.size(); i++){
            System.out.println(library.get(i).getTitle());
        }
    }
    public static void printOpeningHours(){
        System.out.println(hours);
    }
    public void printAddress(){
        System.out.println(address);
    }
    public void borrowBook(String title){//Sorry, this book is already borrowed.
        
    }





    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        //System.out.println(secondLibrary.getAddress());

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));


        //firstLibrary.print();//checks to see if Library and addBook works
        //firstLibrary.librayPrint();

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
        //firstLibrary.printAvailableBooks();
        /*System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
// Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
// Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();*/
    }
}
