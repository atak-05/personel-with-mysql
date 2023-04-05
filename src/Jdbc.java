import java.sql.*;

public class Jdbc {
    public  void Menu() throws ClassNotFoundException, SQLException {
        readData();
        writeData();
        readData();
    }
    
    private void writeData() throws ClassNotFoundException, SQLException {
        try (Connection connection = getConn();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO persondb(id, ad, maas) VALUES (?, ?, ?)")) {
            
            statement.setInt(1, 50);
            statement.setString(2, "Ay");
            statement.setInt(3, 5000);
            
            int rowsInserted = statement.executeUpdate();
            System.out.println(rowsInserted + " rows inserted.");
        } 
    }
    

    private Connection getConn() throws ClassNotFoundException,SQLException {
        Conn conn = new Conn();
        Connection  connect = null;
        Class.forName(conn.getJdbcDriver());
        System.out.println("Connected to Database");
        connect = DriverManager.getConnection(conn.getUrl(),conn.getUser(),conn.getPassword());
        System.out.println("Opened to Database");
        return connect;
    }

    private void readData() throws ClassNotFoundException, SQLException {
        try (Connection connection = getConn();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM persondb")) {
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("ad");
                int salary = resultSet.getInt("maas");
                System.out.printf("%d, %s, %d\n", id, name, salary);
            }
        } 
    }
    
}
