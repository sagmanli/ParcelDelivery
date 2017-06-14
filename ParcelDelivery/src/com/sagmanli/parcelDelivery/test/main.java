package com.sagmanli.parcelDelivery.test;

import com.sagmanli.parcelDelivery.Parcel;

public class main {

	public static void main(String[] args) {
		try {
			Parcel parcel = new Parcel("123");
			parcel.book();
//			parcel.book();
//			parcel.makeTransit();
			parcel.complete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
