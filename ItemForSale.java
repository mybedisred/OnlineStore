//Author: Spencer Gilcrest
//Date: 10/2/25
//This is an abstract class that provides the general info for an ItemForSale. More info can be added by classes that extend this one
abstract class ItemForSale
{
    //instance variables
    private String name;
    private double price;
    private String dateOnSale;

    //constructor
    public ItemForSale(String name, double price, String dateOnSale){
        this.name = name;
        this.price = price;
        this.dateOnSale = dateOnSale;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }

    public String getDateOnSale(){
        return dateOnSale;
    }
    public void setDateOnSale(String dos){
        dateOnSale = dos;
    }

    public abstract String getCreator();

    public String toString(){
        return name + " ($" + price + ")";
    }

}
