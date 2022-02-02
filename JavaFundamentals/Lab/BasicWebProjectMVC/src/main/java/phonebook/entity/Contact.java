package phonebook.entity;

import org.springframework.stereotype.Component;

@Component
public class Contact {
    private String name;
    private String number;

    public Contact() {
    }

    public Contact(String name, String number) {
        setName(name);
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 6) {
            throw new IllegalArgumentException("Name should be more than 6 symbols");
        }
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
