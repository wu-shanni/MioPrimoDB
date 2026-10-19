import org.example.Database;
import java.sql.SQLException;
import static java.lang.IO.println;

void main(){
    try {
        Database database = Database.getInstance();
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        Database database3 = Database.getInstance();

    } catch (SQLException e) {
        println("\nErrore nella connessione del Database: " + e.getMessage());
        System.exit(-1);
    }
    println("\nDatabase Connesso");
}