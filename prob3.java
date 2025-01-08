//Celsius to Fahrenheit Conversion
import java.util.*;
public class prob3 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        System.out.print("Enter temperature in Celsius : ");
        int tempC=ip.nextInt();
        Double fTemp= (tempC * (9/5))+32;
 
        System.out.println("Fahrenheit temperature : "+ fTemp);
    }
}