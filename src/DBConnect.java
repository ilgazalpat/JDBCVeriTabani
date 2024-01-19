import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM employees";
        String url = "jdbc:mysql://localhost/Deneme?user=root&password=mysql";
        try {
            connect = DriverManager.getConnection(url);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);

            while(data.next()){
                System.out.println("ID : " + data.getInt("id"));
                System.out.println("Name : " + data.getString("name"));
                System.out.println("Position : " + data.getString("position"));
                System.out.println("Salary : " + data.getInt("salary"));
                System.out.println("--------------");
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
