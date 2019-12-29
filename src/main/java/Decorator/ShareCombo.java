package Decorator;

public class ShareCombo extends ComboMix {

	public ShareCombo() 
	{
		comboType = "Share Combo: 2 drinks and 2 popcorns";
	}
	
	@Override
	public double comboMixPrice() {
		
		return 10.50;
	}

}
