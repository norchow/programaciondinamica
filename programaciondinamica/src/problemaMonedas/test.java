package problemaMonedas;
import java.util.Scanner;

public class test
{
	public static int valores[] = {1,4,6};
	public static int cant[]= {0,0,0};
	
	public static void main(String[] args){
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese monto:");
		
		int monto=scanner.nextInt();
		
		calcularVuelto(monto);
		cambio vuelto = new cambio(monto, valores);
		imprimirCantidades(vuelto.getVectorSeleccion());
	}

	public static void calcularVuelto(int monto){		
		for(int c=cant.length-1;c>=0;){
			if (monto>=valores[c]){
				cant[c]++;
				monto=monto-valores[c];
			}
			else
				c--;
		}
	}
	
	public static void imprimirCantidades(int []vuelto){		
		System.out.println("Primera forma");
		for(int c=0;c<cant.length;c++){
			System.out.println("Billetes de "+valores[c]+":"+cant[c]);
		}
		System.out.println("----------------------");
		System.out.println("Segunda forma");
		for(int c=0;c<cant.length;c++){
			System.out.println("Billetes de "+valores[c]+":"+vuelto[c]);
		}
	}
}
