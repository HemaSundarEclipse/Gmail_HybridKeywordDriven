package com.gmail.executionEngine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.gmail.config.ActionKeywords;
import com.gmail.utility.ExcelUtils;

public class DriverScript {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		ActionKeywords ak = new ActionKeywords();
		Method method[] = ak.getClass().getMethods();
		
		ExcelUtils.setExcelFile();
		for (int i = 0; i < ExcelUtils.getRowCount("Test Steps"); i++) {
			for (int j = 0; j < method.length; j++) {
				if (method[j].getName().equals(ExcelUtils.getCellData(j, 4, "Test Steps"))) {
					method[j].invoke(ak);
				} else {

				}
			}
		}

	}

}
