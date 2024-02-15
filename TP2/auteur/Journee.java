
import java.util.List ;
import java.util.ArrayList ;


public class Journee {
    private Auteur auteur1 ;
    private Auteur auteur2 ;
    private List<Epreuve> epreuves ;

    public Journee(Auteur auteur1, Auteur auteur2) {
        this.auteur1 = auteur1 ;
        this.auteur2 = auteur2 ;
        this.epreuves = new ArrayList<Epreuve>() ; 
    }

    public void addEpreuve(Epreuve epreuve) {
        this.epreuves.add(epreuve) ;
    }

    public int scoreTotal(Auteur auteur1) {
        int total = 0 ;
        for (Epreuve epreuve : this.epreuves) {
            total+= epreuve.score(auteur1) ;
        }
        return total ;
    } 

    public String gagnant() {
        int scoreAuteur1 = scoreTotal(this.auteur1) ;
        int scoreAuteur2 = scoreTotal(this.auteur2) ;
        if (scoreAuteur1 > scoreAuteur2) {
            return auteur1.toString() + "/n indice : 0";
        }
        return  auteur2.toString() + "/n indice : 1";
        
    }

    
}
