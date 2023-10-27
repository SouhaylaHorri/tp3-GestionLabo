public class laboratoire {
    public String nom;
    public String spesialite;
    public int numbur;
    bureau[] bureaux=new bureau[50];
    adresse adress=new adresse();


    public laboratoire(String nom, String spésialite, int numbur) {
        this.nom = nom;
        this.spesialite = spesialite;
        this.numbur = numbur;

    }
    public laboratoire()
    {

    }
    public void affiche()
    {
        System.out.println("le nom est  "+nom+" de la spésialite est .."+spesialite);
    }

}
