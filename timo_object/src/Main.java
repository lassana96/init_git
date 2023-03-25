public class Main {
    public static void main(String[] args) {
//        comprehensionDeBase();
        comprehensionAvance();

    }

    public static void comprehensionDeBase(){
        Ferme ferme = new Ferme();
        // "Chat errant"
        System.out.println(ferme.chat1.cri());
        System.out.println(ferme.chat1.nom);

        // "Paul"
        System.out.println(ferme.chat2.cri());
        System.out.println(ferme.chat2.nom);

        // "Satan"
        System.out.println(ferme.chat3.cri());
        System.out.println(ferme.chat3.nom);

        // "Mauricio"
        System.out.println(ferme.chat4.cri());
        System.out.println(ferme.chat4.nom);

        // "Chien errant"
        // "Inconnu"
        System.out.println(ferme.chien1.cri());
        System.out.println(ferme.chien1.nom);
        System.out.println(ferme.chien1.nomFamille);

        // "George"
        // "Bush"
        System.out.println(ferme.chien2.cri());
        System.out.println(ferme.chien2.nom);
        System.out.println(ferme.chien2.nomFamille);
        ferme.chien2.nomFamille = "nouveau nom famille";
        System.out.println(ferme.chien2.nomFamille);

        System.out.println(Chat.criStatic());
        System.out.println(new Chat().nom);
        System.out.println(new Chat("TEST").nom);
        Chat chat = new Chat();
//        chat.setCastrer(true);

        System.out.println(chat.getCastrer());
    }

    public static void comprehensionAvance(){
        Ferme ferme = new Ferme();
        // "Miaulement"
        // 4
        System.out.println(ferme.chat1.cri());
        System.out.println(ferme.chat1.nbPattes());

        // "Aboiement"
        // 4
        System.out.println(ferme.chien1.cri());
        System.out.println(ferme.chien1.nbPattes());

        // "Miouf-cocorico"
        // 4
        System.out.println(ferme.mouton.cri());
        System.out.println(ferme.mouton.nbPattes());

        Annimal annimal = new Annimal();

        // "Miouf-cocorico"
        // 4
        System.out.println(annimal.cri());
        System.out.println(annimal.nbPattes());

    }
}