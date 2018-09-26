package app.mrquan.text;

import app.mrquan.dao.impl.DAOBookImpl;
import app.mrquan.factory.DAOFactory;
import app.mrquan.factory.ServiceFactory;
import app.mrquan.pojo.Book;

import java.util.List;

public class Text {
    public static void main(String[] args) {
//        Book book = new Book();
//        book.setId("0003");
//        book.setName("十万个问什么");
//        book.setPrice(13.14);
//        int m = DAOFactory.getIDAOBookInstance().insert(book);
//        System.out.println(m);
//
//        List<Book> pojos = DAOFactory.getIDAOBookInstance().list();
//        for (int i = 0; i < pojos.size(); i++) {
//            System.out.println(pojos.get(i));
//        }
//        List<Book> pojos = ServiceFactory.getIServiceBookInstance().list();
//        for (int i = 0; i < pojos.size(); i++) {
//            System.out.println(pojos.get(i));
//        }


        int m = DAOFactory.getIDAOBookInstance().deleteBookById("0001");
        System.out.println(m);
    }
}
