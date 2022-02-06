package somu.com;

public class Sample {
	int a=10;
	int b=20;
	int c=1+a+b;
	
	static int add() {
	int a1=	5;
	int b1= 6;
	int c1=a1+b1;
	//System.out.println(c1);
	return c1;
    }
	void sub() {
	 int d=a-b;
	 int e=c-d;
	 int f=d-e;
	 System.out.println(f-c);
	}

public static void main(String args[]) {
	Sample s=new Sample();
	System.out.println(add());
	s.sub();
	System.out.println(s.c);
	System.out.println(s.a);

}
}
