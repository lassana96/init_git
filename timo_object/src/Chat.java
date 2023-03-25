public class Chat extends Annimal{

    public String nom;
    private boolean castrer = false;

    // Mutateur = Setter
    public void setCastrer(Boolean castrer){
        this.castrer = castrer;
    }

    // Assesseur = Getter
    public boolean getCastrer(){
        return this.castrer;
    }
    public Chat(){
        this.nom = "Chat errant";
    }

    public Chat(String nomParametre){
        this.nom = nomParametre;
    }

    public String cri(){
        return "miaulement";
    }

    // À voir toute à l'heure
    public static String criStatic(){
        return "miaulement static";
    }

    //    public boolean setAndGetCastrer(Boolean castrer){
//        this.castrer = castrer;
//        return this.castrer;
//    }
}

// Avant
// nom == null
// Chat.nom == null
// Chat.criStatic() == "miaulement static"


// Construction de l'object
// Chat chat1 = new Chat();
// Chat chat2 = new Chat("test");
//
// Utilisation des méthodes
// System.out.println(chat1.cri());
// System.out.println(chat1.nom);

