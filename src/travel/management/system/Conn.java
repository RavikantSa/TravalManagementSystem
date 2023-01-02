package travel.management.system;

import java.sql.*;
// my sql driver
public class Conn{

   Connection c;
   public Statement s;
    Conn(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver"); //// check it further
//            Class.forName("com.mysql.jdbc.Driver"); //// check it further
            c =DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","MySQL");

            s =c.createStatement();
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
/*
1--> Register the driver
2-->
3--> Creating the Statement
4-->  Ececuting MySQl Query ** using JDBC
5-->
* */