package com.program;

public class PrintNumberToWord {
    private String wordsTill20[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty" };

    private String tens[] = { "Zero", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
            "Seventy",
            "Eighty", "Ninety" };

    private String hundreds[] = { "", "hundred", "thousand", "lakh" };

    public static void main(String[] args) {
        PrintNumberToWord print = new PrintNumberToWord();
        int number = 9951303;
        System.out.println(print.printNumber(number));
    }

    public String printNumber(int number) {
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        String word = " ";
        switch (length) {
            case 1:
                // single Digit number
                word = wordsTill20[number];
                break;
            case 2:
                // Two Digit number
                Integer valueOfLessThan20 = Integer.valueOf(numberStr);
                if (valueOfLessThan20 < 21) {
                    word = wordsTill20[valueOfLessThan20];
                } else {
                    int firstDigit = Integer.valueOf(numberStr.substring(0, 1));
                    Integer secondDigit = Integer.valueOf(numberStr.substring(1, 2));
                    word = tens[firstDigit] + " "
                            + (secondDigit > 0 ? printNumber(secondDigit) : " ");
                }
                break;
            case 3:
                // Three Digit number
                int firstDigit = Integer.valueOf(numberStr.substring(0, 1));
                Integer secondDigit = Integer.valueOf(numberStr.substring(1, 3));
                word = printNumber(firstDigit) + " " + hundreds[1] + " "
                        + (secondDigit > 0 ? printNumber(secondDigit) : " ");
                break;
            case 4:
                // four Digit number
                firstDigit = Integer.valueOf(numberStr.substring(0, 1));
                secondDigit = Integer.valueOf(numberStr.substring(1, 4));
                word = printNumber(firstDigit) + " " + hundreds[2] + " "
                        + (secondDigit > 0 ? printNumber(secondDigit) : " ");
                break;
            case 5:
                // five Digit number
                firstDigit = Integer.valueOf(numberStr.substring(0, 2));
                secondDigit = Integer.valueOf(numberStr.substring(2, 5));
                word = printNumber(firstDigit) + " " + hundreds[2] + " "
                        + (secondDigit > 0 ? printNumber(secondDigit) : " ");
                break;
            case 6:
                // six Digit number
                firstDigit = Integer.valueOf(numberStr.substring(0, 1));
                secondDigit = Integer.valueOf(numberStr.substring(1, 6));
                word = printNumber(firstDigit) + " " + hundreds[3] + " "
                        + (secondDigit > 0 ? printNumber(secondDigit) : " ");
                break;
            case 7:
                // seven Digit number
                firstDigit = Integer.valueOf(numberStr.substring(0, 2));
                secondDigit = Integer.valueOf(numberStr.substring(2, 7));
                word = printNumber(firstDigit) + " " + hundreds[3] + " "
                        + (secondDigit > 0 ? printNumber(secondDigit) : " ");
                break;

        }
        return word;
    }
}
