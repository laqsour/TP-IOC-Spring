package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {

    public static void main(String[] args) {

        // 1. Créer l'objet DAO
        DaoImpl dao = new DaoImpl();

        // 2. Créer l'objet métier
        MetierImpl metier = new MetierImpl();

        // 3. Injecter le DAO dans l'objet métier
        metier.setDao(dao);

        // 4. Effectuer le calcul
        double resultat = metier.calcul();

        // 5. Afficher le résultat
        System.out.println("Résultat du calcul : " + resultat);
    }
}