import org.example.Database;
import java.sql.SQLException;
import static java.lang.IO.println;

void main(){
    Database database = null;
    try {
        database = Database.getInstance();

    } catch (SQLException e) {
        println("\nErrore nella connessione del Database: " + e.getMessage());
        System.exit(-1);
    }
    println("\nDatabase Connesso");


    database.insertPiatto("Uramaki Miura", 5.5, 8);
}