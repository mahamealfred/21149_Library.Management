/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.Dao;

import Library.Management.Utils.HibernateUtil;
import com.sun.security.ntlm.Client;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mahame
 */
public class ClientDao {
    
    Session session=null;
    
    public void saveClient(Client clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.save(clt);
                tx.commit();
                session.close();
                
        
        
    }
     public void updateClient(Client clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.update(clt);
                tx.commit();
                session.close();
                
        }
      public void deleteClient(Client clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.delete(clt);
                tx.commit();
                session.close();
                
        }
      public List<Client> displayclient(){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
               List<Client> clients=(List<Client>) session.createCriteria(Client.class);
              tx.commit();
               
             session.close();
                return clients;
                
        }
      public List<Client> findclient(String id){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
               List<Client> clients=(List<Client>) session.createCriteria(Client.class).add(Restrictions.eq("regno", id));
              tx.commit();
               
             session.close();
                return clients;
                
        }
    
    
}
