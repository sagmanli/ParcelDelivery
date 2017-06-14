package com.sagmanli.parcelDelivery;

public class NewParcelState implements IParcelState {

	private Parcel parcel;
	
	public NewParcelState(Parcel parcel){
		this.parcel = parcel;
	}
	
	@Override
	public void book() throws Exception {
		System.out.println("Switching to Booked");
		parcel.setState(parcel.getBookedState());

	}

	@Override
	public void makeTransit() throws Exception {
		throw new Exception("Can't switch to transit, can only switch to Booked");

	}

	@Override
	public void complete() throws Exception {
		throw new Exception("Can't switch to complete, can only switch to Booked");

	}

}
