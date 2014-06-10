package programaciondinamica;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(Fibo(40));
	}
	
	public static int Fibo(int n){
		if(n==1 || n==2)
			return 1;
		return Fibo(n-1)+Fibo(n-2);
	}
}
