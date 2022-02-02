package demo;
class MethodOverloading{
	public void area(int side)
	{
		int result=side*side;
		System.out.println("Area of square is"+result);
		
	}
	public void area(int length,int breadth){
		int result=length*breadth;
		System.out.println("Area of Rectangle is "+result);
		
	}
	public void area (double pi,int r){
		pi=3.14;
		double result=pi*r*r;
		System.out.println("Area of circle is "+result);
	}
	public void add (int a,int b,double c,double d){ 
		double result=a+b+c+d;
		System.out.println("Addition of 4 numbers "+result);
	}
	public static void main (String []args){
		MethodOverloading obj=new MethodOverloading();
		obj.area(8);
		obj.area(12,6);
		obj.area(3.14,5);
		obj.add(34,44,34.4,44.4);
	}
}