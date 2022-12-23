/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DbConnection;

/**
 *
 * @author nwjsh
 */
public class Controller {
    public int DeleteUser(int id){
        DbConnection DbConnection = new DbConnection();
        String DeleteQuerry= String.format("delete from userdata where id=%d",id);
        int result = DbConnection.manipulate(DeleteQuerry);
        return result;
        }
}
