package lesson24.labs.exercise06;

public class ContactsTest {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();

        contacts.firstName = "Julius";
        contacts.lastName = "Novachrono";
        contacts.email = "jnovachrono@cookmail.com";

        contacts.numberPhone = new String[3];
        contacts.numberPhone[0] = "(45) 9 98863-6793";
        contacts.numberPhone[1] = "(45) 9 98654-6168";
        contacts.numberPhone[2] = "(45) 9 98757-6697";
    }
}
