package com.sagmanli.parcelDelivery;

public interface ParcelState {
	void book() throws Exception;
	void makeTransit() throws Exception;
	void complete() throws Exception;
}
