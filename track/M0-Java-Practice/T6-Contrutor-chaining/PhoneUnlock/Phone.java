public class Phone {
    
    public static void main(String[] args) {

        PhoneUnlock ph = new PhoneUnlock();
        Password password = new Password();

        ph.givePassword(password); // passing Password object to PhoneUnlock

        PhoneUnlock unlockedPhone = ph.unlock(); // receiving unlocked object

        if (unlockedPhone != null) {
            System.out.println("Access Granted");
        }
    }

}
