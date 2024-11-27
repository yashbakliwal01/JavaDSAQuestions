package com.in.excel;

public class ExcelTitleExample {
	    public String convertToTitle(int columnNumber) {
	        String res = "";
	        while(columnNumber!=0){
	            columnNumber--;
	            int remainder = columnNumber%26;
	            int ch = 'A' + remainder;
	            res = (char)ch+res;
	            columnNumber =columnNumber/26;
	        }
	        return res;
	    }
	}
