package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner S= new Scanner(System.in);
	System.out.printf("Unesite broj n: ");
	int n;
	n=S.nextInt();
	for(int i=1; i<=n; i++){
	   // int suma=0;
	    if(i%sumaCifara(i)==0) System.out.println(i);
    }

    }

    private static int sumaCifara(int i) {
        int suma=0;
        do {
            suma+=i%10;
            i=i/10;

        }while(i!=0);
        return suma;

    }
}
