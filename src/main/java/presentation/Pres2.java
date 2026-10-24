package presentation;

import metier.IMetier;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws Exception {

        // 1. Lire le fichier de configuration
        Scanner scanner = new Scanner(
                new File("src/main/resources/config.txt")
        );

        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();

        scanner.close();

        // 2. Créer dynamiquement l'objet DAO
        Class<?> daoClass = Class.forName(daoClassName);
        Object dao = daoClass.getDeclaredConstructor().newInstance();

        // 3. Créer dynamiquement l'objet métier
        Class<?> metierClass = Class.forName(metierClassName);
        Object metier = metierClass.getDeclaredConstructor().newInstance();

        // 4. Injecter le DAO dans l'objet métier
        Method setDao = metierClass.getMethod("setDao",
                dao.getClass().getInterfaces()[0]);

        setDao.invoke(metier, dao);

        // 5. Exécuter le calcul
        IMetier metierInterface = (IMetier) metier;

        System.out.println(
                "Résultat du calcul par instanciation dynamique : "
                        + metierInterface.calcul()
        );
    }
}