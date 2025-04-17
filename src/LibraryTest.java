public class LibraryTest {
    public static void main(String[] args) {
// Creating objects of different types
        Book book1 = new Book("The Witcher", 1990, "Andrzej Sapkowski",
                320);
        Movie movie1 = new Movie("The Green Mile", 1999, "Frank Darabont",
                189);
// Demonstrating polymorphism – storing different types in a base class array
        LibraryMedia[] mediaArray = new LibraryMedia[2];
        mediaArray[0] = book1; // Book object stored as LibraryMedia
        mediaArray[1] = movie1; // Movie object stored as LibraryMedia
// Demonstrating polymorphism – calling methods on different types
        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (LibraryMedia media : mediaArray) {
// Same method name, but the correct implementation is called
// depending on the actual object type (polymorphism)
            media.displayInformation();
            System.out.println("--------------------");
        }
// Demonstrating borrowing and returning operations
        System.out.println("\n===== BORROWING AND RETURNING OPERATIONS=====");
        book1.borrow(); // Borrowing the book
        book1.borrow(); // Attempting to borrow again – should show that it’s already borrowed
        book1.returnMedia(); // Returning the book
// Calling type-specific methods
        System.out.println("\n===== TYPE-SPECIFIC METHODS =====");
        book1.checkNumberOfPages(); // Method specific to Book
        movie1.checkDuration(); // Method specific to Movie
// Demonstrating casting to call type-specific methods via base class reference
        System.out.println("\n===== TYPE CASTING =====");
        for (LibraryMedia media : mediaArray) {
            if (media instanceof Book) {
                // Cast and call the method specific to Book
                Book b = (Book) media;
                b.checkNumberOfPages();
                // Alternatively, use one-liner cast:
                // ((Book) media).checkNumberOfPages();
            } else if (media instanceof Movie) {
                // Cast and call the method specific to Movie
                ((Movie) media).checkDuration();
            }
        }
    }

}