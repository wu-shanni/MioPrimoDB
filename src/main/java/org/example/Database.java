package org.example;

import com.sun.jdi.event.StepEvent;

import java.sql.*;

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

    public boolean insertPiatto(String piatto, double prezzo, int quantita){
        //controllo connessione al database
        try{
            if(!connection.isValid(5)){
                throw new RuntimeException("Connessione persa");
            }
        }catch (SQLException E){
            return false;
        }

        String query = "INSERT INTO sushi_menu (piatto, prezzo, quantita) VALUES (?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, piatto);
            statement.setDouble(2, prezzo);
            statement.setInt(3, quantita);
            statement.execute();

        } catch (SQLException e){
            return false;
        }
        return true;
    }
}
