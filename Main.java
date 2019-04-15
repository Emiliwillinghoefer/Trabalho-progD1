import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Numeros a=new Numeros();
		Scanner s = new Scanner(System.in);
		System.out.print("Dia:");
		a.dia = s.nextInt();
		System.out.print("Mês:");
		a.ano = s.nextInt();
		System.out.print("Horas:");
		a.horas = s.nextDouble();
		//System.out.print("Minutos:");
		//a.minutos = s.nextInt();
		//System.out.print("Segundos: ");
		//a.segundos = s.nextInt();

		a.verificaAmPm(a.horas);
		a.difSeg(s.nextDouble(), s.nextDouble());
	}
	
}