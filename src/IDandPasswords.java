import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Felix","Felix123");
        logininfo.put("Vladyslav","Hello07111");
        logininfo.put("Max","MaxPro");
    }

    protected HashMap getLoginInfo(){
        return logininfo;

    }
}
