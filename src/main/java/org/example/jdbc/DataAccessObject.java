package org.example.jdbc;

import java.sql.Connection;
import java.util.List;

public abstract  class DataAccessObject <T extends  DataTransferObject>{
    protected final Connection connection;
    protected final static  String LAST_VAL="SELECT last_value FROM";
    protected final static String CUSTOMER_SEQUENCE="hp_customer_seq";
    public DataAccessObject(Connection connection){
        super();
        this.connection=connection;
    }

    public abstract T create(T dto);
    public abstract  T findById(long id);
    public abstract List<T> findAll();
    public abstract T update(T dto);
    public abstract void delete(long id);




    //create row
    //read row
    //update
    //delete
}
