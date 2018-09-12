package shoryuken.controllers;

import java.sql.SQLException;
import java.util.List;

public interface Controller<T> {
    public List<T> getAll () throws SQLException;
    public T getById () throws SQLException;
    public void create (T t) throws SQLException;
    public void update (T t) throws SQLException;
    public void delete (T t) throws SQLException;
}
