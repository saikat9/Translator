package com.cognizant.translatorimpl;

import com.cognizant.ruleimpl.SelectQueryImpl;
import com.cognizant.ruleinterface.SelectQueryInterface;
import com.cognizant.translator.Translator;

public class SelectExprImpl implements Translator {
	
	private SelectQueryInterface selectQueryInterface;
	
	@Override
	public void applyRule(Object object) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Rule applied for Select in SelectExpr");
		selectQueryInterface = new SelectQueryImpl(object);
		selectQueryInterface.selectRule();
	}
}
