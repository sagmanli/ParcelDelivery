package com.sagmanli.parcelDelivery;

public interface IParcelState {
	void book() throws Exception;
	void makeTransit() throws Exception;
	void complete() throws Exception;
}
