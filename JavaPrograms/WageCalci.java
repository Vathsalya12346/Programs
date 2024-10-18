import java.util.Scanner;
public class WageCalci{
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week:");
        int dayofWeek=Scanner.nextInt();

        System.out.print("Enter number of hours worked:");
        int hoursWorked=Scanner.nextInt();

        int Wageperhour=0;

        switch(dayofWeek){
            case 1:
            case 2:
            case 3:
                Wageperhour=200;
                break;
            case 4:
            case 5:
                Wageperhour=400;
                break;
            case 6:
                Wageperhour=600;
                break;
            case 7:
                Wageperhour=800;
                break;
            default:
            System.out.println("Invalid day!,Enter number between 1 to 7");
            return;
        } 
        int Totalwage=Wageperhour*hoursWorked;
        
        if (Totalwage>2000){
            Totalwage += Totalwage*0.10;
        }
        System.out.println(Totalwage);

    }
}