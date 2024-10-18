import java.util.Scanner;
public class LargestFactor{
    public static void main(String[]args){
        Scanner Scanner=new Scanner(System.in);

        System.out.println("Enter the number:");
        int number=Scanner.nextInt();

        int LargestFactor=1;

        for(int i=number/2;i>=1;i--){
            if(number%i==0){
                LargestFactor=i;
                break;
        
            }
        }
        if(LargestFactor==1 && number!=1){
            System.out.println("The only factor of"+number+"is itself");
        }else{
            System.out.printf("The largest factor of"+number+"is:"+LargestFactor);
            }
    }
}