public class Table{
    public static void main(String[]args){
        int number=10;
        int length=15;
        System.out.println("Multiplication of table:"+number);
        System.out.println("-------------------------");
        for(int i=1;i<=length;i++){
            System.out.printf("%2d * %2d = %3d%n", number,i,number*i);
        }   
    }
}