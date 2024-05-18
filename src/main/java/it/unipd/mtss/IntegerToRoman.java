/////////////////////////////////////////////////////////
//  Andrea Precoma              2068227
//  Andrea Jesus Soranzo Mendez 2075539
/////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Collections;
import java.util.TreeMap;

public class IntegerToRoman {

    private final static TreeMap<Integer,String> toRoman
            = new TreeMap<>(Collections.reverseOrder());

    static  {
        toRoman.put(1000, "M");
        toRoman.put(900, "CM");
        toRoman.put(500, "D");
        toRoman.put(400, "CD");
        toRoman.put(100, "C");
        toRoman.put(90, "XC");
        toRoman.put(50, "L");
        toRoman.put(40, "XL");
        toRoman.put(10, "X");
        toRoman.put(9, "IX");
        toRoman.put(5, "V");
        toRoman.put(4, "IV");
        toRoman.put(1, "I");
    }

    public static String convert(int number) throws NumberFormatException{
        if (number < 0 || number >= 5000) {
            throw new NumberFormatException("Numero non convertibile");
        }
        StringBuilder roman = new StringBuilder();
        for (Integer value : toRoman.keySet()) {
            while (number >= value) {
                number = number - value;
                roman.append(toRoman.get(value));
            }
        }
        return roman.toString();
    }
}
