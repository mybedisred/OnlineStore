//Author: Spencer Gilcrest
//Date: 10/2/25
//This class allows you to make a book. It extends the parent class ItemForSale
public class Book extends ItemForSale
{
    //instance variables
    private Author author;
    private String publisher;

    //contructor
    public Book(String name, double price, String dateOnSale, Author author, String publisher){
        super(name, price, dateOnSale);
        this.author = author;
        this.publisher = publisher;
    }

    //getters and setters
    public String getCreator(){
        return author.toString();
    }

    public String getPublisher(){
        return publisher;
    }

    public String toString(){
        return "Book: " + super.toString() + ", Publisher: " + publisher;
    }

}
