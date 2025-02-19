package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private final String url="jdbc:mysql://localhost:3306/test";
    private final String login="root";
    private final String mdp="";
    public  static MyConnection instance ;
    private Connection cnx;


    private MyConnection() {
        try {
            cnx = DriverManager.getConnection(url,login,mdp);
            System.out.println("Connexion établie!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public Connection getCnx() {
        return cnx;
    }

    public static MyConnection getInstance() {
        if (instance== null) {
            instance =new MyConnection();
        }
        return instance;
    }
}

