package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

/**
 * Extension "capteur" de IDao ajoutée sans modifier la couche DAO ni la couche métier.
 */
@Component("d2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        return 12.0;
    }
}
