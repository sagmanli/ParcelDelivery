package com.sagmanli.parcelDelivery.test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.sagmanli.parcelDelivery.IllegalParcelStateException;
import com.sagmanli.parcelDelivery.Parcel;

public class ParcelDeliveryTest {
	private Parcel parcel;
	

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	
	@Before
	public void setUp() throws Exception {
		parcel = new Parcel("12345");
	}

	@Test
	public void testHappyPath() throws Exception {
		System.out.println("...test happy path...");
		parcel.book();
		parcel.makeTransit();
		parcel.complete();
	}
	
	@Test
	public void testBookToComplete() throws Exception {
		System.out.println("\n...test book to complete");
		parcel.book();
		parcel.complete();
	}
	
	@Test
	public void testFailSameState() throws Exception {
		System.out.println("\n...test exception when asked for same state");
		expectedEx.expect(IllegalParcelStateException.class);
	    expectedEx.expectMessage("Already Booked");
		parcel.book();
		parcel.book();
	}
	
	@Test
	public void testFailBackwards() throws Exception {
		System.out.println("\n...test exception when trying to move backwards");
		expectedEx.expect(IllegalParcelStateException.class);
	    expectedEx.expectMessage("Can't switch to Booked, can only switch to Competed");
		parcel.book();
		parcel.makeTransit();
		parcel.book();
	}
	
	@Test
	public void testJumpingFromNewToTransit() throws Exception {
		System.out.println("\n...test exception when switching from new to transit");
		expectedEx.expect(IllegalParcelStateException.class);
	    expectedEx.expectMessage("Can't switch to transit, can only switch to Booked");
		parcel.makeTransit();
	}
}
