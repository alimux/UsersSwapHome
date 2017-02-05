package users.db;
/*----------------------------------
 class fake DB
 ----------------------------------*/

/**
 * A class reprensenting a Customer / user A user consists of a name, first
 * name, adress, Zip code, city, email, passwordUser
 *
 * @author Alexandre DUCREUX
 * @since 4 novembre 2016
 */

public class User {

    /**
     * the name of the Customer / user
     */
    private String nameUser;
    /**
     * the First name of the Customer /user
     */
    private String firstNameUser;
    /**
     * the adress of the Customer /user
     */
    private String adressUser;
    /**
     * the Zipcode of the Customer /user
     */
    private int zipCodeUser;
    /**
     * the city of the Customer /user
     */
    private String cityUser;
    /**
     * a valid email of the Customer /user
     */
    private String emailUser;
    /**
     * the password of the Customer /user
     */
    private String passwordUser;
    /**
     * a valid country of the Customer /user
     */
    private String countryUser;

    /**
     * constructor Build a new user
     *
     * @param id
     * @param name for the nameUser
     * @param firstName for the firstNameUser
     * @param adress for the adressUser
     * @param zipCode for the zipCodeUser
     * @param city the countryUser
     * @param mail for the emailUser
     * @param passwd for the passwordUser
     * @param country for the countryUser
     */
    public User() {
        //default user
        this("", "", "", 0, "", "", "", "");
    }
    /**
     * constructor
     * @param name
     * @param firstName
     * @param adress
     * @param zipCode
     * @param city
     * @param mail
     * @param passwd
     * @param country 
     */
    public User(String name, String firstName, String adress, int zipCode, String city, String mail, String passwd, String country) {
        nameUser = name;
        firstNameUser = firstName;
        adressUser = adress;
        zipCodeUser = zipCode;
        cityUser = city;
        emailUser = mail;
        passwordUser = passwd;
        countryUser = country;

    }
    /**
     * constructor using to authentication
     * @param mail
     * @param passwd 
     */
    public User(String mail, String passwd) {
        emailUser = mail;
        passwordUser = passwd;

    }

    //getters 

    /**
     * Returns the nameUser of this user / Customer.
     *
     * @return The nameUser of this user
     */
    public String getNameUser() {
        return nameUser;
    }

    /**
     * Returns the firstNameUser of this user / Customer.
     *
     * @return The firstNameUser of this user
     */
    public String getFirstNameUser() {
        return firstNameUser;
    }

    /**
     * Returns the adresseUser of this user / Customer.
     *
     * @return The adressUser of this user
     */
    public String getAdressUser() {
        return adressUser;
    }

    /**
     * Returns the zipCodeUser of this user / Customer.
     *
     * @return The zipCodeUser of this user
     */
    public int getZipCodeUser() {
        return zipCodeUser;
    }

    /**
     * Returns the emailUser of this user / Customer.
     *
     * @return The emailUser of this user
     */
    public String getEmailUser() {
        return emailUser;
    }

    /**
     * Returns the passwordUser of this user / Customer.
     *
     * @return The passwordUser of this user
     */
    public String getPasswordUser() {
        return passwordUser;
    }

    /**
     * Returns the countryUser of this user / Customer.
     *
     * @return The countryUser of this user
     */
    public String getCountryUser() {
        return countryUser;
    }

    //setters


    /**
     * Sets the cityUser of this user.
     *
     * @param cityUser The new name for this user
     */
    public void setCityUser(String cityUser) {
        this.cityUser = cityUser;
    }

    /**
     * Sets the nameUser of this user.
     *
     * @param nameUser The new name for this user
     */
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    /**
     * Sets the firstName of this user.
     *
     * @param firstNameUser The new name for this user
     */
    public void setFirstNameUser(String firstNameUser) {
        this.firstNameUser = firstNameUser;
    }

    /**
     * Sets the adress of this user.
     *
     * @param adressUser The new name for this user
     */
    public void setAdressUser(String adressUser) {
        this.adressUser = adressUser;
    }

    /**
     * Sets the zip code of this user.
     *
     * @param zipCodeUser The new name for this user
     */
    public void setZipCodeUser(int zipCodeUser) {
        this.zipCodeUser = zipCodeUser;
    }

    /**
     * Sets the email of this user.
     *
     * @param emailUser The new name for this user
     */
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    /**
     * Sets the password of this user.
     *
     * @param passwordUser The new name for this user
     */
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    /**
     * Sets the country of this user.
     *
     * @param countryUser The new name for this user
     */
    public void setCountryUser(String passwordUser) {
        this.countryUser = countryUser;
    }
    /**
     * get city of the user
     * @return cityUser
     */
    public String getCityUser() {
        return cityUser;
    }

}
