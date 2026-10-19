package org.example;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection connection;

    public Database() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\12999314\\IdeaProjects\\MioPrimoDB\\database.db");
    }



}
