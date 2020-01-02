package com.MovieBookingSystem.API.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MovieBookingSystem.Decorator.ComboMix;
import com.MovieBookingSystem.Decorator.Malteser;
import com.MovieBookingSystem.Decorator.Nachos;
import com.MovieBookingSystem.Decorator.OmniPassDiscount;
import com.MovieBookingSystem.Decorator.ShareCombo;
import com.MovieBookingSystem.Decorator.SingleCombo;

@RestController
public class SnackController {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/snackDecorator")
	@ResponseBody
	public String comboMixAndMalteserWithDiscount() {
		
		StringBuilder sb = new StringBuilder();
		
		ComboMix comboMix = new SingleCombo();
		comboMix = new Malteser(comboMix);
		sb.append(comboMix.getComboType() + "\n" + "cost of: " + comboMix.comboMixPrice() + "\n");
		comboMix = new Nachos(comboMix);
		sb.append(comboMix.getComboType() + "\n" + "cost of: " + comboMix.comboMixPrice() + "\n");
		comboMix = new OmniPassDiscount(comboMix);
		sb.append(comboMix.getComboType() + "\n" + "cost of: " + comboMix.comboMixPrice());
		
		return sb.toString();
		
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/shareComboDecorator")
	@ResponseBody
	public String shareComboDecorator() {
		
		StringBuilder sb = new StringBuilder();
		
		ComboMix comboMix = new ShareCombo();
		comboMix = new Nachos(comboMix);
		sb.append(comboMix.getComboType() + "\n" + "cost of: " + comboMix.comboMixPrice() + "\n");
		comboMix = new Malteser(comboMix);
		sb.append(comboMix.getComboType() + "\n" + "cost of: " + comboMix.comboMixPrice() + "\n");
		
		return sb.toString();
	}

}
