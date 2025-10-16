
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void validPasswordShouldPass() {
        assertTrue(validator.isValid("Abc123$"));
    }

    @Test
    void tooShortPasswordShouldFail() {
        assertFalse(validator.isValid("Ab1$"));
    }

    @Test
    void missingUppercaseShouldFail() {
        assertFalse(validator.isValid("abc123$"));
    }

    @Test
    void missingNumberShouldFail() {
        assertFalse(validator.isValid("Abcdef$"));
    }

    @Test
    void missingSpecialCharShouldFail() {
        assertFalse(validator.isValid("Abc1234"));
    }
}
