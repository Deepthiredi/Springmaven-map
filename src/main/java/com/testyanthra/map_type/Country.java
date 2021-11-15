package com.testyanthra.map_type;

import java.util.Map;

public class Country {

	private String name;
	private Map<String,String> Stateandlanguage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStateandlanguage() {
		return Stateandlanguage;
	}
	public void setStateandlanguage(Map<String, String> stateandlanguage) {
		Stateandlanguage = stateandlanguage;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", Stateandlanguage=" + Stateandlanguage + "]";
	}
	
	
}
