package Decorator;

public abstract class ComboMix {
	
	String comboType = "Unknown combo type";
	
	public String getComboType() {

		return comboType;
	}
	
	public abstract double comboMixPrice();

}
