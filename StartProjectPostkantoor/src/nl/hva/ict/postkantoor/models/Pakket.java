package nl.hva.ict.postkantoor.models;

public class Pakket extends Post {
	private boolean pastInBrievenbus;


	public Pakket( boolean pastInBrievenbus,int gewicht, boolean aangetekend, NAW naw) {
		super(gewicht, aangetekend, naw);
		this.pastInBrievenbus = pastInBrievenbus;
	}


	@Override
	public double berekenPrijs() {
		// TODO Auto-generated method stub
		double prijsPakket=0;
		if(super.isAangetekend() && this.pastInBrievenbus) {
			prijsPakket=8.15;

		}

		else if (super.isAangetekend()==false && this.pastInBrievenbus) {
			prijsPakket=3.95;
		}

		else if(super.isAangetekend() && this.pastInBrievenbus==false && this.getGewicht()<=10000) {
			prijsPakket=8.60;

		}
		
		else if(super.isAangetekend()==false && this.pastInBrievenbus==false && this.getGewicht()<=10000) {
			prijsPakket=6.95;

		}

		else if(super.isAangetekend() && this.pastInBrievenbus==false && this.getGewicht()>10000) {
			prijsPakket=14.90;
		}


		else if(super.isAangetekend()==false && this.pastInBrievenbus==false && this.getGewicht()>10000) {
			prijsPakket=13.25;
		}


		// TODO Auto-generated method stub
		return prijsPakket;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PAKKET"+super.toString()+ "\n";
	}



}
