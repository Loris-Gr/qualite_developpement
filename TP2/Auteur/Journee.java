package Auteur ;
public enum Journee {
    MATIN,
    APRESMIDI,
    SOIREE;

    public String toString() {
    if (this == MATIN)
	    return "Matin";
	else if (this == APRESMIDI)
	    return "Après-midi";
	else {
	    assert this == SOIREE;
	    return "Soirée";
	}
    }
    
    
}
