public class phoneBuilder {

    // Making the Apple phone
    public phoneType buildApplephone() {
        phoneType phone = new phoneType();
        phone.addItem(new Apple());
        return phone;
    }

    public phoneType buildSamsungphone() {
        phoneType phone = new phoneType();
        phone.addItem(new Samsung());
        return phone;
    }
}
