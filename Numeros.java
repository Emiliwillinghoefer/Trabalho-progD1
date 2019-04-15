class Numeros{
	public int dia;
	public int ano;
	public double horas;
	//public int minutos;
	public int segundos;


	public void verificaAmPm(double a){
		if (a > 12){
			System.out.print("\nDia= "+this.dia+"\nAno= "+this.ano+"\nHoras= "+this.horas+" PM Pós meio-dia\n");
		}
		if (a < 12){
			System.out.print("\nDia= "+this.dia+"\nAno= "+this.ano+"\nHoras= "+this.horas+"AM Antes meio-dia\n");
		}
	}
	public void difSeg(double b, double d){
		double dife;
		dife = (b - d);
		dife *= 3600;
		System.out.println("Diferenca entre b e d em seg "+dife);
	}
		
}
