package Decorator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.MovieBookingSystem.Decorator.ComboMix;
import com.MovieBookingSystem.Decorator.Malteser;
import com.MovieBookingSystem.Decorator.Nachos;
import com.MovieBookingSystem.Decorator.OmniPassDiscount;
import com.MovieBookingSystem.Decorator.SingleCombo;

public class SingleComboMixTest {
	@Mock
	private ComboMix singleComboMix;
	
	@BeforeEach
	void setUp() {
		singleComboMix = new SingleCombo();
	}
	
	@Test
	void testSingleComboWithMalteser() {
		singleComboMix = new Malteser(singleComboMix);
		
		assertEquals(singleComboMix.comboMixPrice(),12.00,0);
	}
	
	@Test
	void testSingleComboWithMalteserAndNachos() {
		singleComboMix = new Malteser(singleComboMix);
		singleComboMix = new Nachos(singleComboMix);
		
		assertEquals(singleComboMix.comboMixPrice(),15,0);
	}
	
	@Test
	void testSingleComboWithMalteserAndOmniPassDiscount() {
		singleComboMix = new Malteser(singleComboMix);
		singleComboMix = new OmniPassDiscount(singleComboMix);
		
		assertEquals(singleComboMix.comboMixPrice(),10.8,0);
	}
	
	@Test
	void testSingleComboWithNachos() {
		singleComboMix = new Nachos(singleComboMix);
		
		assertEquals(singleComboMix.comboMixPrice(),10.50,0);
	}
	
	@Test
	void testSingleComboNachosWihtOmniPassDiscount() {
		singleComboMix = new Nachos(singleComboMix);
		singleComboMix = new OmniPassDiscount(singleComboMix);
		
		assertEquals(singleComboMix.comboMixPrice(),9.45,0);
	}
	
	@Test
	void testSingleCombomniPassDiscount() {
		singleComboMix = new OmniPassDiscount(singleComboMix);
		
		assertEquals(singleComboMix.comboMixPrice(),6.75,0);
	}
	
	@Test
	void testShareCombTotalMix() {
		singleComboMix = new Malteser(singleComboMix);
		singleComboMix = new Nachos(singleComboMix);
		singleComboMix = new OmniPassDiscount(singleComboMix);
		
		assertEquals(singleComboMix.comboMixPrice(),13.5,0);
	}


}
