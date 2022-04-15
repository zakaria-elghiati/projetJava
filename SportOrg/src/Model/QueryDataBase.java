/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.net.Socket;
import java.sql.*;

public class QueryDataBase {

    Connection connection;
    Statement statement;
    String SQL;
    String url;
    String username;
    String password;
    Socket Client;
    int port;
    String Host;
klkkkkkk
    public QueryDataBase(String url, String username, String password, String host, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.Host=host;

    }

    //faonction pour faire la connexion avec la base de données
   public Connection ConnexionDataBase(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/gestiondeterrain", username, password);
        } catch (Exception e)
        {System.err.println(e.getMessage());   
        }
        return connection;
       
    }
    

    //fonction pour deconnectert de la ba base de données
    public Connection CloseDataBase() {

        try {
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }
    
    
    //des fonctions pour executer les requets 
    
    public ResultSet ExecutionQuery(String sql){
        ConnexionDataBase();
        ResultSet resultSet = null;
        try{
            statement = connection.createStatement();
            statement.executeQuery(sql);
            System.out.println(sql);
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return resultSet;
    }
    
    
    public String executionUpdate(String sql){
        ConnexionDataBase();
        String result ="";
        try{
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        result = sql ;
    }catch (SQLException ex) {
        result = ex.toString();
    }
    return result;
    }
    
    
    //pour afficher tous
    public ResultSet querySelectAll(String nomTable){
        ConnexionDataBase();
        SQL = "SELECT * FROM " +nomTable;
        System.out.println(SQL);
        return this.ExecutionQuery(SQL);
    }
    //FONCTION POUR AFFICHER TOUS AVEC CONDITION ETAT
    public ResultSet querySelectAll(String nomTable,String etat){
        ConnexionDataBase();
        SQL = "SELECT * FROM " + nomTable + " WHERE " + etat;
        System.out.println(SQL);
        return this.ExecutionQuery(SQL);
    }
    public ResultSet querySelect(String[] nomColonne , String nomTable){
        ConnexionDataBase();
        int i;
        SQL = "SELECT ";
        for(i=0 ;i<=nomColonne.length-1;i++){
            SQL +=nomColonne[i];
            if(i< nomColonne.length-1){
                SQL+=",";
            }
        }
        SQL +=" FROM " +nomTable;
        return this.ExecutionQuery(SQL);
    }
    // fonction pour l'insertion des donnees
    public String queryInsert(String nomTable , String[] contenuTableau){
        ConnexionDataBase();
        int i;
        SQL = "INSERT INTO " + nomTable +" VALUES(";
        for(i=0 ;i<=contenuTableau.length-1;i++){
            SQL +="'" + contenuTableau[i] + "'";
            if(i< contenuTableau.length-1){
                SQL+=",";
            }
        }
        SQL +=")";
        return this.executionUpdate(SQL);
    }
    
    public String queryInsert(String nomTable ,String[] nomColonne, String[] contenuTableau){
        ConnexionDataBase();
        int i;
        SQL = "INSERT INTO " + nomTable + "(";
        for(i=0 ;i<=nomColonne.length-1;i++){
            SQL +=nomColonne[i];
            if(i< nomColonne.length-1){
                SQL+=",";
            }
        }
        SQL += ") VALUES(";
        for(i=0 ;i<=contenuTableau.length-1;i++){
            SQL +="'" + contenuTableau[i] + "'";
            if(i< contenuTableau.length-1){
                SQL+=",";
            }
        }
        SQL +=")";
        return this.executionUpdate(SQL);
    }
    public String queryUpdate(String nomTable ,String[] nomColonne, String[] contenuTableau ,String etat){
        ConnexionDataBase();
        int i;
        SQL = "UPDATE " + nomTable + " SET ";
        for(i=0 ;i<=nomColonne.length-1;i++){
            SQL +=""+ nomColonne[i] + "'" + contenuTableau[i] + "'";
            if(i< nomColonne.length-1){
                SQL+=",";
            }
        }
        SQL +=" WHERE " + etat;
        return this.executionUpdate(SQL);
    }
    
    public String queryDelete(String nomTable,String etat){
        ConnexionDataBase();
        SQL = "DELETE FROM " + nomTable + " WHERE " + etat ;
        return this.executionUpdate(SQL);
    }

}
