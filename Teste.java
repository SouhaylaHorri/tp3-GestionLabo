
public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        adresse add1 = new adresse();
        add1.codepostal = 9100;
        add1.gouvernerat = "Nebeul";
        add1.ville = "ManzelTmime";
        add1.affichee();
        add1.codepostal = 8080;
        System.out.println("le nouveau objet est: ");
        add1.affichee();
        adresse add2 = new adresse("sidi bouzid ", 5000, "jelma");
        add2.ville = "Aloune";
        add2.affichee();
        chercheur chercheur1  = new chercheur();
        chercheur1.nom = "Souhayl";
        chercheur1.post = "developpeur";
        chercheur1.numord = 3;
        chercheur1.afficherr();
        chercheur chercheur2 = new chercheur("souhayla ", "informatique", 10);
        chercheur2.afficherr();
        System.out.println("le nombre de chercheur est " + chercheur.cpt);
        chercheur1.numord = 6;
        chercheur chercheur3 = new chercheur();
        chercheur3.nom = "rihem";
        chercheur3.post = "informatique";
        chercheur3.numord = 6;
        bureau bureau1 = new bureau();
        bureau1.code = 123;
        bureau1.nom = "bureau de developpeur ";
        bureau1.chercheurs[0] = chercheur1;
        bureau1.chercheurs[1] = chercheur2;
        bureau1.chercheurs[2] = chercheur3;
        bureau bureau2 = new bureau();
        bureau2.code = 400;
        bureau2.nom = "bureau de résou ";
        bureau2.chercheurs[0] = chercheur1;
        bureau2.chercheurs[1] = chercheur2;
        bureau2.chercheurs[2] = chercheur3;
        laboratoire laboratoire = new laboratoire();
        laboratoire.adress= add2;
        laboratoire.nom = "laboratoire de " + laboratoire.adress.ville;
        laboratoire.spesialite = "informatique";
        laboratoire.adress = add1;

        laboratoire.bureaux[0] = bureau2;
        laboratoire.bureaux[1] = bureau1;
        laboratoire.affiche();
        System.out.println("la adress de laboltoire");
        laboratoire.adress.affichee();

        for(int i = 0; i < 2; ++i) {
            System.out.println("la donner de bureau " + (i + 1) + "est ");
            laboratoire.bureaux[i].afficher();

            for(int j = 0; j < 3; ++j) {
                laboratoire.bureaux[i].chercheurs[j].afficherr();
            }
        }

    }
}
