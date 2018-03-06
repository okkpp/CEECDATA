package okkpp.utils;
/**
* @author duck
* @date 创建时间：2018年3月6日 下午2:48:52
*/
public enum CountryCode {
	aebny("阿尔巴尼亚","The Republic of Albania"),
	asny("爱沙尼亚","Republic of Estonia"),
	bh("波黑","Bosnia and Herzegovina"),
	bjly("保加利亚","The Republic of Bulgaria"),
	bl("波兰","The Republic of Poland"),
	hs("黑山","Montenegro"),
	jk("捷克","The Czech Republic"),
	kldy("克罗地亚","The Republic of Croatia"),
	lmny("罗马尼亚","Romania"),
	ltw("立陶宛","The Republic of Lithuania"),
	ltwy("拉脱维亚","Republic of Latvia"),
	mqd("马其顿","The Republic of Macedonia"),
	sewy("塞尔维亚","The Republic of Serbia"),
	slfk("斯洛伐克","The Slovak Republic"),
	slwny("斯洛文尼亚","The Republic of Slovenia"),
	xyl("匈牙利","Hungary");
	
	String cn;
	String en;
	private CountryCode(String cn,String en) {
		this.cn=cn;
		this.en=en;
	}
}
