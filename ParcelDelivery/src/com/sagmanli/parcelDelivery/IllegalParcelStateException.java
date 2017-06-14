package com.sagmanli.parcelDelivery;

public class IllegalParcelStateException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public IllegalParcelStateException(String msg){
		super(msg);
	}

}
