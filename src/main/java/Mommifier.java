public class Mommifier {
    public String mommy(String givenString) {
        if (givenString == null) {
            throw new NullPointerException();
        }

        if (givenString.equals("")) { return ""; }

        int continuousVowelsIndex = getContinuousVowelsIndex(givenString);
        if (isVowelsNumberMoreThan30Percent(givenString) && continuousVowelsIndex > -1) {
            StringBuilder insertMommyString = new StringBuilder(givenString).insert(continuousVowelsIndex + 1, "mommy");
            return mommy(insertMommyString.toString());
        }

        return givenString;
    }

    private boolean isVowelsNumberMoreThan30Percent(String givenString) {
        final String[] givenStringArray = givenString.split("");
        int vowelsNumber = 0;
        for (String string : givenStringArray) {
            if (isVowels(string)) {
                vowelsNumber++;
            }
        }

        int accountForVowelsNumber = (int)Math.ceil((float) vowelsNumber * 100 / (float) givenString.length());
        return accountForVowelsNumber > 30;
    }

    private int getContinuousVowelsIndex(String givenString) {
        final String[] givenStringArray = givenString.split("");
        for (int i = 1; i < givenStringArray.length; i++) {
            String left = givenStringArray[i-1];
            String right = givenStringArray[i];
            if (isVowels(left) && isVowels(right) && left.equals(right)) {
                return i - 1;
            }
        }

        return -1;
    }

    private boolean isVowels(String string) {
        return string.matches("[aeiou]");
    }
}
