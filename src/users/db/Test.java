
package users.db;

/**
 * Test class
 * @author Alexandre DUCREUX & Logan Lepage
 */
public class Test {
    
    public static void main (String[] args){
        
        //User user = new User("email@email.com", "123");
        //System.out.println(UserHandler.getDb().exists(user.getEmailUser()));
        //String emailUser = user.getEmailUser();
        //System.out.println("nom utilisateur : = "+user.getNameUser());
       // user = UserHandler.getDb().retrieve(emailUser);
        //System.out.println("nom utilisateur après retrieve : = "+user.getNameUser());
        System.out.println("\n-----------------------------------------------\n"+
                             "Test entrée login user : \n"+
                             "-----------------------------------------------");
        User user2 = new User("email@email.com", "12");
        UserHandler.getDb().createUser(user2);
        System.out.println("Résultat login : "+UserHandler.getDb().isValid(user2.getEmailUser(), user2.getPasswordUser()));
        
    }
    
}
