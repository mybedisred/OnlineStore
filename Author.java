//Author: Spencer Gilcrest
//Date: 10/2/25
//This class allows you to make the Author of a book
public class Author
{
    //instance variables
    private String authorName;
    private String dateOfBirth;

    //constructor
    public Author(String authorName, String dateOfBirth){
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
    }

    //getters and setters 
    public String getName(){
        return authorName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String toString(){
        return authorName + "is the author and was born on " + dateOfBirth;
    }
}
