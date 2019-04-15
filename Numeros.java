class Numeros{
	public int dia;
	public int ano;
	public int horas;
	public int minutos;
	public int segundos;

	public Numeros(){

	}

	public void verificaAmPm(int a){
		if (a > 12){
			System.out.print("\nDia= "+this.dia+"\nAno= "+this.ano+"\nHoras= "+this.horas+":"+this.minutos+":"+this.segundos+" PM Pós meio-dia\n");
		}
		if (a < 12){
			System.out.print("\nDia= "+this.dia+"\nAno= "+this.ano+"\nHoras= "+this.horas+":"+this.minutos+":"+this.segundos+" AM Antes meio-dia\n");
		}
	}		
}