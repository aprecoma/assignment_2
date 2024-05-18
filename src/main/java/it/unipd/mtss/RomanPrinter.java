/////////////////////////////////////////////////////////
//  Andrea Precoma              2068227
//  Andrea Jesus Soranzo Mendez 2075539
/////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Map;

class RomanPrinter {
    private static final Map<String, String[]> asciiMap = Map.of(
        "I", new String[] {"  _____ ", " |_   _|", "   | |  ",
                            "   | |  ", "  _| |_ ", " |_____|"},
        "V", new String[] {" __      __", " \\ \\    / /", "  \\ \\  / / ",
                            "   \\ \\/ /  ", "    \\  /   ", "     \\/    "},
        "X", new String[] {" __   __", " \\ \\ / /", "  \\ V / ",
                            "   > <  ", "  / . \\ ", " /_/ \\_\\"},
        "L", new String[] {"  _      ", " | |     ", " | |     ",
                            " | |     ", " | |____ ", " |______|"},
        "C", new String[] {"   _____ ", "  / ____|", " | |     ",
                            " | |     ", " | |____ ", "  \\_____|"},
        "D", new String[] {"  _____  ", " |  __ \\ ", " | |  | |",
                            " | |  | |", " | |__| |", " |_____/ "},
        "M", new String[] {"  __  __ ", " |  \\/  |", " | \\  / |",
                            " | |\\/| |", " | |  | |", " |_|  |_|"}
    );

    public static String print(int num) throws NumberFormatException {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber.isEmpty()) {
            return "";
        }

        String asciiArt = "";
        for (int i = 0; i < 6; i++) {
            for (String c : romanNumber.split("")) {
                asciiArt += asciiMap.get(c)[i];
            }
            asciiArt += "\n";
        }
        return asciiArt;
    }
}
