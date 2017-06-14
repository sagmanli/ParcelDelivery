package com.sagmanli.parcelDelivery;

public class CompletedParcelState implements IParcelState{

	private Parcel parcel;
	
	public CompletedParcelState(Parcel parcel){
		this.parcel = parcel;
	}
	
	@Override
	public void book() throws Exception {
		throw new Exception("Can't switch to Booked");
		
	}

	@Override
	public void makeTransit() throws Exception {
		throw new Exception("Can't switch to Transit");
		
	}

	@Override
	public void complete() throws Exception {
		throw new Exception("Already Complete");
		
	}

}
