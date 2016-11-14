/**
 * Created by barhiw on 2016-11-10.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UserHandler {

    public static boolean login(String user, String pass) {
        if (user.compareToIgnoreCase("reine") == 0 &&
            pass.compareTo("tjo") == 0) return true;
    else
        return false; }
    public static Collection getUserNamesByName(String name) {
        ArrayList names = new ArrayList();
        Collection users = User.findByName(name);
        for (Iterator it = users.iterator(); it.hasNext();) {
            User user = (User) it.next();
            names.add(new String(user.getUserName()));
        }
        return names;
    }
}
