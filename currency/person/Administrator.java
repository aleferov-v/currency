package currency.person;

/**
 * Класс, демонстрирующий возможность наследования классов
 */
public class Administrator extends Operator {

    private String password;

    public Administrator(String login, String vsp, String password) {
        super(login, vsp);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
