public class phoneBuilder {

    public phoneType buildSonyphone() {
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
