public class LibraryMedia {
    protected String title;
    protected int publicationYear;
    protected boolean available;

    public LibraryMedia(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        available = true;
    }


    public void borrow() {
        if (available) {
            System.out.println("This media is available");
            available = false;
        } else {
            System.out.println("This media is not available");
        }
    }

    public void returnMedia() {
        if (!available) {
            System.out.println("Thanks for returning the media");
            available = true;
        } else {
            System.out.println("This media was not borrowed");
        }
    }

    public void displayInformation() {
        System.out.println("Title: " + title + " \n Publication year: " + publicationYear + (available ? " \nAvailable" : " \nNot Available"));
    }

}