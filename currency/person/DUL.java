package currency.person;

import currency.services.Utils;

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
        return String.format("тип=%s, серия=%s, номер=%s, код=%s, выдан=%s", type, seria, number, code, Utils.createStringFromDate(date));
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
