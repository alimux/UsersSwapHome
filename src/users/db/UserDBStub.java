package users.db;

/**
 * A fake database of users .
 *
 * @author Alexandre DUCREUX & Logan Lepage Universit&eacute; de Caen Basse-Normandie, France.
 * @november 2016
 */
import java.util.List;
import java.util.ArrayList;

public class UserDBStub implements IUserDB {

    /**
     * The internal representation of the database.
     */
    protected static final List<User> USERS = new ArrayList<>();

    /**
     * a method wich consists of create a new user and it on a USER ArrayList
     */
    @Override
    public void createUser(User user) {
        UserDBStub.USERS.add(user);
    }

    /**
     * a methode wich returns a boolean value if an email exist
     * @param email
     */
    @Override
    public boolean exists(String email) {
        for (User USERS1 : UserDBStub.USERS) {
            if (email.equals(USERS1.getEmailUser())) {
                return true;
            }

        }
        return false;
    }
    /**
     * method which checking is an users exists
     * @param email
     * @param password
     * @return 
     */
    @Override
    public boolean isValid(String email, String password) {
        for (User USER1 : UserDBStub.USERS) {
            if (email.equals(USER1.getEmailUser()) && password.equals(USER1.getPasswordUser())) {
                return true;
            }
        }
        return false;
    }
    /**
     * retrieve user using email
     * @param email
     * @return
     * @throws java.lang.IndexOutOfBoundsException 
     */
    @Override
    public User retrieve(String email) throws java.lang.IndexOutOfBoundsException {
        for (User USER1 : UserDBStub.USERS) {
            if (email.equals(USER1.getEmailUser())) {
                return USER1;
            }
        }
        throw new IndexOutOfBoundsException("User not found ! : " + email);

    }

}