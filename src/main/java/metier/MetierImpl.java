package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao dao;

    /** Constructeur sans paramètres (requis pour Pres1, Pres2 et Spring XML). */
    public MetierImpl() {
    }

    /** Injection par constructeur (utilisée par Spring Annotations). */
    @Autowired
    public MetierImpl(@Qualifier("d") IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 10;
    }
}