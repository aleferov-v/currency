package currency.person;

import java.util.Date;

/**
 * Документ, удостоверяющий личность
 */
public class DUL {

    /**
     * Тип документа
     */
    String type;
    /**
     * Серия документа
     */
    String seria;
    /**
     * Номер документа
     */
    String number;
    /**
     * Код учреждения
     */
    String code;
    /**
     * Дата выдачи
     */
    Date date;

    @Override
    public String toString() {
        return "DUL{" +
                "type='" + type + '\'' +
                ", seria='" + seria + '\'' +
                ", number='" + number + '\'' +
                ", code='" + code + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DUL dul = (DUL) o;

        if (type != null ? !type.equals(dul.type) : dul.type != null) return false;
        if (seria != null ? !seria.equals(dul.seria) : dul.seria != null) return false;
        if (number != null ? !number.equals(dul.number) : dul.number != null) return false;
        if (code != null ? !code.equals(dul.code) : dul.code != null) return false;
        return date != null ? date.equals(dul.date) : dul.date == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (seria != null ? seria.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
