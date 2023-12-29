import java.util.HashMap;


public class IDandPasswords 
{
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords()
    {
        logininfo.put("Wilbur1", "helloworld1");
        logininfo.put("Wilbur2", "helloworld2");
        logininfo.put("Wilbur3", "helloworld3");
    }

    protected HashMap getLoginInfo()
    {
        return logininfo;
    }
}
