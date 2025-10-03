import java.util.*;

//Author: Spencer Gilcrest
//Date: 10/2/25
//This class is the online store that keeps track of business. It allows you to make changes to your store by seeing inventory, selling items, and calculating profit
public class Store
{
  private double profit;
  private ArrayList<ItemForSale> items = new ArrayList<>();

  public Store(){
    this.profit = 0.0;
  }

  //precondition: items has been initialized
  //postcondition: adds item to items
  public void addItem(ItemForSale item){
    items.add(item);
  }

  //precondition: items has been intitialized
  //psotcondition: prints list of items
  public void showItems(){
    if (items.size() == 0){
      System.out.println("no items for sale");
    }
    else {
      for (ItemForSale item : items){
        System.out.println(item + ", ");
      }
    }
  }

  //precondition: items has been initialized
  //postcondition: adds price of item to profit and removes it from inventory
  public void sellItem(ItemForSale itemSold){
    if (items.contains(itemSold)){
      items.remove(itemSold);
      profit += itemSold.getPrice();
      System.out.println(itemSold.getName() + " was sold for $" + itemSold.getPrice());
    }
    else{
      System.out.println(itemSold.getName() + " not found");
    }
}
  //precondition: item has been initialized
  //post condition: gets the creator of the item
  public String creator(ItemForSale item){
    return item.getCreator();
  }

  public double getProfit(){
    return profit;
  }
}
