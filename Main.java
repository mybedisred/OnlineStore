//Author: Spencer Gilcrest
//Date: 10/2/25
//This is the main class and it tests my Online Store. It tests each of the things the online store can do
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store store = new Store();
        Author spencer = new Author("Spencer Gilcrest", "7/23/2007");

        Book spencerbook = new Book("Spencers Authobiography", 14.99, "10/2/2025", spencer, "WJHS");
        Movie spencermovie = new Movie("Documentary of Spencer", 24.99, "9/2/2025", "Spencer Gilcrest", 200);

        store.addItem(spencerbook);
        store.addItem(spencermovie);

        store.showItems();
        store.creator(spencerbook);
        store.sellItem(spencermovie);
        store.showItems();

        System.out.println("Profit: $" + store.getProfit());
        
     }
}
