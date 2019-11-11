package calculator;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res, num1, num2;
		double resdiv;
		num1 = 30;
		num2 = 10;
		
		Calc c = new Calc(); // initialize object
		
		// call add function
		res = c.add(num1, num2);
		System.out.println("Result of Add is:" + res);
		
		// call sub function
		res = c.sub(num1, num2);
		System.out.println("Result of Sub is:" + res); 
		
		// call div function
		res = c.div(num1, num2);
		System.out.println("Result of Div is:" + res); 
		
		// call multiply function
		res = c.multiply(num1, num2);
		System.out.println("Result of multiply is:" + res); 
	}
	
	public  int add(int a, int b) {
		int c= a+b;
		return c;
	}
	
	public int sub (int a, int b){
		int c ;
		if (a>b) {
			c = a-b;
		}
		else{
			c= b-a;
		}
		return c;
	}
	
	public int div (int a, int b){
		return a/b;
	}	
	
	public int multiply (int a, int b){
		return a*b;
	}	
}
