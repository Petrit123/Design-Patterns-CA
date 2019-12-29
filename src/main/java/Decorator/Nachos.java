package Decorator;

public class Nachos extends ComboMixDecorator {
	
	public Nachos() {
		
		this.comboMix = comboMix;
	}

	@Override
	public String getComboType() {

		return comboMix.getComboType() + " and a nachos";
	}

	@Override
	public double comboMixPrice() {

		return 3.00 + comboMix.comboMixPrice();
	}

}
