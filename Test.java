 package techstore;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Test Partie 1 : Adresses et Personnes
        System.out.println("--- TEST PARTIE 1 ---");
        Adresse a1 = new Adresse("Monastir", 5000);
        Adresse a2 = new Adresse("Ben Arous", 1133);
        Adresse a3 = new Adresse("Ben Arous", 1145);

        System.out.println("L'adresse a1 " + a1);
        System.out.println("L'adresse a2 " + a2);
        System.out.println("L'adresse a3 " + a3);

        Personne p1 = new Personne("01111111", "Kbayer", "Jasser", "Jendouba", 8160);
        Personne p2 = new Personne("02222222", "Smida", "Ghayth", a1);

        System.out.println("La personne p1 " + p1);
        System.out.println("La personne p2 " + p2);

        // Test Partie 2 : Gestion du stock
        System.out.println("\n--- TEST PARTIE 2 (STOCK) ---");
        ArrayList<String> noms = new ArrayList<>();
        noms.add("Apple iPad 8e Generation");
        noms.add("Micro Casque 588 Filaire");

        ArrayList<Double> prixs = new ArrayList<>();
        prixs.add(1269.0);
        prixs.add(85.0);

        ArrayList<Long> quantites = new ArrayList<>();
        quantites.add(8L);
        quantites.add(15L);

        Stock stock = new Stock(noms, prixs, quantites);
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n====== GESTION DU STOCK TECHSTORE ==========");
            System.out.println("0 - Ajouter un article");
            System.out.println("1 - Augmenter la quantite d'un article");
            System.out.println("2 - Modifier un article");
            System.out.println("3 - Supprimer un article");
            System.out.println("4 - Consulter le stock");
            System.out.println("5 - Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Vider le buffer

            switch (choix) {
                case 0:
                    System.out.print("Nom de l'article : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prix : ");
                    double prix = scanner.nextDouble();
                    System.out.print("Quantite : ");
                    long qte = scanner.nextLong();
                    stock.ajouterArticle(nom, prix, qte);
                    System.out.println("Article ajoute avec succes !");
                    break;

                case 1:
                    System.out.print("Reference de l'article : ");
                    String refInc = scanner.nextLine();
                    System.out.print("Quantite a ajouter : ");
                    long qteInc = scanner.nextLong();
                    if (stock.incrementerQuantiteArticle(refInc, qteInc)) {
                        System.out.println("Quantite augmentee avec succes !");
                    } else {
                        System.out.println("Erreur : Article introuvable.");
                    }
                    break;

                case 2:
                    System.out.print("Reference de l'article a modifier : ");
                    String refMod = scanner.nextLine();
                    System.out.print("Nouveau nom : ");
                    String nvNom = scanner.nextLine();
                    System.out.print("Nouveau prix : ");
                    double nvPrix = scanner.nextDouble();
                    System.out.print("Nouvelle quantite : ");
                    long nvQte = scanner.nextLong();
                    if (stock.modifierArticle(refMod, nvNom, nvPrix, nvQte)) {
                        System.out.println("Article modifie avec succes !");
                    } else {
                        System.out.println("Erreur : Article introuvable.");
                    }
                    break;

                case 3:
                    System.out.print("Reference de l'article à supprimer : ");
                    String refSup = scanner.nextLine();
                    if (stock.supprimerArticle(refSup)) {
                        System.out.println("Article supprime avec succes !");
                    } else {
                        System.out.println("Erreur : Article introuvable.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- LISTE DU STOCK ---");
                    System.out.print(stock.toString());
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 5);

        scanner.close();
    }
}