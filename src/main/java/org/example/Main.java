import org.example.Database;

import java.sql.SQLException;

import static java.lang.IO.println;

void main(){
    try {
        Database database = new Database();
    } catch (SQLException e) {
        println("\nErrore nella connessione del Database: " + e.getMessage());
        System.exit(-1);
    }
    println("\nDatabase Connesso");
}