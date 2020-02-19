package epam.com.Interest;
import java.util.*;
public class App
{
    public static void main( String[] args ){
    	Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Option:\n1.Calculate Interest\n2.Estimate House Construction Cost");
        int option=in.nextInt();
        while(option<1 || option>2) {
        	System.out.println("Enter a valid option\n");
        	option=in.nextInt();
        }
        if(option==1) {
        	System.out.print("Enter Principle Amount : ");
        	double p=in.nextDouble();
        	System.out.print("Enter Rate Of Interest : ");
        	double r=in.nextDouble();
        	System.out.print("Enter Time Taken : ");
        	double t=in.nextDouble();
        	System.out.println("Enter your type:\n1 Simple Interest\n2 Compound Interest");
        	int type=in.nextInt();
        	switch(type) {
        		case(1):
        			Simple s=new Simple(p,t,r);
        			System.out.println("SIMPLE INTEREST : "+ s.cal()+"INR");
        			break;
        		case(2):
        			Compound c=new Compound(p,t,r);
        			System.out.println("COMPOUND INTEREST : "+c.cal()+"INR");
        			break;
        	}
        }
        else {
        	System.out.println("Enter Area Of The House : ");
        	double area=in.nextDouble();
        	System.out.println("Enter Material Standards you need : ");
        	System.out.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int op=in.nextInt();
        	House h=new House(area,op);
        	System.out.println("TOTAL COST : "+h.total() +"INR");
        }
        in.close();
    }
}