
import java.util.Map ;
import java.util.HashMap ;
public class Auteur {
    private String nom ;
    private Map<String, Integer> performances = new HashMap<>();
    private Map<String, String> citations = new HashMap<>();

    public Auteur(String nom, int perf_tra, String cita_tra, int perf_com, String cita_com, int perf_dra, String cita_dra) {
        this.nom = nom ;
        this.performances.put("Tragédie", perf_tra) ;
        this.performances.put("Comédie", perf_com) ;
        this.performances.put("Drame", perf_dra) ;
        this.citations.put("Tragédie", cita_tra) ;
        this.citations.put("Comédie", cita_com) ;
        this.citations.put("Drame", cita_dra) ;
    }

    public int getQualiteTragedie() {
        return this.performances.get("Tragédie") ;
    }

    public String getCitationTragedie() {
        return this.citations.get("Tragédie") ;
    }


    public int getQualiteComedie() {
        return this.performances.get("Comédie") ;
    }

    public String getCitationComedie() {
        return this.citations.get("Comédie") ;
    }


    public int getQualiteDrame() {
        return this.performances.get("Drame") ;
    }

    public String getCitationDrame() {
        return this.citations.get("Drame") ;
    }

    public String pointFort() {
        String meilleureCategorie = "" ;
        Integer meilleureCateNombre = 0 ;
        for ( Map.Entry<String,Integer> categorieEtQualite : performances.entrySet()) {
            if (categorieEtQualite.getValue() > meilleureCateNombre) {
                meilleureCateNombre = categorieEtQualite.getValue() ;
                meilleureCategorie = categorieEtQualite.getKey() ;
            }
        }
        return meilleureCategorie ;
    }

    public int qualiteStyle(Style s) {
        return this.performances.get(s.toString()) ;
    }

    public String citationStyle(Style s) {
        return this.citations.get(s.toString()) ;
    }

    @Override
    public String toString(){
        return String.format("L'honorable %s ", this.nom) ;
    }
}