import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_throw_NullPointerException_when_null() {
        // Given
        Mommifier mommifier = new Mommifier();
        String stringWithNull = null;

        // When

        // Then
        assertThrows(NullPointerException.class, () -> mommifier.mommy(stringWithNull));
    }

    @Test
    void should_return_empty_string_when_string_is_empty() {
        // Given
        Mommifier mommifier = new Mommifier();
        String stringWithEmpty = "";

        // When
        String result = mommifier.mommy(stringWithEmpty);

        // Then
        assertEquals("", result);
    }

    @Test
    void should_return_string_itself_when_number_of_vowels_less_than_30_percent_of_string_length() {
        // Given
        Mommifier mommifier = new Mommifier();
        String stringWithNumberOfVowelsLessThan30 = "abcd";

        // When
        String result = mommifier.mommy(stringWithNumberOfVowelsLessThan30);

        // Then
        assertEquals("abcd", result);
    }

    @Test
    void should_return_itself_when_no_continuous_set_of_vowels() {
        // Given
        Mommifier mommifier = new Mommifier();
        String stringWithNoContinuousVowels = "aeiou";

        // When
        String result = mommifier.mommy(stringWithNoContinuousVowels);

        // Then
        assertEquals("aeiou", result);
    }

    @Test
    void should_return_string_insert_mommy_when_vowels_number_more_than_30_percent_and_contains_continuous_vowels() {
        // Given
        Mommifier mommifier = new Mommifier();
        String stringWithNumberOfVowelsMoreThan30AndContainsContinuousVowels = "aaa";

        // When
        String result = mommifier.mommy(stringWithNumberOfVowelsMoreThan30AndContainsContinuousVowels);

        // Then
        assertEquals("amommyamommya", result);
    }
}
