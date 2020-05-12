/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.Dao;

import Library.Management.Utils.HibernateUtil;
import java.awt.print.Book;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mahame
 */
public class BookDao {
    Session session=null;
    
    public void saveBook(Book clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.save(clt);
                tx.commit();
                session.close();
                
        
        
    }
     public void updateBook(Book clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.update(clt);
                tx.commit();
                session.close();
                
        }
      public void deleteBook(Book clt){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
                session.delete(clt);
                tx.commit();
                session.close();
                
        }
      public List<Book> displaybook(){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
               List<Book> books=(List<Book>) session.createCriteria(Book.class);
              tx.commit();
               
             session.close();
                return books;
                
        }
      public List<Book> findbook(String id){
        session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.getTransaction();
               List<Book> books=(List<Book>) session.createCriteria(Book.class).add(Restrictions.eq("bookid", id));
              tx.commit();
               
             session.close();
                return books;
                
        }
    
}
