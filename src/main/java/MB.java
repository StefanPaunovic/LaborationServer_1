/**
 * Created by barhiw on 2016-11-10.
 */

//import bo.UserHandler;
import java.util.Collection;

import javax.faces.bean.SessionScoped;
import javax.el.MethodExpression;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@SessionScoped
@ManagedBean


public class MB {
    private String userName;
    private String passWord;


    public String getPassWord() { return passWord;
    }
    public void setPassWord(String passWord) { this.passWord = passWord;
    }

    public MB() { userName="enter username";
    }
    public String getUserName() { return userName;
    }
    public void setUserName(String userName) { this.userName = userName;
    }
    public boolean doLogin() {
        return UserHandler.login(userName, passWord);
    }
    public Collection getNames() {
        return UserHandler.getUserNamesByName(userName);
    } }
