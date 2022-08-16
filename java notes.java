    // How to print in java Programming 
class Prince 
{
    public static void main (String args [])
    {
        System.out.println("hello world");
    }
}
    
	
	//Getting input from user 


import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
    	System.out.println("enter the integer value :");
    	Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("you entered the integer value :"+a);
    }
}
    
	
	//Arithematic operator in java 



class prime
{
    public static void main(String args[])
    {
    	int a= 5;
    	int b = 4 ;
    	int c1 = a+b;
    	int c2 = a-b;
    	int c3 = a/b;
    	int c4 = a*b;
    	int c5 = a%b;
    	System.out.println("Addition :"+c1);
    	System.out.println("Substraction :"+c2);
    	System.out.println("devision :"+c3);
    	System.out.println("multiplication:"+c4);
    	System.out.println("modulus :"+c5);

    }
}


	// Relational operator 
	
	
class prime
{
    public static void main(String args[])
    {
    	int a= 5;
    	int b = 4 ;
    	boolean c= (a>b);
    	System.out.println("Result :"+c);
    }
}
		/* 
		some relational operator 
		1 >  greater than
		2 <  less than
		3 >= greater than equal to
		4 <= less than equal to
		5 != not equal to 				
		6 == equal to 
		*/


	//Logical operator 
	
		/*
		&&(Logical and) if any of the value is false the boolean is false 
		||(logical or ) if any of the value is true the bollean is true
		! (Logical not) true to false 
		*/
		
	
class prime
{
    public static void main(String args[])
    {
    	int a= 30;
    	int b = 20;
    	int c= 40;
    	boolean d1= (a>b)&&(a>c);
		boolean d2= (a>b)||(a>c);
		boolean d3= !(a>c);
    	System.out.println("Result :"+d1);
		System.out.println("Result :"+d2);
		System.out.println("Result :"+d3);
    }
}


	// Some other operator in java
	
		/*
		++a incerment a by 1 then use new value of a
		a++ first use the value of a then increment by 1
		--a decrement a by 1 then use new value of a
		a-- first use the value of a then decrement by 1
		a+=10   a=a+10
		a-=10	a=a-10
		a*=10	a=a*10
		a/=10	a=a/10
		a%=10	a=a%10
		*/
		
	// if , else if and else Statement
	
	
class prime
{
    public static void main(String args[])
    {
    	int a= 30;
    	int b = 20;
    	int c= 40;
    	if (a>b)
    	{
		System.out.println("Result :"+a);
    	}
    	else if (b>c)
    	{
    		System.out.println("Result :"+a);
    	}
    	else
    		System.out.println("Result :"+b);
    }
}


	// Nested if statement 
	
	
		/* if statement inside a if statement is refer to nested if */
		
class prime
	{
    public static void main(String args[])
		{
    	int a= 50;
    	int b = 20;
    	int c= 40;
    	if (a>b)
    	{
    		if (a>c) 
    		{
    			System.out.println("Biggest no is "+a);
    		}	
   		}
    	else
    	System.out.println("biggest no is not :"+a);
  	}
}



	// loops in java progarmming (While)


class prime
{
    public static void main(String args[])
    {
    	int i=0;   			// initialization
    	while (i<=10) 		// condition
    	{
    		System.out.println(i);
    		i++;			// increment or decrement
    	}
  	}
}



	 /* second code */
	
	
import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner( System.in);
    	System.out.println("enter 0 to Exit the program:");
    	while(true) 
    	{
    		System.out.println("Enter any integer values :");
    		int i = sc.nextInt();
    		if (i==0) 
    		{
    			System.out.println("Program exit ");
    			break ;
    		}
    		System.out.println("you entered the value "+i);
    	}
  	}
}



	// do while loop
	
	
class prime
{
    public static void main(String args[])
    {
    	int i=0;   			// initialization
    	do 		// condition
    	{
    		System.out.println(i);
    		i++;			// increment or decrement
    	}while (i<10);
  	}
}


import java.util.Scanner;
class Hello
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner( System.in);
    	int i ;
    	System.out.println("enter 0 to Exit the program:");
    	do 
    	{
    		System.out.println("enter any integer value :");
    		i = sc.nextInt();
    		System.out.println("you entered :"+i);
    	}while (i !=0);
  	}
}


	
	// For Loop 
	
	

class java_notes 
{
    public static void main(String args[])
    {
    	for (int i=1 ; i<10 ; i++) 
    	{
    		System.out.println(i);
    	}
  	}
}


	// Nested For Loop 
	
	

class java_notes 
{
    public static void main(String args[])
    {
    	for (int i=1 ; i<8 ; i++) 
    	{
    		for (int j=3 ; j<6; j++) 
    		{
    			System.out.print(i);
    		}
			System.out.print("\n");
    	}
  	}
}
