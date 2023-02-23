package week1.examples;

public class ExamplesAboutOperators {
	public static void main(String[] args) {

		int a=8;
	    
		double b=99.7;
		double c=5;
		
		
		System.out.println("a:"+a);
		a=a+2;//a=10
		a+=10; //a=a+10 (a=20)
		a++;//a=a+1
		a/=7;//a=a/7
		
		System.out.println("a:"+a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(100%3);
		
		int x=(int)b;
		System.out.println("x:"+x);
		double y=b;
		double z=a;
		
		System.out.println("z:"+z);
		int number1=31;
		int number2=6;
		double result=(double)number1/number2 ;
		System.out.println(result);
		//5.1666
		
		// * / %
		
		double data=1672.98916;
		System.out.println(data*100);
		double data1=data*100;
		System.out.println(data1);//returns 167298.916
		
		int data2=(int)data1;//return 167298
		System.out.println(data2);
		double data3=data2/100.0;
		System.out.println(data3);
		
		
		
		//1672.98
		
		
		
	}
}
