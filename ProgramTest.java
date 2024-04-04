import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProgramTest {
    @Test
    public void IsPrime_IsValidPrime_ReturnTrue() {
        //arrange

        // act
        boolean isPrime = Program.isPrime(7);

        // assert
        assertTrue(isPrime);

    }

    @Test
    public void isPrime_ZeroValue_ReturnFalse() {

        boolean isPrime = Program.isPrime(0);
        assertFalse(isPrime);
    }

    @Test
    public void isPrime_NotValidPrime_ReturnFalse() {
        boolean isPrime = Program.isPrime(9);
        assertFalse(isPrime);
    }
}
