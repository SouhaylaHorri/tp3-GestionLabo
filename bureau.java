public class bureau {
    public int code;
    public String nom;
    public chercheur chercheurs[];

    public bureau()
    {

    }

    public bureau(int code, String nom, chercheur[] c) {
        this.code = code;
        this.nom = nom;
       chercheur[] chercheurs=new chercheur[5];
    }


    public void afficher()
    {
        System.out.println("code:"+code+"Nom:  "+nom);

    }


}

