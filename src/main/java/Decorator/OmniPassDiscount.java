package Decorator;

public class OmniPassDiscount extends ComboMixDecorator {
	
	public OmniPassDiscount() {
		
		this.comboMix = comboMix;
	}

	@Override
	public String getComboType() {

		return comboMix.getComboType() + " with a cinema pass discount of 10%";
	}

	@Override
	public double comboMixPrice() {

		return comboMix.comboMixPrice() - (0.10 * comboMix.comboMixPrice());
	}

}
