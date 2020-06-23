package diginamic.demo_tests_unitaires;
import static org.junit.Assert.*;

import org.junit.Test;


public class StringUtilsTest {
	
	@Test 
	public void testLevenshteinDistance() {
		int resultat1 = dev.utils.StringUtils.levenshteinDistance("mars", "mart");
		assertEquals(1, resultat1);
		
		int resultat2 = dev.utils.StringUtils.levenshteinDistance("chanteur", "chanteuse");
		assertEquals(2, resultat2);
		
		int resultat3 = dev.utils.StringUtils.levenshteinDistance("2zeEc", " ");
		assertEquals(5, resultat3);
		
		int resultat4 = dev.utils.StringUtils.levenshteinDistance(" ", "mart");
		assertEquals(4, resultat4);
		
		int resultat5 = dev.utils.StringUtils.levenshteinDistance("", "");
		assertEquals(0, resultat5);
		
	}

}
