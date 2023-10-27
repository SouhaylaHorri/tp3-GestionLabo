public class adresse {
     public String gouvernerat;
     public int codepostal;
     public String ville;

     public adresse(String gouvernerat, int codepostal,String ville) {
          this.gouvernerat = gouvernerat;
          this.codepostal = codepostal;
          this.ville=ville;
     }
     public adresse (){
     }
     public void affichee()
     {
          System.out.println("la gouvernerat est.."+gouvernerat+"  dee la code postale est .. "+codepostal+"de la ville est"+ville);
     }


}
