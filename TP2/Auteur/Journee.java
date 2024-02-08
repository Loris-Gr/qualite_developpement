import java.util.List ;
import java.util.ArrayList ;
package Auteur;

public class Journee {
    private Auteur auteur1 ;
    private Auteur auteur2 ;
    private List<Epreuve> epreuves ;
    private int nombreSpectateurs ;

    public Journee(Auteur auteur1, Auteur auteur2,  int nombreSpectateurs) {
        this.auteur1 = auteur1 ;
        this.auteur2 = auteur2 ;
        this.nombreSpectateurs = nombreSpectateurs ;
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


    
}
