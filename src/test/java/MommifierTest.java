import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_throw_NullPointerException_when_null() {
        assertThrows(NullPointerException.class, () -> Mommifier.mommy(null));
    }
}
