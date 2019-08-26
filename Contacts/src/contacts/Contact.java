/*
 * Fixed By: Keanna Wright
 * COMP 167
 * Lab1
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    

    public String getFirstName() {
        return firstName;
    }
    //gets firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //sets first name
    public String getLastName() {
        return lastName;
    }
    //gets last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //sets last name
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //gets phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //sets phone number
    public String getEmailAddress() {
        return emailAddress;
    }
    //get email
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    //sets email
        public String toString(){
        return getFirstName() + " " + getLastName() + " " + getPhoneNumber() + " " 
                + getEmailAddress();
    }
    
}
