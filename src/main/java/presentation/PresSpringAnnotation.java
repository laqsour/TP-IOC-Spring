package presentation;

import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Version 4 : Injection des dépendances avec Spring Annotations (@Component, @Autowired, @Qualifier).
 */
public class PresSpringAnnotation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("dao", "metier");

        IMetier metier = context.getBean(IMetier.class);

        System.out.println("Résultat du calcul avec Spring Annotations : " + metier.calcul());

        context.close();
    }
}
