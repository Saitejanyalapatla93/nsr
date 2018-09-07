import java.util.Scanner;
public class  StatisticalCalc extends BasicCalc{
	double  res,sum=0,t;
	int n,i,j,x;
	public  Double no_array[];
	public void menu()
	{
		System.out.println("**********************");
		System.out.println("*********menu*********");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.mean");
		System.out.println("6.median");
		System.out.println("7.mode");
		System.out.println("8.exit");
		System.out.println("**********************");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
	}

    public void userInputs()
    {
    	
    	Scanner s1=new Scanner(System.in);
   	 
		if((ch==5)||(ch==6)||(ch==7))
		{
			System.out.println("enter the array size");
		n=s1.nextInt();
		 no_array=new Double[n];
        System.out.println("enter the elements in array");
    	for( i=0;i<n;i++)
    	   no_array[i]=s1.nextDouble();
    	for(i=0;i<n;i++)
    		 System.out.println(" elements"+no_array[i]);
    	}
		else
		{
			System.out.println("enter the 1st number");
	     	a=s1.nextInt();
	     	if(ch!=6 && ch!=7){
	     	System.out.println("enter the 2nd number");
	     	b=s1.nextInt();
	     	}
		}}

    public void performOperation(){    	
    		switch(ch)
    		{
    		case 1:
    		case 2:
    		case 3:
    		case 4:
    			 super.performOperation();
    			 break;
    		 case 5: res=mean();
     		System.out.println(res);
     		break;
     case 6: res=median();
     		System.out.println(res);
     		break;
     case 7: res=mode();
     		System.out.println(res);
     		break;
     case 8:
				System.out.println("bye");
				break;		
    	}
       
    }
    
	double mean()
	{
		System.out.println("mean");
		for(i=0;i<n;i++)
			sum=sum+no_array[i];
		sum=sum/n;
		return sum;
		
	}
	
	double median()
	{
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(no_array[i]>no_array[j])
				{
					t=no_array[i];
					no_array[i]=no_array[j];
					no_array[j]=t;
				}
			}
		}
		if((n%2)!=0){
			x=(n+1)/2;
			sum=no_array[x-1];
		}
		else{
			x=n/2;
			sum=no_array[x-1]+no_array[x];
			sum=sum/2;
		}
		return sum;
	}
	double mode ()
	{
		int maxc=0;
		double maxv=no_array[0];
		
		for(i=0;i<n;i++)
		{
			double value;
		    value=no_array[i];
		
			int count=1;
			for(j=0;j<n;j++)
				
			{
				if(no_array[j]==value)
					count++;
				
			
			if(count>maxc){
				maxc=count;
				maxv=no_array[i];
			}
		}}
		return maxv;
	}
}