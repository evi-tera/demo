package com.recursive.demo;

import java.util.ArrayList;
import java.util.List;

public class MessageSection extends MessageParts {

	public MessageSection(String key, String value) {
		this.key = key;
		this.value = value;
	}

	List<MessageParts> sectionData = new ArrayList<>();

	/**
	 * @return the sectionData
	 */
	public List<MessageParts> getSectionData() {
		return sectionData;
	}

	/**
	 * @param sectionData
	 *            the sectionData to set
	 */
	public void setSectionData(List<MessageParts> sectionData) {
		this.sectionData = sectionData;
	}

	public void add(MessageParts msgParam) {
		this.sectionData.add(msgParam);
	}
}
