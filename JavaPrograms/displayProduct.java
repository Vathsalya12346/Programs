public class Product{
    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;

    public Product(int prod_id,String prod_name,double price,int quantity_on_hand){
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
        this.quantity_on_hand=quantity_on_hand;
    }
    public Product(int prod_id,String prod_name,double price){
        this(prod_id,prod_name,price,0);
    }
    public Product(int prod_id,String prod_name){
        this(prod_id,prod_name,0.0,0);
    }
    public double getNetPrice(){
        return price+(price*0.12);
    }
    public void purchase(int quantity){
        if(quantity>0){
            quantity_on_hand += quantity;
            System.out.println(quantity + "units purchased.stock present" + quantity_on_hand);
        }else{
            System.out.println("Invalid!");
        }
    }
    public void sell(int quantity){
        if(quantity>0 && quantity<=quantity_on_hand){
            System.out.println(quantity + "units sold.updated stock" + quantity_on_hand);
        }else if(quantity>quantity_on_hand){
            System.out.println("not enogh stock to sell");
        }else{
            System.out.println("Invalid");
        }
    }
    public void displayProductDetails(){
        System.out.println("prod_id"+prod_id);
        System.out.println("prod_name"+prod_name);
        System.out.println("price"+price);
        System.out.println("quantity_on_hand"+quantity_on_hand);
        System.out.println("Net price"+getNetPrice());
    }
    public static void main(String[]args){
        Product Product1=new Product(101,"laptop",50000,10);
        Product1.displayProductDetails();

        Product Product2=new Product(102,"mobile",30000);
        Product2.displayProductDetails();
        Product2.purchase(5);
        Product2.sell(3);


        Product Product3=new Product(103,"tablet");
        Product3.displayProductDetails();
    }
}