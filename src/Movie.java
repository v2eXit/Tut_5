public class Movie extends LibraryMedia {
    private String director;
    private int duration;

    Movie(String title, int publicationYear, String director, int duration) {
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Title: " + title + " \nPublication year: " + publicationYear + " \nDirector: " + director + " \nMovie duration: " + duration + (available ? " \nAvailable" : " \nNot Available"));
    }

    public void checkDuration(){
        if(duration >120){
            System.out.println("This is a ling movie which is " + duration + " minutes");
        }else{
            System.out.println("This is not a long movie which is " + duration + " minutes");
        }
    }

}