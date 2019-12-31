package com.MovieBookingSystem.Decorator;

public class Malteser extends ComboMixDecorator {
	
	public Malteser(ComboMix comboMix) {

		this.comboMix = comboMix;
	}

	@Override
	public String getComboType() {
		return comboMix.getComboType() + " and a pack of maltesers";
	}

	@Override
	public double comboMixPrice() {
		return 4.50 + comboMix.comboMixPrice();
	}

}
