package Decorator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.MovieBookingSystem.Decorator.ComboMix;
import com.MovieBookingSystem.Decorator.Malteser;
import com.MovieBookingSystem.Decorator.Nachos;
import com.MovieBookingSystem.Decorator.OmniPassDiscount;
import com.MovieBookingSystem.Decorator.ShareCombo;

public class ShareComboMixTest {
	
	@Mock
	private ComboMix shareComboMix;
	
	@BeforeEach
	void setUp() {
		shareComboMix = new ShareCombo();
	}
	
	@Test
	void testShareComboWithMalteser() {
		shareComboMix = new Malteser(shareComboMix);
		
		assertEquals(shareComboMix.comboMixPrice(),15.00,0);
	}
	
	@Test
	void testShareComboWithMalteserAndNachos() {
		shareComboMix = new Malteser(shareComboMix);
		shareComboMix = new Nachos(shareComboMix);
		
		assertEquals(shareComboMix.comboMixPrice(),18,0);
	}
	
	@Test
	void testShareComboWithMalteserAndOmniPassDiscount() {
		shareComboMix = new Malteser(shareComboMix);
		shareComboMix = new OmniPassDiscount(shareComboMix);
		
		assertEquals(shareComboMix.comboMixPrice(),13.5,0);
	}
	
	@Test
	void testShareComboWithNachos() {
		shareComboMix = new Nachos(shareComboMix);
		
		assertEquals(shareComboMix.comboMixPrice(),13.50,0);
	}
	
	@Test
	void testShareComboNachosWihtOmniPassDiscount() {
		shareComboMix = new Nachos(shareComboMix);
		shareComboMix = new OmniPassDiscount(shareComboMix);
		
		assertEquals(shareComboMix.comboMixPrice(),12.15,0);
	}
	
	@Test
	void testShareCombOmniPassDiscount() {
		shareComboMix = new OmniPassDiscount(shareComboMix);
		
		assertEquals(shareComboMix.comboMixPrice(),9.45,0);
	}
	
	@Test
	void testShareCombTotalMix() {
		shareComboMix = new Malteser(shareComboMix);
		shareComboMix = new Nachos(shareComboMix);
		shareComboMix = new OmniPassDiscount(shareComboMix);
		
		assertEquals(shareComboMix.comboMixPrice(),16.2,0);
	}

}
