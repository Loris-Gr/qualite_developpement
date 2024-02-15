public enum MomentJournee {
    MATIN ("Matin"),
    APRESMIDI ("Après-midi"),
    SOIREE ("Soirée");

    private String Label ;

    private MomentJournee( String Label) {
        this.Label = Label ;
    }
    public String toString() {
        return this.Label ;
	    }
    
    
    }

