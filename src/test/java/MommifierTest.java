import org.junit.jupiter.api.Test;
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
}
