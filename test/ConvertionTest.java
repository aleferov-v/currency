package currency.test;

import currency.convertion.ConvertionRequest;
import currency.services.ConvertionService;
import currency.convertion.Currency;
import currency.convertion.Money;
import org.junit.Assert;
import org.junit.Test;

public class ConvertionTest {


    @Test
    public void testConvertionDirectQuotation() {
        Money from = new Money(Currency.RUB, 100);
        Currency to = Currency.USD;
        ConvertionRequest request = new ConvertionRequest(from, to, 1, 56.80);

        Money result = ConvertionService.convert(request).getMoney();
        Assert.assertEquals(1.76, result.getAmount(), 0.1);
    }

    @Test
    public void testConvertionReverseQuotation() {
        Money from = new Money(Currency.USD, 100);
        Currency to = Currency.RUB;
        ConvertionRequest request = new ConvertionRequest(from, to, 56.80, 1);

        Money result = ConvertionService.convert(request).getMoney();
        Assert.assertEquals(5680, result.getAmount(), 0.1);
    }

    @Test
    public void testConvertionCrossQuotation() {
        Money from = new Money(Currency.USD, 100);
        Currency to = Currency.EUR;
        ConvertionRequest request = new ConvertionRequest(from, to, 56.80, 70.53);

        Money result = ConvertionService.convert(request).getMoney();
        Assert.assertEquals(80.53, result.getAmount(), 0.1);
    }
}
