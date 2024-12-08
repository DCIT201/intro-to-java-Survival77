
import java.util.Scanner;

public class  TemperatureConverter{
public static void main(String[]args)
    {
Scanner scan =new Scanner (System.in);
System.out.println("Enter 1 to convert from Celcius to Farenheit");
System.out.println("Enter 2 to convert from Farenheit to Celcius");
int choice = scanner.nextInt();

double temperature =0.0;
double converted =0.0;

if (choice==1){
    System.out.println("Enter the temperature in Celcius");
    temperature = scan.nextDouble();
    Converted = 9/5.0* temperature +32;
    System.out.println("Temperature in Farenheit=+ converted");
}
/**Using the if, if else and else as a loop to give conditions in executing the code */
else if (choice==2){
    System.out.println("Enter the temperature in Farenheit");
    temperature = scan.nextDouble();k
    Converted = 9/5.0* (temperature -32);
    System.out.println("Temperature in Farenheit=+ converted");
}
else {

system.out.println("Invalid choice");

}
}
}

