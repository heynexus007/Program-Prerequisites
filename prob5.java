//Volume of a Cylinder
import java.util.*;
public class capgWork {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        System.out.print("Enter Radius : ");
        double rad=ip.nextDouble();

        System.out.print("Enter Heigth : ");
        double heigth=ip.nextDouble();
        
        double Volm = Math.PI * Math.pow(rad,2) * heigth;
 
        System.out.println(Volm);
    }
}