public class Mommifier {
    public static String mommy(String givenString) {
        if (givenString.equals(null)) {
            throw new NullPointerException();
        }
        return givenString;
    }
}
