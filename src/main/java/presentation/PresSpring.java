package presentation;

import metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        IMetier metier = (IMetier) context.getBean("metier");

        System.out.println("Résultat du calcul avec Spring : " + metier.calcul());

        context.close();
    }
}