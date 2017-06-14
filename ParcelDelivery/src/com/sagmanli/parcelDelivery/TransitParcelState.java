package com.sagmanli.parcelDelivery;

public class TransitParcelState implements ParcelState {
	
	private Parcel parcel;
	
	public TransitParcelState(Parcel parcel){
		this.parcel = parcel;
	}

	@Override
	public void book() throws Exception {
		throw new IllegalParcelStateException("Can't switch to Booked, can only switch to Competed");

	}

	@Override
	public void makeTransit() throws Exception {
		throw new IllegalParcelStateException("Already Transit");

	}

	@Override
	public void complete() throws Exception {
		System.out.println("Switching to Complete");
		parcel.setState(parcel.getCompletedState());

	}

}
