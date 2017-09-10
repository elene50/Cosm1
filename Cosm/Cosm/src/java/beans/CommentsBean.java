/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Logger;

/**
 *
 * @author Elena
 */
public class CommentsBean {

    private int idComm;
    private String login;
    private String text;
    public CommentsBean() {
    }

    public CommentsBean(int idComm, String login, String text) {
        this.idComm = idComm;
        this.login = login;
        this.text = text;
    }

   

    
    public String getLogin() {
        return login;
    }

    public String getText() {
        return text;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIdComm() {
        return idComm;
    }

    public void setIdComm(int idComm) {
        this.idComm = idComm;
    }
    
    
    
    
    
    
    
}
