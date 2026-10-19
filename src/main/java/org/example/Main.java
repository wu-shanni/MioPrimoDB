import org.example.Database;
import java.sql.SQLException;
import static java.lang.IO.println;
import static java.lang.IO.readln;

void main(){
    Database database = null;
    try {
        database = Database.getInstance();

    } catch (SQLException e) {
        println("\nErrore nella connessione del Database: " + e.getMessage());
        System.exit(-1);
    }
    println("\nDatabase Connesso");


    database.insertPiatto(
            readln("\nInserisci il piatto:\t"),
            Double.parseDouble(readln("\nInserisci il prezzo:\t")),
            Integer.parseInt(readln("\nInserisci la quantita' :\t"))
    );

    database.selectAll("sushi_menu");
}