package org.springframework.samples.webflow.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	private String txt;

	
	public  void search(){
		System.out.println("****"+txt);
	}
	
	/*
	 * 
	 */

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

}
