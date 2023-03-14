package HashMapDemo;

import java.text.Collator;
import java.util.Collection;
import java.util.HashMap;

public class Bank {

    HashMap<Integer,Account> hs = new HashMap<>();

    public boolean addAccount(Account a)
    {
        if(hs.put(a.getAccount_No(),a)==null)
        {
            return true;
        }

        else return false;
    }

    public Account getAccount(Integer id)
    {

         return hs.get(id);

    }

    public boolean remAccount(Integer id)
    {

        if( hs.remove(id) == null)
        {
            return false;
        }
        return true;
    }

    public int getCount()
    {
        return hs.size();
    }

    public HashMap<Integer,Account> getAllAccounts()
    {
        return hs;
    }





}
