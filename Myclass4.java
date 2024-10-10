package lambda;
interface Interface4{
	void check(int x);
}
public class Myclass4 {
	public static void main(String[] args) {
		Interface4 fobj=(int x) ->{
			if(x%2==0) {
				System.out.println("number is even");
				
			}else {
				System.out.println("number is odd");
			}
		};
		fobj.check(8);
	}
}
