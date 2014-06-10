package programaciondinamica;

public class FibonacciPD {
	
	private static int[] tabla = new int[40];
	
	public static void main(String[] args) {
		for(int i = 0; i<40;i++){
			tabla[i]=0;
		}
		
		System.out.println(Fibo(40));
	}
	
	public static int Fibo(int n){
		if(tabla[n-1]!=0)
			return tabla[n-1];
		
		if(n==1 || n==2){
			tabla[n-1] = 1;
			return tabla[n-1];
		}
		
		tabla[n-1] = Fibo(n-1)+Fibo(n-2);
		return tabla[n-1];
		
	}
}
