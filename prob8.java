//Power Calculation
import java.util.*;
public class prob4 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int base=ip.nextDouble();
        int expo=ip.nextDouble();
		
		double res= Math.pow(base,expo);
 
        System.out.println(res);
    }
}