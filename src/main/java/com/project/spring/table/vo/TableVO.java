package com.project.spring.table.vo;

public class TableVO {

	private String disposableString;
	
	private int disposableInt;

	public String getDisposableString() {
		return disposableString;
	}

	public void setDisposableString(String disposableString) {
		this.disposableString = disposableString;
	}

	public int getDisposableInt() {
		return disposableInt;
	}

	public void setDisposableInt(int disposableInt) {
		this.disposableInt = disposableInt;
	}

	@Override
	public String toString() {
		return "TableVO [disposableString=" + disposableString + ", disposableInt=" + disposableInt + "]";
	}
	
}
