import java.util.Scanner;
public class U51{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
			
			int[] vector;
			int contarNegativos;
			
			contarNegativos=0;
			
			vector=new int[5];
			
			System.out.println("Introduce 5 número enteros: ");
			for(int i=0;i<5;i++){
				vector[i]=teclado.nextInt();
				if (vector[i]<0){
					contarNegativos++;
				}
			}
			System.out.println("La cantidad de numeros negativos en el vector es de: "+contarNegativos);
	}
}