package com.lucciola.haskell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAnalyzer {
	
	private String text;
	
	public StringAnalyzer(String arg0) {
		this.text = arg0;
	}
	
	public boolean isMain() {
		Pattern pattern = Pattern.compile("(\\Alet\\s.*)|(\\Aimport\\s.*)");
		Matcher matcher = pattern.matcher(this.text);
		if (matcher.matches()) {
			this.text = this.text.replaceFirst("let\\s", "");
			return false;
		} else {
			return true;
		}
	}
	
	public String getText() {
		return this.text;
	}

}
