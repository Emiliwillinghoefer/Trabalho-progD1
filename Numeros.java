class Numeros{
	public int dia;
	public int ano;
	public int horas;
	public int minutos;

	public Numeros(){

	}

	public void verificaAmPm(int a){
		if (a > 12){
			System.out.print("PM: Pós meio-dia\n");
		}
		if (a < 12){
			System.out.print("AM: Antes meio-dia\n");
		}
	}		
}