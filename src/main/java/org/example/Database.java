package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database instance;           //singleton: per una det. classe esiste una e una sola istanza
    private Connection connection;

    private Database() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:database.db");
    }

    public static Database getInstance() throws SQLException {          //singleton: impedisce l'istanziamento diretto dall'esterno
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
