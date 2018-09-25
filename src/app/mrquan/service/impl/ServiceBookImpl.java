package app.mrquan.service.impl;

import app.mrquan.factory.DAOFactory;
import app.mrquan.pojo.Book;
import app.mrquan.service.IServiceBook;

import java.util.List;

public class ServiceBookImpl implements IServiceBook {
    @Override
    public int add(Book pojo) {
        return DAOFactory.getIDAOBookInstance().insert(pojo);
    }

    @Override
    public List<Book> list() {
        return DAOFactory.getIDAOBookInstance().list();
    }
}
