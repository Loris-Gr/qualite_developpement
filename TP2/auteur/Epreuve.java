

public class Epreuve {
    private MomentJournee momentJournee ;
    private Style style ;
    private int nombreSpectateurs ;
    

    Epreuve(MomentJournee momentJournee, Style style, int nombreSpectateurs, int qualiteAuteur) {
        this.momentJournee = momentJournee ;
        this.style = style ;
        this.nombreSpectateurs = nombreSpectateurs ;
    }

    public int score(Auteur auteur) {
        return this.nombreSpectateurs * auteur.qualiteStyle(this.style) ;
    }

    public String getCitation(Auteur auteur) {
        return auteur.citationStyle(this.style) ;
    }

    

    
}
