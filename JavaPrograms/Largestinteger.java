import java.util.Scanner;
public class Largestinteger{
    public static int findLargest(int[]numbers){  //call function
        int Largest = numbers[0];
        for(int i =1;i<numbers.length;i++){
            if(numbers[i]>Largest){
                Largest=numbers[i];
            }
        }
        return Largest;
    }
public static void main(String[]args){
    Scanner Scanner=new Scanner(System.in);

    System.out.print("Enter the number of integers:");
    int size=   Scanner.nextInt();

    int[]numbers=new int [size];
    System.out.print("Enter the"+size+"integers:");

    for(int i=0;i<size;i++){
        System.out.println("Element"+(i+1)+":");
        numbers[i]=Scanner.nextInt();
    }
    int Largestinteger=findLargest(numbers);
    System.out.println("The largest integer is"+Largestinteger);   
    }
}