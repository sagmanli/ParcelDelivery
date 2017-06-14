package com.sagmanli.parcelDelivery;

public class BookedParcelState implements ParcelState {
	
	private Parcel parcel;
	
	public BookedParcelState(Parcel parcel){
		this.parcel = parcel;
	}

	@Override
	public void book() throws Exception {
		throw new IllegalParcelStateException("Already Booked");

	}

	@Override
	public void makeTransit() throws Exception {
		System.out.println("Switching to Transit");
		parcel.setState(parcel.getTransitState());

	}

	@Override
	public void complete() throws Exception {
		System.out.println("Switching to Complete");
		parcel.setState(parcel.getCompletedState());
	}

}
