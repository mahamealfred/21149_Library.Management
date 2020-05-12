/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.Dao;

import Library.Management.Model.Bookcategory;
import Library.Management.Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mahame
 */
public class BookcategoryDao {
    Session session=null;
    
    public void savebookcategory(Bookcategory clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.save(clt);
                tx.commit();
                session.close();
                
        
        
    }
     public void updatebookcategory(Bookcategory clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.update(clt);
                tx.commit();
                session.close();
                
        }
      public void deletebookcategory(Bookcategory clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.delete(clt);
                tx.commit();
                session.close();
                
        }
      public List<Bookcategory> displaybookcategory(){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
               List<Bookcategory> bookcategorys=(List<Bookcategory>) session.createCriteria(Bookcategory.class);
              tx.commit();
               
             session.close();
                return bookcategorys;
                
        }
      public List<Bookcategory> findclient(String id){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
               List<Bookcategory> bookcategorys=(List<Bookcategory>) session.createCriteria(Bookcategory.class).add(Restrictions.eq("categoryid", id));
              tx.commit();
               
             session.close();
                return bookcategorys;
                
        }
       public String getCategoryname(String id){
           String sql="select categoryname from Bookcategory where categoryid ='"+id+"'";
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
       Object name= session.createQuery(sql).uniqueResult();
              tx.commit();
               
             session.close();
                return name.toString();
                
        }
       
       public String getCategoryid(String name){
           String sql="select categoryid from Bookcategory where categoryname ='"+name+"'";
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
       Object id= session.createQuery(sql).uniqueResult();
              tx.commit();
               
             session.close();
                return id.toString();
                
        }
    
    
    
}
