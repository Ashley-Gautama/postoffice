package nl.hva.ict.postkantoor.models;
/**
 * 
 * @author Ashley
 *programma dat postsorteren simuleert
 */
public class Brief extends Post {
	

	public Brief(int gewicht, boolean aangetekend, NAW naw) {
		super(gewicht, aangetekend, naw);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public double berekenPrijs() {
		double prijsBrief=0;
		if(this.isAangetekend()) {
			prijsBrief=8.15;
			
		}
		else if(this.getGewicht()<=20) {
			prijsBrief=0.73;
			
		}
		
		else if (this.getGewicht()>20 && this.getGewicht()<=100) {
			prijsBrief=2.00;
		}
		
		else if(this.getGewicht() >100) {
			prijsBrief=3.00;
		}
		// TODO Auto-generated method stub
		return prijsBrief;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BRIEF"+super.toString()+ "\n";
	}
	
	
	

}
