public enum Style {
    COMEDIE,
    TRAGEDIE,
    DRAME;

    public String toString() {
	if (this == COMEDIE)
	    return "Comédie";
	else if (this == TRAGEDIE)
	    return "Tragédie";
	else {
	    assert this == DRAME;
	    return "Drame";
	}
    }
}
