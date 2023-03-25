public class Chien extends Annimal{

    public String nom;
    public String nomFamille = "Inconnu";

    public Chien() {
        this.nom = "Chien errant";
    }

    public Chien(String nomParametre, String nomFamilleParametre) {
        this.nom = nomParametre;
        this.nomFamille = nomFamilleParametre;
    }

    public String cri(){
        return "aboiement";
    }
}
