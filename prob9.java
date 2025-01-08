//Calculate Average of Three Numbers
import java.util.*;
public class problem9 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num1=ip.nextInt();
        int num2=ip.nextInt();
		int num3=ip.nextInt();
		
		double avg= (num1+num2+num3)/3 ;
 
        System.out.println(avg);
    }
}