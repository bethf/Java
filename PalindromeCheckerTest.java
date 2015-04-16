package catchUpBeth;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeCheckerTest {

	@Test
	public void shouldReturnFalseForTaco() {
		assertFalse(PalindromeChecker.checkEquality("taco"));
	}

	@Test
	public void shouldReturnTrueForRacecar() {
		assertTrue(PalindromeChecker.checkEquality("racecar"));
		assertEquals(true, PalindromeChecker.checkEquality("racecar"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowAnExceptionForNullInput() {
		PalindromeChecker.checkEquality(null);
	}
	
	@Test
	public void shouldReturnTrueForLowerCase() {
		assertTrue(PalindromeChecker.checkEquality("mom"));
	}
	
	@Test
	public void shouldReturnTrueForUpperCase() {
		assertTrue(PalindromeChecker.checkEquality("DAD"));
	}
	
	@Test
	public void shouldReturnTrueForMixedCase() {
		assertTrue(PalindromeChecker.checkEquality("NOon"));
	}

}
