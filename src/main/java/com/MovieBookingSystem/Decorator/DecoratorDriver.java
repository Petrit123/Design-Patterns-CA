package com.MovieBookingSystem.Decorator;

public class DecoratorDriver {
	
	public static void main(String[] args) {
		
		ComboMix comboMix = new SingleCombo();
		System.out.println(comboMix.getComboType() + "\n" + "cost of: " + comboMix.comboMixPrice());
		
		System.out.println("\n\n");
		
		ComboMix comboMix2 = new SingleCombo();
		comboMix2 = new Malteser(comboMix2);
		System.out.println(comboMix2.getComboType() + "\n" + "cost of: " + comboMix2.comboMixPrice());
		comboMix2 = new Nachos(comboMix2);
		System.out.println(comboMix2.getComboType() + "\n" + "cost of: " + comboMix2.comboMixPrice());
		comboMix2 = new OmniPassDiscount(comboMix2);
		System.out.println(comboMix2.getComboType() + "\n" + "cost of: " + comboMix2.comboMixPrice());		
		
	}

}
