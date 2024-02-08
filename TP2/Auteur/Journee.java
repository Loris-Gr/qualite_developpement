package Auteur ;
public enum Journee {
    MATIN ("Matin"),
    APRESMIDI ("Après-midi"),
    SOIREE ("Soirée");

    private String Label ;

    private Journee( String Label) {
        this.Label = Label ;
    }
    public String toString() {
        return this.Label ;
	    }
    
    
    }

