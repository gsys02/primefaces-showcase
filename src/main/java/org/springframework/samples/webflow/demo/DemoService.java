package org.springframework.samples.webflow.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	private String text="";
	private boolean onTooltip=false;

	public void handleKeyEvent() {

		if (text.equals("cafe")) {
			onTooltip = true;
		} else {
			onTooltip = false;
		}
		System.out.println(onTooltip);

	}

	/*
	 * Get/Set
	 */

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isOnTooltip() {
		return onTooltip;
	}

	public void setOnTooltip(boolean onTooltip) {
		this.onTooltip = onTooltip;
	}

}
