public class chercheur {
    public String nom;
    public String post;
    public int numord;
    public static int cpt;

    public chercheur(String nom, String poste, int numord) {
        this.nom = nom;
        this.post = poste;
        this.numord = numord;
        cpt++;
    }
    public chercheur()
    {
        cpt++;
    }

    public void afficherr()
    {
        System.out.println("le nom de ce Chercheur est  "+nom+"de la poste "+post+" et de numerp d'ordinateure est  "+numord);

    }
    public boolean comparer(chercheur ch)
    {
      return nom==ch.nom && ch.post ==post && numord==ch.numord;
    }
}
