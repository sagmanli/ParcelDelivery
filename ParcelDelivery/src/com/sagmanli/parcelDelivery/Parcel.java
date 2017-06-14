package com.sagmanli.parcelDelivery;

public class Parcel {
	IParcelState newState;
	IParcelState bookedState;
	IParcelState transitState;
	IParcelState completedState;
	
	private String orderId;
	
	private IParcelState state;
	
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

	public IParcelState getNewState() {
		return newState;
	}

	public void setNewState(IParcelState newState) {
		this.newState = newState;
	}

	public IParcelState getBookedState() {
		return bookedState;
	}

	public void setBookedState(IParcelState bookedState) {
		this.bookedState = bookedState;
	}

	public IParcelState getTransitState() {
		return transitState;
	}

	public void setTransitState(IParcelState transitState) {
		this.transitState = transitState;
	}

	public IParcelState getCompletedState() {
		return completedState;
	}

	public void setCompletedState(IParcelState completedState) {
		this.completedState = completedState;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public IParcelState getState() {
		return state;
	}

	public void setState(IParcelState state) {
		this.state = state;
	}
	
	
	
}
