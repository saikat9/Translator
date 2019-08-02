package com.cognizant.translator;

public interface Translator {
	
	public void applyRule(Object obj) throws ClassNotFoundException, InstantiationException, IllegalAccessException;

}
