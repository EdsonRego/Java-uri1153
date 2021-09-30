import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Fatorial = 1;
		
		for(int i = 1; i <= N ; i++) {
			Fatorial = Fatorial * i;
		}
		System.out.println(Fatorial);
		sc.close();
	}

}
