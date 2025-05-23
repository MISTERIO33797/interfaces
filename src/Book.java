public class Book implements MediaItem, Rentable {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean available;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() { return title; }
    public int getYear() { return year; }
    public String getDisplayString() {
        return "Book: " + title + " by " + author + " (" + year + ") ISBN: " + isbn;
    }

    public boolean isAvailable() { return available; }
    public boolean rent() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }
    public void returnItem() {
        available = true;
    }
}
