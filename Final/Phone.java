
/**
 * Write a description of class Phone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Phone
{
    private String phoneServiceCompany;
    private int phoneNumber;
    private static int numberOfPhones;
    
    public Phone(String cpny, int phnnbr) {
        this.phoneServiceCompany = cpny;
        this.phoneNumber = phnnbr;
    }
    public String getphoneCompany() {
        return this.phoneServiceCompany;
    }
    public int getphoneNumber() {
        return this.phoneNumber;
    }
    public int getNumbersOfPhones() {
        return this.numberOfPhones;
    }
    public void changephoneNumber(int phnnbr) {
        this.phoneNumber = phnnbr;
    }
    public void changephoneNumber(String cpny) {
        this.phoneServiceCompany = cpny;
    }
    public String toString() {
        return "Your phone service is " + this.phoneServiceCompany + "\nYour phone number is " + this.phoneNumber;
    }
}
