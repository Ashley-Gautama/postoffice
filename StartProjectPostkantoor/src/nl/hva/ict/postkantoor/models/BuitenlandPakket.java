package nl.hva.ict.postkantoor.models;

public class BuitenlandPakket extends Pakket {
	private boolean inEuropa;

	public BuitenlandPakket(boolean inEuropa,boolean pastInBrievenbus, int gewicht, boolean aangetekend, NAW naw) {
		super(pastInBrievenbus, gewicht, aangetekend, naw);
		this.inEuropa = inEuropa;
	}

	@Override
	public double berekenPrijs() {
		double prijsBuitenlandpakket=0;
		// TODO Auto-generated method stub
		 if(this.inEuropa) {
			 prijsBuitenlandpakket=super.berekenPrijs() +10;
			 System.out.println(prijsBuitenlandpakket);
			 
		 }
		 
		 else {
			 prijsBuitenlandpakket=super.berekenPrijs() *5;

		 }
		 
		 return prijsBuitenlandpakket;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
