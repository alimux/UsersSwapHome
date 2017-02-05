package users.db;

/**
 * An interface for classes which represent a fake database of users .
 *
 * @author Alexandre DUCREUX & Logan Lepage Universit&eacute; de Caen Basse-Normandie, France.
 * @november 2016
 */
import java.util.List;

public interface IUserDB {

    /**
     * Adds a new user to this database. What happens if this product is already
     * in the database is to be defined by subclasses.
     *
     * @param user A user
     * @throws Exception if any error occurs
     */
    public void createUser(User user);


    /**
     * Returns true if the email exist.
     *
     * @return true or false
     */
    public boolean exists(String email);
    
    /**
     * methods which consists of verify if user exists
     * @param emailUser
     * @param passwordUser
     * @return boolean
     */
    public boolean isValid(String emailUser, String passwordUser);

    /**
     * method which consists of retrieving an existing user
     * @param emailUser
     * @return 
     */
    public User retrieve(String emailUser);

}
