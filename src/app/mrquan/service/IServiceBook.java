package app.mrquan.service;

import app.mrquan.pojo.Book;

import java.util.List;

public interface IServiceBook {
    /**
     *
     * @param pojo
     * @return
     */
    int add(Book pojo);

    /**
     *
     * @return
     */
    List<Book> list();
}
