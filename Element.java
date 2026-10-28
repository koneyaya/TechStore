package techstore;

public class Element {
    private Article article;
    private long quantite;

    public Element(Article article, long quantite) {
        this.article = article;
        setQuantite(quantite);
    }

    public Element(String nom, double prix, long quantite) {
        this.article = new Article(nom, prix);
        setQuantite(quantite);
    }

    public void incrementerQuantite(long qte) {
        if (qte > 0) {
            this.quantite += qte;
        }
    }

    public void decrementerQuantite(long qte) {
        if (qte > 0 && this.quantite >= qte) {
            this.quantite -= qte;
        }
    }

    public void modifier(String nom, double prix, long quantite) {
        this.article = new Article(nom, prix);
        setQuantite(quantite);
    }

    public boolean equals(String reference) {
        return this.article.getReference().equalsIgnoreCase(reference);
    }

    public boolean equals(Article art) {
        if (art == null) return false;
        return this.article.getReference().equalsIgnoreCase(art.getReference());
    }

    // Getters et Setters
    public Article getArticle() { return article; }
    public void setArticle(Article article) { this.article = article; }

    public long getQuantite() { return quantite; }
    public void setQuantite(long quantite) {
        if (quantite >= 0) {
            this.quantite = quantite;
        } else {
            this.quantite = 0;
        }
    }

    public String getReferenceArticle() { return article.getReference(); }
    public String getNomArticle() { return article.getNom(); }
    public double getPrixArticle() { return article.getPrix(); }

    @Override
    public String toString() {
        return "Element [article=" + article.toString() + ", quantite=" + quantite + "]";
    }
}