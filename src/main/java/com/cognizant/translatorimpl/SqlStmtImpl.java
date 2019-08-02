package com.cognizant.translatorimpl;

import com.cognizant.translator.Translator;

public class SqlStmtImpl implements Translator {
	
	@Override
	public void applyRule(Object object) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Rule applied for SqlStmt");
	}
	
}
