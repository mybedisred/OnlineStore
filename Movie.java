//Author: Spencer Gilcrest
//Date: 10/2/25
//This class allows you to make a movie item. it extends the abstract class ItemForSale
public class Movie extends ItemForSale
{
    //instance variables
    private String director;
    private int duration;

    //constructor
    public Movie(String name, double price, String dateOnSale, String director, int duration){
        super(name, price, dateOnSale);
        this.director = director;
        this.duration = duration;
    }

    //getters and setters
    public String getCreator(){
        return "Director: " + director;
    }

    public String getDirector(){
        return director;
    }

    public int getDuration(){
        return duration;
    }

    public String toString(){
        return "Movie: " + super.toString() + ", Duration: " + duration + " minutes";
    }

    

}
