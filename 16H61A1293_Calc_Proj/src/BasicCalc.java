import java.util.Scanner;

 public class BasicCalc
{
	public int a,b,c,ch,res;
	public BasicCalc()
        {
		a=0;
		b=0;
		c=0;
		ch=0;
		res=0;
	}
	
	public void menu()
        {
		System.out.println("**********************");
		System.out.println("*********menu*********");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
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
    	System.out.println("enter the 2nd number");
    	b=s.nextInt();	
    	
    }

    public void performOperation()
{
    	
        switch(ch)
        {
        case 1: res=add();
        		System.out.println(res);
        		break;
        case 2: res=subtract();
        		System.out.println(res);
        		break;
        case 3: res=multiply();
        		System.out.println(res);
        		break;
        case 4: res=divide();
				System.out.println(res);
				break;		
        }
       
}  
    
   
	int add()
	{
		c=a+b;
		return c;
	}
	
	int subtract()
	{
		c=a-b;
		return c;
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
	}
	
}
