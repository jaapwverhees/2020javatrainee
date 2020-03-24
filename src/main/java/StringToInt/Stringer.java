package StringToInt;

public class Stringer {

    //TODO add functionality for numbers > 9;
    public int stringAdder(String string) {

        //set returnvalue to zero
        int sum = 0;
        //check first Char. to do this in the for loop invokes a indexOutOfBoundExeption.
        //TODO find cleaner solution.
        if (Character.isDigit(string.charAt(0))) {
            sum += Character.getNumericValue(string.charAt(0));
        }
        //check remaining Chars.
        for (int i = 1; i < string.length(); i++) {
            //First check negative numbers
            if (Character.isDigit(string.charAt(i)) && string.charAt(i - 1) == '-') {
                sum -= Character.getNumericValue(string.charAt(i));
            } else {
                //check positieve numbers
                if (Character.isDigit(string.charAt(i))) {
                    sum += Character.getNumericValue(string.charAt(i));
                }
            }
        }
        return sum;
    }

    //TODO add functionality for numbers > 9;
    public int stringAdderNotNegative(String string) throws Exception {

        //set returnvalue to zero
        int sum = 0;
        String errorMessage = "";
        //check first Char. to do this in the for loop invokes a indexOutOfBoundExeption.
        //TODO find cleaner solution.
        if (Character.isDigit(string.charAt(0))) {
            sum += Character.getNumericValue(string.charAt(0));
        }
        //check remaining Chars.
        for (int i = 1; i < string.length(); i++) {
            //First check negative numbers
            if (Character.isDigit(string.charAt(i)) && string.charAt(i - 1) == '-') {
                errorMessage += " -" + string.charAt(i);
            } else {
                //check positieve numbers
                if (Character.isDigit(string.charAt(i))) {
                    sum += Character.getNumericValue(string.charAt(i));
                }
            }
        }
        if (!errorMessage.equals("")) {
            throw new Exception("Negatives are not allowed, negatives are:" + errorMessage);
        } else {
            return sum;
        }
    }

}
