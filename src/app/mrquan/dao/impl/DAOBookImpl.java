package app.mrquan.dao.impl;

import app.mrquan.dao.IDAOBook;
import app.mrquan.pojo.Book;
import app.mrquan.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOBookImpl implements IDAOBook {

    @Override
    public int insert(Book book) {
        int m = 0;
        Connection con = null;
        PreparedStatement preparedStatement = null;
        try {
            con = DBUtil.createConnection();
            preparedStatement = con.prepareStatement("insert into book values (?,?,?)");
            preparedStatement.setString(1,book.getId());
            preparedStatement.setString(2,book.getName());
            preparedStatement.setDouble(3,book.getPrice());
            m = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBUtil.close(con,preparedStatement,null);
        return m;
    }

    @Override
    public List<Book> list() {
        List<Book> pojos = new ArrayList<>();
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            con = DBUtil.createConnection();
            preparedStatement = con.prepareStatement("select * from book");
            resultSet = preparedStatement.executeQuery();
            Book pojo = null;
            while (resultSet.next()){
                pojo = new Book();
                pojo.setId(resultSet.getString(1));
                pojo.setName(resultSet.getString(2));
                pojo.setPrice(resultSet.getDouble(3));
                pojos.add(pojo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pojos;
    }

    @Override
    public int deleteBookById(String id) {
        int m = 0;
        Connection con = null;
        PreparedStatement preparedStatement = null;
        try {
            con = DBUtil.createConnection();
            preparedStatement = con.prepareStatement("delete from book where id = ?");
            preparedStatement.setString(1,id);
            m = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBUtil.close(con,preparedStatement,null);
        return m;
    }
}
