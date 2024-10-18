//Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
//Methods are:  init(prod_id,prod_name, price)
                // getNetPrice() (returns the price after adding 12% tax)
                 //purchase()
                //sell()
                //display all product details
public class Product{
    //store product details
    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;

//initialize methods(this)
public Product(int prod_id,String prod_name,double price){
    this.prod_id=prod_id;
    this.prod_name=prod_name;
    this.price = price;
    this.quantity_on_hand=0;//default
}
//get netprice
public double getNetPrice(){
    return price+(price*0.12);
}
//purchase
public void purchase(int quantity){
    if(quantity>0){
        quantity=quantity_on_hand+quantity;
        System.out.println(quantity+"units purchased.updated stock:"+quantity_on_hand);
    }else{
        System.out.println("Invalid!quantity to purchase");
    }
}
//sell
public void sell(int quantity){
    if(quantity>0 && quantity<=quantity_on_hand){
        quantity_on_hand-=quantity;
        System.out.println(quantity+"units sold.remaining stock:"+quantity_on_hand);
    }else if(quantity>quantity_on_hand){
        System.out.println("Not enough stock to sell"+quantity);
    }else{
        System.out.println("ivalid number of products to sell");
    }
}
//display product details
public void displayProductDetails(){
    System.out.println("prod_id"+prod_id);
    System.out.println("prod_name"+prod_name);
    System.out.println("price"+price);
    System.out.println("quantity_on_hand"+quantity_on_hand);
    System.out.println("Net price"+getNetPrice());
}
public static void main(String[]args){
    Product Product=new Product(101,"Laptop",50000);
    Product.displayProductDetails();
    Product.purchase(10);
    Product.sell(3);
    Product.displayProductDetails();
}
}

