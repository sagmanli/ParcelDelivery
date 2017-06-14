package com.sagmanli.parcelDelivery;

public class Parcel {
	ParcelState newState;
	ParcelState bookedState;
	ParcelState transitState;
	ParcelState completedState;
	
	private String orderId;
	
	private ParcelState state;
	
	public Parcel(String orderId){
		this.orderId = orderId;
		newState = new NewParcelState(this);
		bookedState = new BookedParcelState(this);
		transitState = new TransitParcelState(this);	
		completedState = new CompletedParcelState(this);
		state = newState;
	}
	
	public void book() throws Exception{
		this.state.book();
	}
	
	public void makeTransit() throws Exception{
		this.state.makeTransit();
	}
	
	public void complete() throws Exception{
		this.state.complete();
	}

	public ParcelState getNewState() {
		return newState;
	}

	public void setNewState(ParcelState newState) {
		this.newState = newState;
	}

	public ParcelState getBookedState() {
		return bookedState;
	}

	public void setBookedState(ParcelState bookedState) {
		this.bookedState = bookedState;
	}

	public ParcelState getTransitState() {
		return transitState;
	}

	public void setTransitState(ParcelState transitState) {
		this.transitState = transitState;
	}

	public ParcelState getCompletedState() {
		return completedState;
	}

	public void setCompletedState(ParcelState completedState) {
		this.completedState = completedState;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public ParcelState getState() {
		return state;
	}

	public void setState(ParcelState state) {
		this.state = state;
	}
	
	
	
}
