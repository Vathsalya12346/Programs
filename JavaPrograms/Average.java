import java.util.Scanner;
public class Average{
    public static void main(String[]args){
        Scanner Scanner =new Scanner(System.in);

        double sum=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter the number"+i+":");
            double number=Scanner.nextInt();
            sum+=number;
        }
        double Average = sum/5;
        System.out.printf("The Average of the entered numbers is: %2f%n",Average);
    }
}