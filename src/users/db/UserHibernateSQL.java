package users.db;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserHibernateSQL implements IUserDB {

    /**
     * Class wich communicate with Sql database
     * Create a session factory
     */
    private SessionFactory sessionFactory;

    public UserHibernateSQL(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    /**
     * create a user in DB
     * @param user 
     */
    @Override
    public void createUser(User user){
        Session session = sessionFactory.openSession();
        System.out.println("creation utilisateur de "+user+" mail :"+user.getEmailUser());
        Serializable save = session.save(user);
        session.flush();

        session.close();

    }
    /**
     * Test if a user exists
     * @param email
     * @return 
     */
    @Override
    public boolean exists(String email) {
        Session session = sessionFactory.openSession();
        boolean result = session.get(User.class, email) != null;
        session.close();
        return result;

    }
    /**
     * method which checking is an users exists
     * @param emailUser
     * @param passwordUser
     * @return 
     */
    @Override
    public boolean isValid(String emailUser, String passwordUser) {
        Session session = sessionFactory.openSession();
        User userIsValid = (User) session.get(User.class, emailUser);
        session.close();
        return userIsValid != null && emailUser.equals(userIsValid.getEmailUser()) && passwordUser.equals(userIsValid.getPasswordUser());
    }
    /**
     * retrieve user using email
     * @param emailUser
     * @return 
     */
    @Override
    public User retrieve(String emailUser) {
        Session session = sessionFactory.openSession();
        User user = (User) session.get(User.class, emailUser);
        session.close();
        return user;

    }

}
