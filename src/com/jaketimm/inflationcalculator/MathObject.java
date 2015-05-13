package com.jaketimm.inflationcalculator;

public class MathObject {
	public double doMath(String beforeCurrency, String afterCurrency, double beforeVal, int beforeYear, int afterYear){
		
		if (afterYear > beforeYear){
			beforeVal = getInflationValue(beforeVal, beforeYear, afterYear, beforeCurrency);
		}
		if (afterYear < beforeYear){
			beforeVal = getInflationValue2(beforeVal, beforeYear, afterYear, beforeCurrency);
		}
		double returnValue = 0;
		beforeVal = convertToUSD(beforeVal, beforeCurrency);
		returnValue = (convertBack(beforeVal, afterCurrency));
		return returnValue;
	}
	public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
	public double getInflationValue2(double beforeValue, int beforeYear, int afterYear, String currency){
		CurrencyObject currencyObj = new CurrencyObject();
		while (beforeYear!=(afterYear)){
			beforeValue-=(beforeValue*currencyObj.getCurrency(beforeYear, currency));
			beforeYear--;
		}
		return beforeValue;
	}
	
	public double getInflationValue(double beforeValue, int beforeYear, int afterYear, String currency){
		CurrencyObject currencyObj = new CurrencyObject();
		while (beforeYear!=(afterYear)){
			beforeValue+=(beforeValue*currencyObj.getCurrency(beforeYear, currency));
			beforeYear++;
		}
		return beforeValue;
	}
	
	public double convertBack(double beforeVal, String currency){
		if (currency.equals("USD")){
			return beforeVal;
		}
		if (currency.equals("Euro")){
			return beforeVal * 0.82163;
		}
		if (currency.equals("Yen")){
			return beforeVal * 120.75;
		}
		if (currency.equals("Pound")){
			return beforeVal * 0.64444;
		}
		if (currency.equals("Ruble")){
			return beforeVal * 54.71;
		}
		if (currency.equals("Mexican Peso")){
			return beforeVal * 14.7539;
		}
		if (currency.equals("Canadian Dollar")){
			return beforeVal * 1.1623;
		}
		if (currency.equals("Australian Dollar")){
			return beforeVal * 1.2344;
		}
		if (currency.equals("Swiss Franc")){
			return beforeVal * 0.98785;
		}
		if (currency.equals("Renminbi")){
			return beforeVal * 0.16;
		}
		if (currency.equals("Rupee")){
			return beforeVal *  63.4418;
		}
		if (currency.equals("Rand")){
			return beforeVal * 11.6516;
		}
		if (currency.equals("South Korean Won")){
			return beforeVal *  1106.35;
		}
		else
		{
			return 1;
		}
	}
	
	public double convertToUSD(double beforeVal, String currency){
		if (currency.equals("USD")){
			return beforeVal;
		}
		if (currency.equals("Euro")){
			return beforeVal / 0.82163;
		}
		if (currency.equals("Yen")){
			return beforeVal / 120.75;
		}
		if (currency.equals("Pound")){
			return beforeVal / 0.64444;
		}
		if (currency.equals("Ruble")){
			return beforeVal / 54.71;
		}
		if (currency.equals("Mexican Peso")){
			return beforeVal / 14.7539;
		}
		if (currency.equals("Canadian Dollar")){
			return beforeVal / 1.1623;
		}
		if (currency.equals("Australian Dollar")){
			return beforeVal / 1.2344;
		}
		if (currency.equals("Swiss Franc")){
			return beforeVal / 0.98785;
		}
		if (currency.equals("Renminbi")){
			return beforeVal / 0.16;
		}
		if (currency.equals("Rupee")){
			return beforeVal /  63.4418;
		}
		if (currency.equals("Rand")){
			return beforeVal / 11.6516;
		}
		if (currency.equals("South Korean Won")){
			return beforeVal /  1106.35;
		}
		else
		{
			return 1;
		}
	}
}