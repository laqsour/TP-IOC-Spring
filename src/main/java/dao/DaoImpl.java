package dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        return 23.0;
    }
}