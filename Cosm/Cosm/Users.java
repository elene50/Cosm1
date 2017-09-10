/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Home
 */
public class Users {

    private int ID;
    private String Login;
    private String Password;

    public Users() {
    }

    public Users(int ID, String Login, String Password) {
        this.ID = ID;
        this.Login = Login;
        this.Password = Password;
    }

    public int getID() {
        return ID;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "cos(" + "ID = " + ID + ", Login = " + Login + ", "
                + " Password = " + Password + ")";
    }
}