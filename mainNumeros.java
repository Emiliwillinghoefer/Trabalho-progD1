import java.util.Scanner;

class mainNumeros{

	public static void main(String[]args){

		Scanner s = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros: ");
		int qtd = s.nextInt();


		int vetor[] = new int[qtd];
	
		for(int i=0; i<=qtd-1; i++){

			int numero = s.nextInt();
			vetor[i] = numero;

		}
		int menor = vetor[0];
		int maior = vetor[0];
		int cont = 0;
		int media = 0;

		for(int num=0; num < vetor.length; num++){
			cont += 1;
			media += vetor[num];

			if(vetor[num] < menor){
				menor = vetor[num];
			}
			if(vetor[num] > maior){
				maior = vetor[num];
			}
		}

		System.out.println("Maior = "+maior);
		System.out.println("Menor = "+menor);
		float result = media/cont;
		System.out.println("Media = "+result);
	}
	
}