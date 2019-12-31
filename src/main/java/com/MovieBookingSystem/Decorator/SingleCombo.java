package com.MovieBookingSystem.Decorator;

public class SingleCombo extends ComboMix {
	
	public SingleCombo() {
		comboType = "Single Combo: Single drink and single popcorn";
	}

	@Override
	public double comboMixPrice() {
		return 7.50;
	}

}
