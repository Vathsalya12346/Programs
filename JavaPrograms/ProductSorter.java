import java.util.*;


class Product {
    private String name;
    private double price;

    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    
    @Override
    public String toString() {
        return "Product Name: " + name + ", Price: " + price;
    }
}


class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}


public class ProductSorter {
    public static void main(String[] args) {
        
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1000.0));
        productList.add(new Product("Smartphone", 800.0));
        productList.add(new Product("Tablet", 600.0));
        productList.add(new Product("Headphones", 200.0));

        
        System.out.println("Sorting by Product Name:");
        Collections.sort(productList, new ProductNameComparator());
        for (Product product : productList) {
            System.out.println(product);
        }

        
        System.out.println("\nSorting by Product Price:");
        Collections.sort(productList, new ProductPriceComparator());
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}