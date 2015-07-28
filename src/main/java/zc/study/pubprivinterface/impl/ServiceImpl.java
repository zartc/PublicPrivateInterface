package zc.study.pubprivinterface.impl;

import zc.study.pubprivinterface.SuperUserInterface;
import zc.study.pubprivinterface.NormalUserInterface;


public class ServiceImpl implements NormalUserInterface, SuperUserInterface {

	private String value;


	public Object readObject() {
		return value;
	}

	public void writeObject(String value) {
		this.value = value;
	}
}

/* EOF */
