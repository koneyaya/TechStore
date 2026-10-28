public class Personne {
    private String Cin,Nom, Prenom;
    private Adresse adresse;
    private string CIN, nom,prenom,gouvernorat;
    private int codePostal;


    public Personne(String Cin,Nom,Prenom,gouv,int CodePostal,Adresse adresse){
        this.gouvernorat=gouv;
        this.codePostal=codePostal;
        this.Cin=cin;
        this.Nom=nom;
        this.Prenom=prenom;
        this.Adresse=adresse;

    }


    public void setCin(String cin) {
        this.cin= cin;
    }

    public String getCin(){return cin;}
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public Adresse getAdresse(){return adresse;}


    public void setNom(String nom){this.nom=nom;}
    public void setPrenom(String prenom){this.prenom=prenom;}
    public void setAdresse(Adresse adresse){this.adresse=adresse;}
    }

    public String toString(){
        return "cin, nom,prenom,Adresse [gouvernorat: "+this.gouvernorat+"Code Postal"+ this.CodePostal +"]"; 
    }

}