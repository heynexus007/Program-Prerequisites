import java.util.*;
//Simple Interest
public class prob4 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        double P=ip.nextDouble();
        double R=ip.nextDouble();
		double T=ip.nextDouble();
		
		double SimpleInterest= (P*R*T)/100;
 
        System.out.println(SimpleInterest);
    }
}