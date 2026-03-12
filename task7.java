1.Write a JDBC program to insert a record into a database (Table:Student: id,name,age,phone_no,email) 

package prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            // 1 Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2 Create Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_d4848","root","root123");

            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM students");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone_no");
                String email = rs.getString("email");

                System.out.println(id + " " + name + " " + age + " " + phone + " " + email);
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }


	}

}



2.Write a JDBC program to select  a record from a database (Table:Student: id,name,age,phone_no,email) 


package prac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementSelect {

    public static void main(String[] args) {

        try {
            // 1 Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2 Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/anp_d4848",
                    "root",
                    "root123");

            // 3 Create PreparedStatement for INSERT
            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO students(id,name,age,phone_no,email) VALUES (?,?,?,?,?)");

            // 4 Set Values
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Piyush");
            pstmt.setInt(3, 23);
            pstmt.setString(4, "9876543210");
            pstmt.setString(5, "piyush@gmail.com");
            
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Raj");
            pstmt.setInt(3, 22);
            pstmt.setString(4, "9876543211");
            pstmt.setString(5, "raj@gmail.com");
            pstmt.executeUpdate();

            // Record 3
            pstmt.setInt(1, 3);
            pstmt.setString(2, "sanjay");
            pstmt.setInt(3, 21);
            pstmt.setString(4, "9876543212");
            pstmt.setString(5, "sanjay@gmail.com");
            pstmt.executeUpdate();

            // Record 4
            pstmt.setInt(1, 4);
            pstmt.setString(2, "Amit");
            pstmt.setInt(3, 24);
            pstmt.setString(4, "9876543213");
            pstmt.setString(5, "amit@gmail.com");
            pstmt.executeUpdate();

            // Record 5
            pstmt.setInt(1, 5);
            pstmt.setString(2, "suraj");
            pstmt.setInt(3, 22);
            pstmt.setString(4, "9876543214");
            pstmt.setString(5, "suraj@gmail.com");
            pstmt.executeUpdate();

            System.out.println("5 Records inserted successfully");

            // 5 Execute Query
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Record not inserted");
            }

            // 6 Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


Output:
	5 Records inserted successfully
	
	
	mysql> create table students(id INT PRIMARY KEY,
		    ->     name VARCHAR(50),
		    ->     age INT,
		    ->     phone_no VARCHAR(15),
		    ->     email VARCHAR(50)
		    -> );
		Query OK, 0 rows affected (0.37 sec)

		mysql> desc students
		    -> ;
		+----------+-------------+------+-----+---------+-------+
		| Field    | Type        | Null | Key | Default | Extra |
		+----------+-------------+------+-----+---------+-------+
		| id       | int         | NO   | PRI | NULL    |       |
		| name     | varchar(50) | YES  |     | NULL    |       |
		| age      | int         | YES  |     | NULL    |       |
		| phone_no | varchar(15) | YES  |     | NULL    |       |
		| email    | varchar(50) | YES  |     | NULL    |       |
		+----------+-------------+------+-----+---------+-------+
		5 rows in set (0.43 sec)
		

mysql> select * from students;
+----+--------+------+------------+------------------+
| id | name   | age  | phone_no   | email            |
+----+--------+------+------------+------------------+
|  1 | Piyush |   23 | 9876543210 | piyush@gmail.com |
|  2 | Raj    |   22 | 9876543211 | raj@gmail.com    |
|  3 | sanjay |   21 | 9876543212 | sanjay@gmail.co  |
|  4 | Amit   |   24 | 9876543213 | amit@gmail.com   |
|  5 | suraj  |   22 | 9876543214 | suraj@gmail.com  |
+----+--------+------+------------+------------------+
5 rows in set (0.04 sec)
	
