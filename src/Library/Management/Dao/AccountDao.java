/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.Dao;

import Library.Management.Model.Account;
import Library.Management.Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mahame
 */
public class AccountDao {
    
    Session session= null;
    
    public void createAccount(Account acc){
        session = HibernateUtil.getSessionFactory().openSession();
         Transaction trct=session.beginTransaction();
         session.save(acc);
         trct.commit();
         session.close();
        
    }
    public String  searchUsername(String username){
        String password=null;
        session = HibernateUtil.getSessionFactory().openSession();
         Transaction trct=session.beginTransaction();
        
         List accounts=session.createCriteria(Account.class).add(Restrictions.eq("username", username)).setProjection(Projections.property("password")).list();
         trct.commit();
         session.close();
         for(Object act:accounts){
             password=act.toString();
         }
        return password;
    }
    
}
