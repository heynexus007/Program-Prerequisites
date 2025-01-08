//Convert Kilometers to Miles
import java.util.*;
public class problem9 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        double Kilometers=ip.nextDouble();
        int Miles= Kilometers * 0.621371;
 
        System.out.println(Miles);
    }
}