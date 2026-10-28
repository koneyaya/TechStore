public  class Adresse{
    private string gouvernorat;
    private int CodePostal;
    public Adresse(String gouv,int CodePostal){
        this.gouvernorat=gouv;
        this.codePostal=codePostal;
    }
    public String getGouvernorat(){return gouvernorat;}
    public int getCodePostal(){return codePostal;}
    public void setgouvernorat(String gouv){this.gouvernorat=gouv;}
    public void setCodePostal(int codeP){this.codePostal=codeP;}
    public String toString(){
        return "Adresse [gouvernorat: "+this.gouvernorat++"Code Postal"+ this.CodePostal +"]"; 
    }

}