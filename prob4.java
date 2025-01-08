import java.util.*;
//Area of a Circle
public class prob4 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        double rad=ip.nextDouble();
        double area=Math.PI * Math.pow(rad,2);
 
        System.out.println(area);
    }
}