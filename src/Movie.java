import java.util.ArrayList;
import java.util.List;

public class Movie implements MediaItem, Rentable, Rateable {
    private String title;
    private String director;
    private int year;
    private int duration;
    private boolean available;
    private List<Integer> ratings;

    public Movie(String title, String director, int year, int duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;
        this.available = true;
        this.ratings = new ArrayList<>();
    }

    public String getTitle() { return title; }
    public int getYear() { return year; }
    public String getDisplayString() {
        return "Movie: " + title + " directed by " + director + " (" + year + ", " + duration + " min)";
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

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }
}
