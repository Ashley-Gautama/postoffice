package nl.hva.ict.postkantoor.models;

public abstract class Post implements Comparable<Post> {
	public static final String EURO = "EUR";
	private NAW naw;
	private int gewicht;
	private boolean aangetekend;
	public Post( int gewicht, boolean aangetekend,NAW naw) {
		this.naw = naw;
		this.gewicht = gewicht;
		this.aangetekend = aangetekend;
	}

	public abstract double berekenPrijs();

	@Override
	public String toString() {

		String s="";
		if (this.aangetekend==true) {
			s="\nAANGETEKEND";

		}
		//		else {
		//			s+="\NBRIEF";
		//		}

		return s+=String.format("%n%s%s %.2f", this.naw,this.EURO,this.berekenPrijs());


	}

	public int getGewicht() {
		return gewicht;
	}

	public boolean isAangetekend() {
		return aangetekend;
	}

	public NAW getNaw() {
		return naw;
	}

	@Override
	public int compareTo(Post post) {
		int number=0;
		//sorteren
		if(this.naw.getPostcode()!=post.getNaw().getPostcode()) {
			number=this.naw.getPostcode().compareTo(post.getNaw().getPostcode());
		}

		else {
			number=this.naw.getHuisnummer()-post.naw.getHuisnummer();

		}

		return number;
	}


}










