package app.mrquan.dao;

import app.mrquan.pojo.Book;

import java.util.List;

public interface IDAOBook {
    /**
     * 添加数据
     * @param book 需要添加的pojo 对象
     * @return 成功返回1否则返回0
     */
    int insert(Book book);

    /**
     * 返回全部数据
     * @return 返回pojo 集合 没有size=0
     */
    List<Book> list();
}
