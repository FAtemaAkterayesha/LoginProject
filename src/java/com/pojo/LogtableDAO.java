package com.pojo;

import com.util.NewHibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class LogtableDAO {

    public boolean doAdd(Logtable l) {
        boolean ret = false;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Serializable ser = s.save(l);
        s.getTransaction().commit();
        s.close();
        if (ser != null) {
            ret = true;
        } else {
            ret = false;
        }
        return ret;
    }

    public Logtable aUser(int id, String pass) {
        Logtable lo = null;
        List<Logtable> lis;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Logtable where id=:a and password=:b");
        q.setInteger("a", id);
        q.setString("b", pass);
        lis = q.list();
        try {      
        if (lis!= null) {
             lo = lis.get(0);          
        } else {    
           lo = null;  
        }
        } catch (Exception e) {
            return lo;
        }
        return lo;
    }

}
