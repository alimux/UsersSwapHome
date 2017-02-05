/**
 * @author Alexandre DUCREUX & Logan Lepage université Caen Basse-Normandie janvier 2017
 * Class consist to create an handler using Hibernate framework
 */
package users.db;

import java.sql.SQLException;
import javax.naming.NamingException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class UserHandler {
    
    /** The unique instance of class UserHibernateSQL (null if none). */
    private static UserHibernateSQL db;
    private static SessionFactory sessionFactory;
    
    
    /**
     * Returns the instance of UserHibernateSQL
     * @throws NamingException if strings host, database, username, password, or table cannot be found
     * @throws SQLException if any problem occurs for accessing the database
     */
    public static UserHibernateSQL getDb (){
        if (UserHandler.db==null) {
            UserHandler.init();
        }
        return UserHandler.db;
    }
    
    /**
     * Releases the connection to the database.
     * @throws SQLException if any problem occurs while closing the connection
     */
    public static void close () {
        if (sessionFactory!=null) {
            sessionFactory.close();
        }
    }
    
    // Helper methods =====================================================================

    /**
     * Initializes the connection to the database and the instance of UserHibernateSQL.
     * For each of these objects, nothing occurs if it is already initialized.
     * @throws NamingException if strings host, database, username, password, or table cannot be found
     * @throws SQLException if any problem occurs for accessing the database
     */
      public static void init () {
        Configuration configuration = null;
        ServiceRegistry registry = null;
	try {
            configuration = new Configuration().configure();
            registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        } catch (Throwable e) {
            System.out.println(e);
            StandardServiceRegistryBuilder.destroy(registry);
            throw e;
        }
          sessionFactory= configuration.buildSessionFactory(registry);
          db = new UserHibernateSQL(sessionFactory);
    }
    
    

}
