package com.Spring.Bean_LifeCyle_Methods_and_Annotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
