package com.cognizant.translatorimpl;

import com.cognizant.translator.Translator;

public class ParseImpl implements Translator {
	
	@Override
	public void applyRule(Object object) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Rule applied for Parse");
	}
}
