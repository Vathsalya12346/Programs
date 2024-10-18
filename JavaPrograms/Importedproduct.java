
class Product {
    protected String name;
    protected double basePrice;

    
    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    
    public void setPrice(double basePrice) {
        this.basePrice = basePrice;
    }

    
    public void print() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: " + basePrice);
    }

    
    public double getNetPrice() {
        return basePrice;
    }
}


class ImportedProduct extends Product {
    private double importDuty; 

    
    public ImportedProduct(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    
    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    
    @Override
    public double getNetPrice() {
        return basePrice + (basePrice * importDuty / 100);
    }

    
    @Override
    public void print() {
        super.print();
        System.out.println("Import Duty: " + importDuty + "%");
        System.out.println("Net Price (with import duty): " + getNetPrice());
    }
}


class DiscountedProduct extends Product {
    private double discountRate; 

   
    public DiscountedProduct(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }

   
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    
    @Override
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    
    @Override
    public void print() {
        super.print();
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Net Price (with discount): " + getNetPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        
        ImportedProduct importedProduct = new ImportedProduct("Laptop", 50000, 15);
        
        
        DiscountedProduct discountedProduct = new DiscountedProduct("Smartphone", 30000, 10);
        
        
        Product upcastedProduct = importedProduct; 
        System.out.println("Upcasting to Product (ImportedProduct):");
        upcastedProduct.print(); 
        
        System.out.println();
        
        
        if (upcastedProduct instanceof ImportedProduct) {
            ImportedProduct downcastedProduct = (ImportedProduct) upcastedProduct;
            System.out.println("Downcasting back to ImportedProduct:");
            downcastedProduct.print(); 
        }
        
        System.out.println();
        
        
        System.out.println("Discounted Product:");
        discountedProduct.print();
    }
}
