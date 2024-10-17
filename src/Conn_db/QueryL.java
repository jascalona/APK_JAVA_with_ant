
package Conn_db;

/**
 *
 * @author jescalona
 */
import java.sql.*;
import Conn_db.Conexion;
import Conn_db.LoginGetSet;
import java.sql.Connection;
import java.util.ArrayList;


public class QueryL {
    
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    public QueryL (){
            
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gxdeve_apps","root","root");
            System.out.println("Conexion Exitosa!");
        } catch(Exception e) {
            System.out.println("Ha Ocurrido un Error de Conexion!" + e);
        }

    }
    
    public ArrayList<LoginGetSet> login(String name, String password){
        ArrayList<LoginGetSet> res=new ArrayList<>();
        
        try{
            //SENTENCIA SQL
            ps=cn.prepareStatement(" select *from log_phone where name=? and password=? ");
            ps.setString(1, name);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while(rs.next()){
                LoginGetSet lo=new LoginGetSet();
                lo.setId(rs.getString("id"));
                lo.setName(rs.getString("name"));
                lo.setSurname(rs.getString("surname"));
                lo.setPassword(rs.getString("password"));
                lo.setRoll(rs.getString("roll"));
                res.add(lo);
            }
            
            if(res.isEmpty()){
                System.out.println("Acceso Denegado!!!");
            } else{
                System.out.println("Bienvenido!");
            }
            
        } catch (Exception e){
        
        }
        
        return res;
    }

}
