package com.cognizant.ruleimpl;

import com.cognizant.model.SelectExpr;
import com.cognizant.ruleinterface.SelectQueryInterface;

public class SelectQueryImpl implements SelectQueryInterface {
	
	Object object;
	
	public SelectQueryImpl(Object object){
		this.object = object;
	}

	@Override
	public void selectRule() {
		SelectExpr selectExpr = (SelectExpr) object;
		if(selectExpr.getTerminal().getValue().equalsIgnoreCase("sel"))
			selectExpr.getTerminal().setValue("select");
	}

}
