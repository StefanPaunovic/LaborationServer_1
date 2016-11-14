import java.util.Collection;

/**
 * Created by barhiw on 2016-11-10.
 */
public class User {

    private String userName, psw;
    private int id;
    User(String userName, String psw){

       // this.id=id;
        this.userName=userName;
        this.psw=psw;

    }

    public String getUserName() {
        return userName;
    }

    public String getPsw() {
        return psw;
    }

    public int getId() {
        return id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean doLogin() {
        return UserHandler.login(userName, psw);
    }
    public static Collection findByName(String name) { return User.findByName(name);
    }
}
