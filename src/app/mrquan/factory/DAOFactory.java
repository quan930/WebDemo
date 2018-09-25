package app.mrquan.factory;

import app.mrquan.dao.IDAOBook;
import app.mrquan.dao.impl.DAOBookImpl;

public class DAOFactory {
    public static IDAOBook getIDAOBookInstance (){
        return new DAOBookImpl();
    }
}
