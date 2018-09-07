import java.util.Scanner;
import java.lang.Math;

public class ScientificCalc extends BasicCalc{
	double res,val,x;
	
	public void menu(){
		System.out.println("**********************");
		System.out.println("*********menu*********");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.powerof");
		System.out.println("6.Square root of");
		System.out.println("7.Sinof");
		System.out.println("**********************");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
  	
	}

  public void userInputs()
  {
	  Scanner s=new Scanner(System.in);
	 System.out.println("enter the 1st number");
  	a=s.nextInt();
  	if(ch!=6 && ch!=7){
  	System.out.println("enter the 2nd number");
  	b=s.nextInt();
	 }
	 
  }

  public void performOperation(){
  
  		 switch(ch)
         {
  		 	case 1:
  		 	case 2:
  		 	case 3:
  		 	case 4:	
  		 		super.performOperation();
  		 		break;
  		 		
         case 5: res=pwrof();
         		System.out.println(res);
         		break;
         case 6: res=sqrtof();
         		System.out.println(res);
         		break;
         case 7: res=sineof();
         		System.out.println(res);
         		break;
         default:
 				System.out.println("enter valid number");
 				break;		
         }
  	}
      
  
  
	double pwrof()
	{
		val=Math.pow(a, b);
		return val;
	}
	
	double sqrtof()
	{
		val=Math.sqrt(a);
		return val;
	}

	double sineof()
	{
		x=Math.toRadians(a);
		val=Math.sin(x);
		return val;
	}
}