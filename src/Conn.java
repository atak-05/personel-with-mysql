public class Conn {
    //JDBC driver and database URL
    private final String jdbcDriver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/person?serverTimezone=UTC";
    // Database user and password
    final String username  = "root";
    final String password ="9cn5hrxahv";

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public String getPassword(){
        return password;
    }

    public String getUser(){
        return username;
    }

    public String getUrl(){
        return url;
    }

}
