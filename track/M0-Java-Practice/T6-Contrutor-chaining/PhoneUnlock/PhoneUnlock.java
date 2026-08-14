public class PhoneUnlock {

    void givePassword(Password password) {
        System.out.println("Password Received");
    }

    void givePin(Pin pin) {
        System.out.println("PIN Received");
    }

    void givePattern(Pattern pattern) {
        System.out.println("Pattern Received");
    }

    void giveFingerPrint(FingerPrint fingerPrint) {
        System.out.println("Fingerprint Received");
    }

    void giveFace(Face face) {
        System.out.println("Face Received");
    }

    PhoneUnlock unlock() {
        PhoneUnlock ph = new PhoneUnlock();
        System.out.println("Phone Unlocked");
        return ph;
    }
}