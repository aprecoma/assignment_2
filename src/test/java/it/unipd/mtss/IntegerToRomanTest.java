package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class IntegerToRomanTest {

    @Test
    public void Number0() {
        String roman;
        roman = IntegerToRoman.convert(0);
        assertEquals(roman,"");
    }

    @Test
    public void PseudoRandomNumbers() {
        int[] numbers = {4,11,58,149,201,478,1438,4622};
        String[] expected = {"IV","XI","LVIII","CXLIX","CCI","CDLXXVIII","MCDXXXVIII","MMMMDCXXII"};
        String[] romans = new String[numbers.length];
        for (int i = 0; i< numbers.length;i++) {
            romans[i] = IntegerToRoman.convert(numbers[i]);
        }
        assertArrayEquals(expected,romans);
    }

    @Test(expected=NumberFormatException.class)
    public void NegativeNumber() {
        IntegerToRoman.convert(-4);
    }

    @Test(expected=NumberFormatException.class)
    public void Over5000() {
        IntegerToRoman.convert(6754);
    }
}
