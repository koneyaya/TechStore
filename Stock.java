 package techstore;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Element> articleList;

    public Stock() {
        this.articleList = new ArrayList<>();
    }

    public Stock(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public Stock(ArrayList<String> noms, ArrayList<Double> prixs, ArrayList<Long> quantites) {
        this.articleList = new ArrayList<>();
        int size = Math.min(noms.size(), Math.min(prixs.size(), quantites.size()));
        for (int i = 0; i < size; i++) {
            this.articleList.add(new Element(noms.get(i), prixs.get(i), quantites.get(i)));
        }
    }

    public ArrayList<Element> getArticleList() { return articleList; }
    public void setArticleList(ArrayList<Element> articleList) { this.articleList = articleList; }

    public int getArticleNb() { return articleList.size(); }

    public void ajouterArticle(Article article, long quantite) {
        articleList.add(new Element(article, quantite));
    }

    public void ajouterArticle(String nom, double prix, long quantite) {
        articleList.add(new Element(nom, prix, quantite));
    }

    public Element trouverArticle(String reference) {
        for (Element e : articleList) {
            if (e.equals(reference)) return e;
        }
        return null;
    }

    public boolean modifierArticle(String reference, String nouveauNom, double nouveauPrix, long nouvelleQuantite) {
        Element e = trouverArticle(reference);
        if (e != null) {
            e.modifier(nouveauNom, nouveauPrix, nouvelleQuantite);
            return true;
        }
        return false;
    }

    public boolean supprimerArticle(String reference) {
        Element e = trouverArticle(reference);
        if (e != null) {
            articleList.remove(e);
            return true;
        }
        return false;
    }

    public boolean incrementerQuantiteArticle(String reference, long qte) {
        Element e = trouverArticle(reference);
        if (e != null) {
            e.incrementerQuantite(qte);
            return true;
        }
        return false;
    }

    public boolean decrementerQuantiteArticle(String reference, long qte) {
        Element e = trouverArticle(reference);
        if (e != null && e.getQuantite() >= qte) {
            e.decrementerQuantite(qte);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Element e : articleList) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }
}