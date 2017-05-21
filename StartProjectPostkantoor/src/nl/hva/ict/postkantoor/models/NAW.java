/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package nl.hva.ict.postkantoor.models;

/**
 * NAW representeert naam, adres (straat + huisnummer) en woonplaats.
 *
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public class NAW {
    private String naam;
    private String straat;
    private int huisnummer;
    private String postcode;
    private String woonplaats;

    /**
     * Maakt een instantie van NAW.
     * 
     * @param naam De naam.
     * @param straat De straatnaam van het adres.
     * @param huisnummer Het huisnummer van het adres.
     * @param postcode De postcode van het adres.
     * @param woonplaats De woonplaats.
     */
    public NAW(String naam, String straat, int huisnummer, String postcode, String woonplaats) {
        this.naam = naam;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
    }
    
    public int getHuisnummer() {
        return huisnummer;
    }

    public String getPostcode() {
        return postcode;
    }
 
    public String getWoonplaats() {
        return woonplaats;
    }

    @Override
    public String toString() {
        return naam + "\n" + straat + " " + huisnummer + "\n" 
                + postcode + "  " + woonplaats + "\n";
    }
}
