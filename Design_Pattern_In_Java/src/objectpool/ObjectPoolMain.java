package objectpool;

import java.sql.Connection;

public class ObjectPoolMain {

	public static void main(String[] args) throws InterruptedException {
		 // Create the ConnectionPool:
       JDBCConnectionPool pool = new JDBCConnectionPool(
           "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world",
           "root", "root");

       // Get a connection:
       Connection con = pool.giveMeObject();
       
       // Return the connection:
       pool.releaseObject(con);
       Thread.sleep(30000);
       Connection con1 = pool.giveMeObject();
     //  Connection con1 = pool.takeOut();
       
       //
       // Connection con2 = pool.takeOut();

	}
}
