package lambda;
interface Interface1{  //1
	void absfun(int x,int y,int z);       //abstarct method
	default void fun1() {       //non abstract method
		System.out.println("this is fun1");
	}
	default void fun2() {
		System.out.println("this is fun2");
	}
}
public class MyClass {  //2

	public static void main(String[] args) {
	     Interface1 fobj=(int x, int y, int z) -> System.out.println(x*y*z);
	     fobj.absfun(3, 2, 4);
	     fobj.absfun(5, 1, 4);
	     fobj.absfun(4, 7, 9);
	     System.out.println("================");
	     fobj.fun1();
	     fobj.fun2();
	}

}
