package maven_sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonValidationTest {

	@Test
    public void testValidPerson() {
        PersonValidation validator = new PersonValidation();
        assertTrue(validator.validatePerson("ram", 3025));
    }

    @Test
    public void testInvalidPerson() {
        PersonValidation validator = new PersonValidation();
        assertFalse(validator.validatePerson("john", 1234));
	}

}
