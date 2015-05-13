package com.jaketimm.inflationcalculator;

public class CurrencyObject {
	public String currencyName;
	//sets the name of the currency object
	public void setCurrencyName(String name)
	{
		this.currencyName = name;
	}
	//returns the name of the currency
	public String getCurrencyName()
	{
		return this.currencyName;
	}
	//returns the value of the currency, based on the specified year and the name of the currency
	public double getCurrency(int year, String currency){
		if (currency.equals("USD")){
			return getInflationRateUSD(year);
		}
		if (currency.equals("Euro")){
			return getInflationRateEuro(year);
		}
		if (currency.equals("Yen")){
			return getInflationRateYen(year);
		}
		if (currency.equals("Pound")){
			return getInflationRatePound(year);
		}
		if (currency.equals("Ruble")){
			return getInflationRateRuble(year);
		}
		if (currency.equals("Mexican Peso")){
			return getInflationRatePeso(year);
		}
		if (currency.equals("Canadian Dollar")){
			return getInflationRateCND(year);
		}
		if (currency.equals("Australian Dollar")){
			return getInflationRateAUS(year);
		}
		if (currency.equals("Swiss Franc")){
			return getInflationRateSwissFranc(year);
		}
		if (currency.equals("Renminbi")){
			return getInflationRateRenminbi(year);
		}
		if (currency.equals("Rupee")){
			return getInflationRateRupee(year);
		}
		if (currency.equals("Rand")){
			return getInflationRateRand(year);
		}
		if (currency.equals("South Korean Won")){
			return getInflationRateWon(year);
		}
		return 0;
	}
	
	private double getInflationRateWon(int year) {
		if ((year < 1952 || year > 2014)){
			return 0.034383;
		}
		if (year == 1952){
			return 1.0284;
		}
		if (year == 1953){
			return 0.4465;
		}
		if (year == 1954){
			return 0.717;
		}
		if (year == 1955){
			return 0.1798;
		}
		if (year == 1956){
			return 0.4571;
		}
		if (year == 1957){
			return -0.0664;
		}
		if (year == 1958){
			return 0.0362;
		}
		if (year == 1959){
			return 0.071;
		}
		if (year == 1960){
			return 0.1041;
		}
		if (year == 1961){
			return -0.0048;
		}
		if (year == 1962){
			return 0.1809;
		}
		if (year == 1963){
			return 0.3217;
		}
		if (year == 1964){
			return 0.1965;
		}
		if (year == 1965){
			return 0.0742;
		}
		if (year == 1966){
			return 0.1316;
		}
		if (year == 1967){
			return 0.1309;
		}
		if (year == 1968){
			return 0.1174;
		}
		if (year == 1969){
			return 0.1487;
		}
		if (year == 1970){
			return 0.1586;
		}
		if (year == 1971){
			return 0.0794;
		}
		if (year == 1972){
			return 0.0785;
		}
		if (year == 1973){
			return 0.1278;
		}
		if (year == 1974){
			return 0.2544;
		}
		if (year == 1975){
			return 0.2303;
		}
		if (year == 1976){
			return 0.0972;
		}
		if (year == 1977){
			return 0.133;
		}
		if (year == 1978){
			return 0.1409;
		}
		if (year == 1979){
			return 0.2539;
		}
		if (year == 1980){
			return 0.2876;
		}
		if (year == 1981){
			return 0.1241;
		}
		if (year == 1982){
			return 0.0513;
		}
		if (year == 1983){
			return 0.018;
		}
		if (year == 1984){
			return 0.0211;
		}
		if (year == 1985){
			return 0.0366;
		}
		if (year == 1986){
			return 0.0088;
		}
		if (year == 1987){
			return 0.0623;
		}
		if (year == 1988){
			return 0.0678;
		}
		if (year == 1989){
			return 0.0732;
		}
		if (year == 1990){
			return 0.0916;
		}
		if (year == 1991){
			return 0.0772;
		}
		if (year == 1992){
			return 0.0451;
		}
		if (year == 1993){
			return 0.0635;
		}
		if (year == 1994){
			return 0.052;
		}
		if (year == 1995){
			return 0.048;
		}
		if (year == 1996){
			return 0.0468;
		}
		if (year == 1997){
			return 0.0829;
		}
		if (year == 1998){
			return 0.0146;
		}
		if (year == 1999){
			return 0.0189;
		}
		if (year == 2000){
			return 0.0344;
		}
		if (year == 2001){
			return 0.0264;
		}
		if (year == 2002){
			return 0.0381;
		}
		if (year == 2003){
			return 0.0339;
		}
		if (year == 2004){
			return 0.034;
		}
		if (year == 2005){
			return 0.0222;
		}
		if (year == 2006){
			return 0.0168;
		}
		if (year == 2007){
			return 0.0389;
		}
		if (year == 2008){
			return 0.0375;
		}
		if (year == 2009){
			return 0.0352;
		}
		if (year == 2010){
			return 0.0344;
		}
		if (year == 2011){
			return 0.0342;
		}
		if (year == 2012){
			return 0.0151;
		}
		if (year == 2013){
			return 0.0112;
		}
		if (year == 2014){
			return 0.0067;
		}
		return 0.034383;
	}
	private double getInflationRateRand(int year) {
		if ((year < 1958 || year > 2014)){
			return 0.079579;
		}
		if (year == 1958){
			return 0.0241;
		}
		if (year == 1959){
			return 0.0034;
		}
		if (year == 1960){
			return 0.0201;
		}
		if (year == 1961){
			return 0.0164;
		}
		if (year == 1962){
			return 0.0194;
		}
		if (year == 1963){
			return 0.0064;
		}
		if (year == 1964){
			return 0.0473;
		}
		if (year == 1965){
			return 0.0331;
		}
		if (year == 1966){
			return 0.0379;
		}
		if (year == 1967){
			return 0.0197;
		}
		if (year == 1968){
			return 0.0303;
		}
		if (year == 1969){
			return 0.0348;
		}
		if (year == 1970){
			return 0.0526;
		}
		if (year == 1971){
			return 0.075;
		}
		if (year == 1972){
			return 0.0698;
		}
		if (year == 1973){
			return 0.1087;
		}
		if (year == 1974){
			return 0.1373;
		}
		if (year == 1975){
			return 0.1034;
		}
		if (year == 1976){
			return 0.125;
		}
		if (year == 1977){
			return 0.1111;
		}
		if (year == 1978){
			return 0.1125;
		}
		if (year == 1979){
			return 0.1348;
		}
		if (year == 1980){
			return 0.1584;
		}
		if (year == 1981){
			return 0.1367;
		}
		if (year == 1982){
			return 0.1429;
		}
		if (year == 1983){
			return 0.1053;
		}
		if (year == 1984){
			return 0.1369;
		}
		if (year == 1985){
			return 0.2094;
		}
		if (year == 1986){
			return 0.1602;
		}
		if (year == 1987){
			return 0.1418;
		}
		if (year == 1988){
			return 0.134;
		}
		if (year == 1989){
			return 0.1527;
		}
		if (year == 1990){
			return 0.1425;
		}
		if (year == 1991){
			return 0.1619;
		}
		if (year == 1992){
			return 0.096;
		}
		if (year == 1993){
			return 0.0997;
		}
		if (year == 1994){
			return 0.0969;
		}
		if (year == 1995){
			return 0.0684;
		}
		if (year == 1996){
			return 0.0933;
		}
		if (year == 1997){
			return 0.0573;
		}
		if (year == 1998){
			return 0.0888;
		}
		if (year == 1999){
			return 0.0265;
		}
		if (year == 2000){
			return 0.0712;
		}
		if (year == 2001){
			return 0.0501;
		}
		if (year == 2002){
			return 0.1254;
		}
		if (year == 2003){
			return -0.02;
		}
		if (year == 2004){
			return 0.0206;
		}
		if (year == 2005){
			return 0.021;
		}
		if (year == 2006){
			return 0.0518;
		}
		if (year == 2007){
			return 0.0827;
		}
		if (year == 2008){
			return 0.0838;
		}
		if (year == 2009){
			return 0.0589;
		}
		if (year == 2010){
			return 0.0359;
		}
		if (year == 2011){
			return 0.0638;
		}
		if (year == 2012){
			return 0.0547;
		}
		if (year == 2013){
			return 0.0578;
		}
		if (year == 2014){
			return 0.0456;
		}
		return 0.079579;
	}
	private double getInflationRateRupee(int year) {
		if ((year < 1958 || year > 2014)){
			return 0.076991;
		}
		if (year == 1958){
			return 0.0549;
		}
		if (year == 1959){
			return 0.043;
		}
		if (year == 1960){
			return 0.0065;
		}
		if (year == 1961){
			return 0.0345;
		}
		if (year == 1962){
			return 0.0229;
		}
		if (year == 1963){
			return 0.0774;
		}
		if (year == 1964){
			return 0.1777;
		}
		if (year == 1965){
			return 0.0482;
		}
		if (year == 1966){
			return 0.1394;
		}
		if (year == 1967){
			return 0.1169;
		}
		if (year == 1968){
			return -0.0554;
		}
		if (year == 1969){
			return 0.042;
		}
		if (year == 1970){
			return 0.0391;
		}
		if (year == 1971){
			return 0.0541;
		}
		if (year == 1972){
			return 0.0826;
		}
		if (year == 1973){
			return 0.2567;
		}
		if (year == 1974){
			return 0.2354;
		}
		if (year == 1975){
			return -0.0857;
		}
		if (year == 1976){
			return 0.0298;
		}
		if (year == 1977){
			return 0.0585;
		}
		if (year == 1978){
			return 0.022;
		}
		if (year == 1979){
			return 0.1173;
		}
		if (year == 1980){
			return 0.1074;
		}
		if (year == 1981){
			return 0.117;
		}
		if (year == 1982){
			return 0.0783;
		}
		if (year == 1983){
			return 0.1378;
		}
		if (year == 1984){
			return 0.0442;
		}
		if (year == 1985){
			return 0.0696;
		}
		if (year == 1986){
			return 0.094;
		}
		if (year == 1987){
			return 0.0944;
		}
		if (year == 1988){
			return 0.0801;
		}
		if (year == 1989){
			return 0.0545;
		}
		if (year == 1990){
			return 0.1609;
		}
		if (year == 1991){
			return 0.1287;
		}
		if (year == 1992){
			return 0.057;
		}
		if (year == 1993){
			return 0.0913;
		}
		if (year == 1994){
			return 0.0989;
		}
		if (year == 1995){
			return 0.09;
		}
		if (year == 1996){
			return 0.1111;
		}
		if (year == 1997){
			return 0.0971;
		}
		if (year == 1998){
			return 0.0937;
		}
		if (year == 1999){
			return 0.0262;
		}
		if (year == 2000){
			return 0.0325;
		}
		if (year == 2001){
			return 0.0494;
		}
		if (year == 2002){
			return 0.0343;
		}
		if (year == 2003){
			return 0.0435;
		}
		if (year == 2004){
			return 0.0437;
		}
		if (year == 2005){
			return 0.0437;
		}
		if (year == 2006){
			return 0.0672;
		}
		if (year == 2007){
			return 0.0551;
		}
		if (year == 2008){
			return 0.1045;
		}
		if (year == 2009){
			return 0.1622;
		}
		if (year == 2010){
			return 0.093;
		}
		if (year == 2011){
			return 0.0532;
		}
		if (year == 2012){
			return 0.1162;
		}
		if (year == 2013){
			return 0.0724;
		}
		if (year == 2014){
			return 0.0676;
		}
		return 0.076991;
	}
	private double getInflationRateRenminbi(int year) {
		if ((year < 1993 || year > 2014)){
			return 0.024375;
		}
		if (year == 1993){
			return 0.211;
		}
		if (year == 1994){
			return 0.241;
		}
		if (year == 1995){
			return 0.09;
		}
		if (year == 1996){
			return 0.059;
		}
		if (year == 1997){
			return 0.003;
		}
		if (year == 1998){
			return -0.012;
		}
		if (year == 1999){
			return -0.002;
		}
		if (year == 2000){
			return 0.012;
		}
		if (year == 2001){
			return -0.0101;
		}
		if (year == 2002){
			return 0.0037;
		}
		if (year == 2003){
			return 0.0321;
		}
		if (year == 2004){
			return 0.018;
		}
		if (year == 2005){
			return 0.0229;
		}
		if (year == 2006){
			return 0.022;
		}
		if (year == 2007){
			return 0.0711;
		}
		if (year == 2008){
			return 0.0096;
		}
		if (year == 2009){
			return 0.014;
		}
		if (year == 2010){
			return 0.05;
		}
		if (year == 2011){
			return 0.0458;
		}
		if (year == 2012){
			return 0.019;
		}
		if (year == 2013){
			return 0.0251;
		}
		if (year == 2014){
			return 0.0143;
		}
		return 0.024375;
	}
	private double getInflationRateSwissFranc(int year) {
		if (year < 1983 || year > 2014){
			return 0.014984;
		}
		if (year == 1983){
			return 0.0266;
		}
		if (year == 1984){
			return 0.0354;
		}
		if (year == 1985){
			return 0.022;
		}
		if (year == 1986){
			return 0.0066;
		}
		if (year == 1987){
			return 0.0156;
		}
		if (year == 1988){
			return 0.0225;
		}
		if (year == 1989){
			return 0.0506;
		}
		if (year == 1990){
			return 0.0551;
		}
		if (year == 1991){
			return 0.0487;
		}
		if (year == 1992){
			return 0.0346;
		}
		if (year == 1993){
			return 0.0208;
		}
		if (year == 1994){
			return 0.0101;
		}
		if (year == 1995){
			return 0.0152;
		}
		if (year == 1996){
			return 0.0083;
		}
		if (year == 1997){
			return 0.0002;
		}
		if (year == 1998){
			return 0.0007;
		}
		if (year == 1999){
			return 0.0159;
		}
		if (year == 2000){
			return 0.013;
		}
		if (year == 2001){
			return 0.0052;
		}
		if (year == 2002){
			return 0.0085;
		}
		if (year == 2003){
			return 0.0017;
		}
		if (year == 2004){
			return 0.012;
		}
		if (year == 2005){
			return 0.0129;
		}
		if (year == 2006){
			return 0.001;
		}
		if (year == 2007){
			return 0.0243;
		}
		if (year == 2008){
			return 0.0014;
		}
		if (year == 2009){
			return 0.0102;
		}
		if (year == 2010){
			return 0.0028;
		}
		if (year == 2011){
			return -0.0075;
		}
		if (year == 2012){
			return -0.003;
		}
		if (year == 2013){
			return 0.00;
		}
		if (year == 2014){
			return 0.0081;
		}
		return 0.014984;
	}
	private double getInflationRateAUS(int year) {
		if (year < 1949 || year > 2014){
			return 0.0531;
		}
		if (year == 1949){
			return 0.0824;
		}
		if (year == 1950){
			return 0.1212;
		}
		if (year == 1951){
			return 0.2478;
		}
		if (year == 1952){
			return 0.0897;
		}
		if (year == 1953){
			return 0.0176;
		}
		if (year == 1954){
			return 0.0087;
		}
		if (year == 1955){
			return 0.0343;
		}
		if (year == 1956){
			return 0.0637;
		}
		if (year == 1957){
			return 0.0105;
		}
		if (year == 1958){
			return 0.0155;
		}
		if (year == 1959){
			return 0.0228;
		}
		if (year == 1960){
			return 0.0447;
		}
		if (year == 1961){
			return 0.0047;
		}
		if (year == 1962){
			return 0.00;
		}
		if (year == 1963){
			return 0.0095;
		}
		if (year == 1964){
			return 0.0352;
		}
		if (year == 1965){
			return 0.0407;
		}
		if (year == 1966){
			return 0.0261;
		}
		if (year == 1967){
			return 0.0318;
		}
		if (year == 1968){
			return 0.0268;
		}
		if (year == 1969){
			return 0.03;
		}
		if (year == 1970){
			return 0.0466;
		}
		if (year == 1971){
			return 0.0723;
		}
		if (year == 1972){
			return 0.0503;
		}
		if (year == 1973){
			return 0.1318;
		}
		if (year == 1974){
			return 0.1674;
		}
		if (year == 1975){
			return 0.1395;
		}
		if (year == 1976){
			return 0.1412;
		}
		if (year == 1977){
			return 0.0891;
		}
		if (year == 1978){
			return 0.0784;
		}
		if (year == 1979){
			return 0.1028;
		}
		if (year == 1980){
			return 0.0926;
		}
		if (year == 1981){
			return 0.1104;
		}
		if (year == 1982){
			return 0.1117;
		}
		if (year == 1983){
			return 0.0766;
		}
		if (year == 1984){
			return 0.0323;
		}
		if (year == 1985){
			return 0.0855;
		}
		if (year == 1986){
			return 0.0964;
		}
		if (year == 1987){
			return 0.0705;
		}
		if (year == 1988){
			return 0.0733;
		}
		if (year == 1989){
			return 0.081;
		}
		if (year == 1990){
			return 0.0616;
		}
		if (year == 1991){
			return 0.0158;
		}
		if (year == 1992){
			return 0.006;
		}
		if (year == 1993){
			return 0.0175;
		}
		if (year == 1994){
			return 0.0301;
		}
		if (year == 1995){
			return 0.046;
		}
		if (year == 1996){
			return 0.0143;
		}
		if (year == 1997){
			return -0.0022;
		}
		if (year == 1998){
			return 0.0147;
		}
		if (year == 1999){
			return 0.0214;
		}
		if (year == 2000){
			return 0.0587;
		}
		if (year == 2001){
			return 0.0306;
		}
		if (year == 2002){
			return 0.0317;
		}
		if (year == 2003){
			return 0.0223;
		}
		if (year == 2004){
			return 0.0251;
		}
		if (year == 2005){
			return 0.0286;
		}
		if (year == 2006){
			return 0.0297;
		}
		if (year == 2007){
			return 0.0339;
		}
		if (year == 2008){
			return 0.0327;
		}
		if (year == 2009){
			return 0.0238;
		}
		if (year == 2010){
			return 0.0289;
		}
		if (year == 2011){
			return 0.0258;
		}
		if (year == 2012){
			return 0.0229;
		}
		if (year == 2013){
			return 0.0362;
		}
		if (year == 2014){
			return 0.0332;
		}
		return 0.0531;
	}
	private double getInflationRateCND(int year) {
		if (year < 1989 || year > 2014){
			return 0.021504;
		}
		if (year == 1989){
			return 0.055;
		}
		if (year == 1990){
			return 0.0691;
		}
		if (year == 1991){
			return 0.0159;
		}
		if (year == 1992){
			return 0.0204;
		}
		if (year == 1993){
			return 0.0129;
		}
		if (year == 1994){
			return 0.0058;
		}
		if (year == 1995){
			return 0.0162;
		}
		if (year == 1996){
			return 0.0216;
		}
		if (year == 1997){
			return 0.0111;
		}
		if (year == 1998){
			return 0.0066;
		}
		if (year == 1999){
			return 0.0219;
		}
		if (year == 2000){
			return 0.0299;
		}
		if (year == 2001){
			return 0.0135;
		}
		if (year == 2002){
			return 0.0451;
		}
		if (year == 2003){
			return 0.0127;
		}
		if (year == 2004){
			return 0.0194;
		}
		if (year == 2005){
			return 0.0275;
		}
		if (year == 2006){
			return 0.0111;
		}
		if (year == 2007){
			return 0.0219;
		}
		if (year == 2008){
			return 0.0107;
		}
		if (year == 2009){
			return 0.0186;
		}
		if (year == 2010){
			return 0.0235;
		}
		if (year == 2011){
			return 0.0246;
		}
		if (year == 2012){
			return 0.005;
		}
		if (year == 2013){
			return 0.0148;
		}
		if (year == 2014){
			return 0.0243;
		}
		return 0.021504;
	}
	private double getInflationRatePeso(int year) {
		if (year < 1969 || year > 2014){
			return 0.246602;
		}
		if (year == 1969){
			return 0.052;
		}
		if (year == 1970){
			return 0.0493;
		}
		if (year == 1971){
			return 0.044;
		}
		if (year == 1972){
			return 0.0661;
		}
		if (year == 1973){
			return 0.2392;
		}
		if (year == 1974){
			return 0.1792;
		}
		if (year == 1975){
			return 0.1202;
		}
		if (year == 1976){
			return 0.2877;
		}
		if (year == 1977){
			return 0.1953;
		}
		if (year == 1978){
			return 0.1768;
		}
		if (year == 1979){
			return 0.2156;
		}
		if (year == 1980){
			return 0.278;
		}
		if (year == 1981){
			return 0.3086;
		}
		if (year == 1982){
			return 1.1004;
		}
		if (year == 1983){
			return 0.734;
		}
		if (year == 1984){
			return 0.6075;
		}
		if (year == 1985){
			return 0.6592;
		}
		if (year == 1986){
			return 1.0434;
		}
		if (year == 1987){
			return 1.7683;
		}
		if (year == 1988){
			return 0.3456;
		}
		if (year == 1989){
			return 0.2248;
		}
		if (year == 1990){
			return 0.2711;
		}
		if (year == 1991){
			return 0.1795;
		}
		if (year == 1992){
			return 0.1132;
		}
		if (year == 1993){
			return 0.075;
		}
		if (year == 1994){
			return 0.1023;
		}
		if (year == 1995){
			return 0.5172;
		}
		if (year == 1996){
			return 0.2644;
		}
		if (year == 1997){
			return 0.1527;
		}
		if (year == 1998){
			return 0.1901;
		}
		if (year == 1999){
			return 0.1102;
		}
		if (year == 2000){
			return 0.0811;
		}
		if (year == 2001){
			return 0.0479;
		}
		if (year == 2002){
			return 0.0516;
		}
		if (year == 2003){
			return 0.042;
		}
		if (year == 2004){
			return 0.0454;
		}
		if (year == 2005){
			return 0.0394;
		}
		if (year == 2006){
			return 0.0398;
		}
		if (year == 2007){
			return 0.0371;
		}
		if (year == 2008){
			return 0.0628;
		}
		if (year == 2009){
			return 0.0446;
		}
		if (year == 2010){
			return 0.0378;
		}
		if (year == 2011){
			return 0.0405;
		}
		if (year == 2012){
			return 0.0325;
		}
		if (year == 2013){
			return 0.0448;
		}
		if (year == 2014){
			return 0.0255;
		}
		return 0.246602;
	}
	private double getInflationRateRuble(int year) {
		if (year < 1992 || year > 2014){
			return 0.168984;
		}
		if (year == 1992){
			return 8.5046;
		}
		if (year == 1993){
			return 7.8099;
		}
		if (year == 1994){
			return 2.145;
		}
		if (year == 1995){
			return 1.0368;
		}
		if (year == 1996){
			return 0.1986;
		}
		if (year == 1997){
			return 0.0994;
		}
		if (year == 1998){
			return 0.9699;
		}
		if (year == 1999){
			return 0.2893;
		}
		if (year == 2000){
			return 0.2071;
		}
		if (year == 2001){
			return 0.1903;
		}
		if (year == 2002){
			return 0.1426;
		}
		if (year == 2003){
			return 0.1124;
		}
		if (year == 2004){
			return 0.127;
		}
		if (year == 2005){
			return 0.1074;
		}
		if (year == 2006){
			return 0.0819;
		}
		if (year == 2007){
			return 0.1255;
		}
		if (year == 2008){
			return 0.1337;
		}
		if (year == 2009){
			return 0.0802;
		}
		if (year == 2010){
			return 0.0955;
		}
		if (year == 2011){
			return 0.0414;
		}
		if (year == 2012){
			return 0.0707;
		}
		if (year == 2013){
			return 0.0608;
		}
		if (year == 2014){
			return 0.077;
		}
		return 0.168984;
	}
	private double getInflationRatePound(int year) {
		if (year < 1901 || year > 2014){
			return 0.041289;
		}
		if (year == 1901){
			return 0.005;
		}
		if (year == 1902){
			return 0.0024;
		}
		if (year == 1903){
			return 0.0005;
		}
		if (year == 1904){
			return 0.0015;
		}
		if (year == 1905){
			return 0.0016;
		}
		if (year == 1906){
			return 0.0071;
		}
		if (year == 1907){
			return 0.0079;
		}
		if (year == 1908){
			return 0.005;
		}
		if (year == 1909){
			return 0.0074;
		}
		if (year == 1910){
			return 0.0043;
		}
		if (year == 1911){
			return 0.0179;
		}
		if (year == 1912){
			return 0.0099;
		}
		if (year == 1913){
			return -0.0034;
		}
		if (year == 1914){
			return 0.0705;
		}
		if (year == 1915){
			return 0.1574;
		}
		if (year == 1916){
			return 0.2227;
		}
		if (year == 1917){
			return 0.233;
		}
		if (year == 1918){
			return 0.1484;
		}
		if (year == 1919){
			return 0.1317;
		}
		if (year == 1920){
			return 0.0061;
		}
		if (year == 1921){
			return -0.1182;
		}
		if (year == 1922){
			return -0.0937;
		}
		if (year == 1923){
			return -0.0291;
		}
		if (year == 1924){
			return -0.0011;
		}
		if (year == 1925){
			return -0.0035;
		}
		if (year == 1926){
			return -0.0175;
		}
		if (year == 1927){
			return -0.0117;
		}
		if (year == 1928){
			return -0.0065;
		}
		if (year == 1929){
			return -0.0202;
		}
		if (year == 1930){
			return -0.0369;
		}
		if (year == 1931){
			return -0.033;
		}
		if (year == 1932){
			return -0.0231;
		}
		if (year == 1933){
			return -0.0087;
		}
		if (year == 1934){
			return 0.0041;
		}
		if (year == 1935){
			return 0.007;
		}
		if (year == 1936){
			return 0.0228;
		}
		if (year == 1937){
			return 0.0234;
		}
		if (year == 1938){
			return 0.0231;
		}
		if (year == 1939){
			return 0.108;
		}
		if (year == 1940){
			return 0.1325;
		}
		if (year == 1941){
			return 0.0861;
		}
		if (year == 1942){
			return 0.0491;
		}
		if (year == 1943){
			return 0.0298;
		}
		if (year == 1944){
			return 0.0276;
		}
		if (year == 1945){
			return 0.0298;
		}
		if (year == 1946){
			return 0.0538;
		}
		if (year == 1947){
			return 0.074;
		}
		if (year == 1948){
			return 0.048;
		}
		if (year == 1949){
			return 0.0298;
		}
		if (year == 1950){
			return 0.0659;
		}
		if (year == 1951){
			return 0.0914;
		}
		if (year == 1952){
			return 0.0558;
		}
		if (year == 1953){
			return 0.0233;
		}
		if (year == 1954){
			return 0.0338;
		}
		if (year == 1955){
			return 0.0473;
		}
		if (year == 1956){
			return 0.042;
		}
		if (year == 1957){
			return 0.0329;
		}
		if (year == 1958){
			return 0.0158;
		}
		if (year == 1959){
			return 0.0083;
		}
		if (year == 1960){
			return 0.0241;
		}
		if (year == 1961){
			return 0.0393;
		}
		if (year == 1962){
			return 0.0294;
		}
		if (year == 1963){
			return 0.0276;
		}
		if (year == 1964){
			return 0.0429;
		}
		if (year == 1965){
			return 0.0427;
		}
		if (year == 1966){
			return 0.0307;
		}
		if (year == 1967){
			return 0.0378;
		}
		if (year == 1968){
			return 0.0512;
		}
		if (year == 1969){
			return 0.0599;
		}
		if (year == 1970){
			return 0.0816;
		}
		if (year == 1971){
			return 0.0803;
		}
		if (year == 1972){
			return 0.0834;
		}
		if (year == 1973){
			return 0.1316;
		}
		if (year == 1974){
			return 0.2076;
		}
		if (year == 1975){
			return 0.1961;
		}
		if (year == 1976){
			return 0.1617;
		}
		if (year == 1977){
			return 0.1132;
		}
		if (year == 1978){
			return 0.106;
		}
		if (year == 1979){
			return 0.146;
		}
		if (year == 1980){
			return 0.1343;
		}
		if (year == 1981){
			return 0.0942;
		}
		if (year == 1982){
			return 0.0612;
		}
		if (year == 1983){
			return 0.0437;
		}
		if (year == 1984){
			return 0.0446;
		}
		if (year == 1985){
			return 0.0361;
		}
		if (year == 1986){
			return 0.0299;
		}
		if (year == 1987){
			return 0.0263;
		}
		if (year == 1988){
			return 0.0501;
		}
		if (year == 1989){
			return 0.0554;
		}
		if (year == 1990){
			return 0.0714;
		}
		if (year == 1991){
			return 0.0694;
		}
		if (year == 1992){
			return 0.0229;
		}
		if (year == 1993){
			return 0.0261;
		}
		if (year == 1994){
			return 0.0242;
		}
		if (year == 1995){
			return 0.0272;
		}
		if (year == 1996){
			return 0.0207;
		}
		if (year == 1997){
			return 0.0147;
		}
		if (year == 1998){
			return 0.0167;
		}
		if (year == 1999){
			return 0.0077;
		}
		if (year == 2000){
			return 0.0087;
		}
		if (year == 2001){
			return 0.0161;
		}
		if (year == 2002){
			return 0.0138;
		}
		if (year == 2003){
			return 0.0136;
		}
		if (year == 2004){
			return 0.0165;
		}
		if (year == 2005){
			return 0.0193;
		}
		if (year == 2006){
			return 0.0269;
		}
		if (year == 2007){
			return 0.0223;
		}
		if (year == 2008){
			return 0.0303;
		}
		if (year == 2009){
			return 0.034;
		}
		if (year == 2010){
			return 0.04;
		}
		if (year == 2011){
			return 0.0359;
		}
		if (year == 2012){
			return 0.0273;
		}
		if (year == 2013){
			return 0.0185;
		}
		if (year == 2014){
			return 0.0157;
		}
		return 0.041289;
	}
	private double getInflationRateYen(int year) {
		if (year < 1970 || year > 2014){
			return 0.027567;
		}
		if (year == 1970){
			return 0.0658;
		}
		if (year == 1971){
			return 0.0412;
		}
		if (year == 1972){
			return 0.065;
		}
		if (year == 1973){
			return 0.2202;
		}
		if (year == 1974){
			return 0.1739;
		}
		if (year == 1975){
			return 0.087;
		}
		if (year == 1976){
			return 0.0954;
		}
		if (year == 1977){
			return 0.0451;
		}
		if (year == 1978){
			return 0.0357;
		}
		if (year == 1979){
			return 0.0661;
		}
		if (year == 1980){
			return 0.0728;
		}
		if (year == 1981){
			return 0.0314;
		}
		if (year == 1982){
			return 0.0219;
		}
		if (year == 1983){
			return 0.0191;
		}
		if (year == 1984){
			return 0.0269;
		}
		if (year == 1985){
			return 0.0148;
		}
		if (year == 1986){
			return -0.0101;
		}
		if (year == 1987){
			return 0.0019;
		}
		if (year == 1988){
			return 0.0101;
		}
		if (year == 1989){
			return 0.0334;
		}
		if (year == 1990){
			return 0.0398;
		}
		if (year == 1991){
			return 0.0176;
		}
		if (year == 1992){
			return 0.0122;
		}
		if (year == 1993){
			return 0.0131;
		}
		if (year == 1994){
			return 0.005;
		}
		if (year == 1995){
			return -0.0049;
		}
		if (year == 1996){
			return 0.006;
		}
		if (year == 1997){
			return 0.0187;
		}
		if (year == 1998){
			return 0.0019;
		}
		if (year == 1999){
			return -0.0068;
		}
		if (year == 2000){
			return -0.0029;
		}
		if (year == 2001){
			return -0.0146;
		}
		if (year == 2002){
			return -0.004;
		}
		if (year == 2003){
			return -0.003;
		}
		if (year == 2004){
			return 0.002;
		}
		if (year == 2005){
			return -0.001;
		}
		if (year == 2006){
			return 0.00;
		}
		if (year == 2007){
			return 0.007;
		}
		if (year == 2008){
			return 0.0;
		}
		if (year == 2009){
			return -0.0099;
		}
		if (year == 2010){
			return -0.006;
		}
		if (year == 2011){
			return 0.001;
		}
		if (year == 2012){
			return -0.003;
		}
		if (year == 2013){
			return 0.0141;
		}
		if (year == 2014){
			return 0.0406;
		}
		return 0.027567;
	}
	private double getInflationRateEuro(int year) {
		if (year < 1990 || year > 2014){
			return 0.022;
		}
		if (year == 1990){
			return 0.039;
		}
		if (year == 1991){
			return 0.0387;
		}
		if (year == 1992){
			return 0.0339;
		}
		if (year == 1993){
			return 0.0294;
		}
		if (year == 1994){
			return 0.0244;
		}
		if (year == 1995){
			return 0.0237;
		}
		if (year == 1996){
			return 0.0202;
		}
		if (year == 1997){
			return 0.0109;
		}
		if (year == 1998){
			return 0.0079;
		}
		if (year == 1999){
			return 0.0185;
		}
		if (year == 2000){
			return 0.0201;
		}
		if (year == 2001){
			return 0.0261;
		}
		if (year == 2002){
			return 0.021;
		}
		if (year == 2003){
			return 0.0188;
		}
		if (year == 2004){
			return 0.0193;
		}
		if (year == 2005){
			return 0.0239;
		}
		if (year == 2006){
			return 0.0184;
		}
		if (year == 2007){
			return 0.0321;
		}
		if (year == 2008){
			return 0.0112;
		}
		if (year == 2009){
			return 0.0094;
		}
		if (year == 2010){
			return 0.0232;
		}
		if (year == 2011){
			return 0.0265;
		}
		if (year == 2012){
			return 0.0197;
		}
		if (year == 2013){
			return 0.0078;
		}
		if (year == 2014){
			return 0.0259;
		}
		return 0.022;
	}
	private double getInflationRateUSD(int year) {
		if (year < 1871 || year > 2014){
			return 0.025;
		}
		if (year == 1871){
			return 0.0152;
		}
		if (year == 1872){
			return 0.0229;
		}
		if (year == 1873){
			return -0.0440;
		}
		if (year == 1874){
			return -0.0695;
		}
		if (year == 1875){
			return -0.0573;
		}
		if (year == 1876){
			return 0.0083;
		}
		if (year == 1877){
			return -0.1563;
		}
		if (year == 1878){
			return -0.1029;
		}
		if (year == 1879){
			return 0.2065;
		}
		if (year == 1880){
			return -0.0571;
		}
		if (year == 1881){
			return 0.0807;
		}
		if (year == 1882){
			return -0.0187;
		}
		if (year == 1883){
			return -0.0761;
		}
		if (year == 1884){
			return -0.1029;
		}
		if (year == 1885){
			return -0.0350;
		}
		if (year == 1886){
			return 0.00;
		}
		if (year == 1887){
			return 0.0476;
		}
		if (year == 1888){
			return -0.0454;
		}
		if (year == 1889){
			return -0.0476;
		}
		if (year == 1890){
			return 0.0250;
		}
		if (year == 1891){
			return -0.0603;
		}
		if (year == 1892){
			return 0.0778;
		}
		if (year == 1893){
			return -0.1329;
		}
		if (year == 1894){
			return -0.0409;
		}
		if (year == 1895){
			return 0.0137;
		}
		if (year == 1896){
			return -0.0285;
		}
		if (year == 1897){
			return 0.0294;
		}
		if (year == 1898){
			return 0.0150;
		}
		if (year == 1899){
			return 0.1686;
		}
		if (year == 1900){
			return -0.0241;
		}
		if (year == 1901){
			return 0.0246;
		}
		if (year == 1902){
			return 0.0962;
		}
		if (year == 1903){
			return -0.0439;
		}
		if (year == 1904){
			return 0.0229;
		}
		if (year == 1905){
			return 0.00;
		}
		if (year == 1906){
			return 0.0449;
		}
		if (year == 1907){
			return -0.0215;
		}
		if (year == 1908){
			return 0.0323;
		}
		if (year == 1909){
			return 0.1074;
		}
		if (year == 1910){
			return -0.0677;
		}
		if (year == 1911){
			return -0.0108;
		}
		if (year == 1912){
			return 0.0734;
		}
		if (year == 1913){
			return 0.0204;
		}
		if (year == 1914){
			return 0.01;
		}
		if (year == 1915){
			return 0.010;
		}
		if (year == 1916){
			return 0.079;
		}
		if (year == 1917){
			return 0.174;
		}
		if (year == 1918){
			return 0.180;
		}
		if (year == 1919){
			return 0.146;
		}
		if (year == 1920){
			return 0.156;
		}
		if (year == 1921){
			return -0.105;
		}
		if (year == 1922){
			return -0.061;
		}
		if (year == 1923){
			return 0.018;
		}
		if (year == 1924){
			return 0.00;
		}
		if (year == 1925){
			return 0.023;
		}
		if (year == 1926){
			return 0.011;
		}
		if (year == 1927){
			return -0.017;
		}
		if (year == 1928){
			return -0.017;
		}
		if (year == 1929){
			return 0.00;
		}
		if (year == 1930){
			return -0.023;
		}
		if (year == 1931){
			return -0.09;
		}
		if (year == 1932){
			return -0.099;
		}
		if (year == 1933){
			return -0.051;
		}
		if (year == 1934){
			return 0.031;
		}
		if (year == 1935){
			return 0.022;
		}
		if (year == 1936){
			return 0.015;
		}
		if (year == 1937){
			return 0.036;
		}
		if (year == 1938){
			return -0.021;
		}
		if (year == 1939){
			return -0.014;
		}
		if (year == 1940){
			return 0.007;
		}
		if (year == 1941){
			return 0.050;
		}
		if (year == 1942){
			return 0.109;
		}
		if (year == 1943){
			return 0.061;
		}
		if (year == 1944){
			return 0.017;
		}
		if (year == 1945){
			return 0.023;
		}
		if (year == 1946){
			return 0.083;
		}
		if (year == 1947){
			return 0.144;
		}
		if (year == 1948){
			return 0.081;
		}
		if (year == 1949){
			return -0.012;
		}
		if (year == 1950){
			return 0.013;
		}
		if (year == 1951){
			return 0.079;
		}
		if (year == 1952){
			return 0.019;
		}
		if (year == 1953){
			return 0.008;
		}
		if (year == 1954){
			return 0.007;
		}
		if (year == 1955){
			return -0.004;
		}
		if (year == 1956){
			return 0.015;
		}
		if (year == 1957){
			return 0.033;
		}
		if (year == 1958){
			return 0.028;
		}
		if (year == 1959){
			return 0.007;
		}
		if (year == 1960){
			return 0.017;
		}
		if (year == 1961){
			return 0.01;
		}
		if (year == 1962){
			return 0.01;
		}
		if (year == 1963){
			return 0.013;
		}
		if (year == 1964){
			return 0.013;
		}
		if (year == 1965){
			return 0.016;
		}
		if (year == 1966){
			return 0.029;
		}
		if (year == 1967){
			return 0.031;
		}
		if (year == 1968){
			return 0.042;
		}
		if (year == 1969){
			return 0.055;
		}
		if (year == 1970){
			return 0.057;
		}
		if (year == 1971){
			return 0.044;
		}
		if (year == 1972){
			return 0.032;
		}
		if (year == 1973){
			return 0.062;
		}
		if (year == 1974){
			return 0.11;
		}
		if (year == 1975){
			return 0.091;
		}
		if (year == 1976){
			return 0.058;
		}
		if (year == 1977){
			return 0.065;
		}
		if (year == 1978){
			return 0.076;
		}
		if (year == 1979){
			return 0.113;
		}
		if (year == 1980){
			return 0.135;
		}
		if (year == 1981){
			return 0.103;
		}
		if (year == 1982){
			return 0.062;
		}
		if (year == 1983){
			return 0.032;
		}
		if (year == 1984){
			return 0.043;
		}
		if (year == 1985){
			return 0.036;
		}
		if (year == 1986){
			return 0.019;
		}
		if (year == 1987){
			return 0.036;
		}
		if (year == 1988){
			return 0.041;
		}
		if (year == 1989){
			return 0.048;
		}
		if (year == 1990){
			return 0.054;
		}
		if (year == 1991){
			return 0.042;
		}
		if (year == 1992){
			return 0.03;
		}
		if (year == 1993){
			return 0.03;
		}
		if (year == 1994){
			return 0.026;
		}
		if (year == 1995){
			return 0.028;
		}
		if (year == 1996){
			return 0.03;
		}
		if (year == 1997){
			return 0.023;
		}
		if (year == 1998){
			return 0.016;
		}
		if (year == 1999){
			return 0.022;
		}
		if (year == 2000){
			return 0.034;
		}
		if (year == 2001){
			return 0.028;
		}
		if (year == 2002){
			return 0.016;
		}
		if (year == 2003){
			return 0.023;
		}
		if (year == 2004){
			return 0.027;
		}
		if (year == 2005){
			return 0.034;
		}
		if (year == 2006){
			return 0.032;
		}
		if (year == 2007){
			return 0.028;
		}
		if (year == 2008){
			return 0.038;
		}
		if (year == 2009){
			return -0.004;
		}
		if (year == 2010){
			return 0.016;
		}
		if (year == 2011){
			return 0.032;
		}
		if (year == 2012){
			return 0.021;
		}
		if (year == 2013){
			return 0.015;
		}
		if (year == 2014){
			return 0.0166;
		}
		return 0.025;
	}
}
