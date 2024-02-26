package org.example.jdbc;

import java.sql.Connection;
import java.util.List;

public class DataAccessObject<T> {
    protected final Connection connection;

    public DataAccessObject(Connection connection) {
        this.connection = connection;
    }
    protected final static  String LAST_VAL="SELECT last_value FROM";
    protected final static String CUSTOMER_SEQUENCE="hp_customer_seq";

    public T findById(long id) {
        return null;
    }

    public List<T> findAll() {
        return null;
    }

    public T update(T dto) {
        return null;
    }

    public T create(T dto) {
        return null;
    }

    public void delete(long id) {

    }
}
