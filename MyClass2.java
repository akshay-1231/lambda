package lambda;
interface Interface2{
void absfun(int x);
default void fun1() {
	System.out.println("this is fun1");
}
default void fun2() {
	System.out.println("this is fun2");
}
}
public class MyClass2 {

	public static void main(String[] args) {
		Interface2 fobj=(int x) -> System.out.println(x*x*x);
		   fobj.absfun(10);
		   fobj.absfun(6);
		   System.out.println("================");
		     fobj.fun1();
		     fobj.fun2();
	}

}

