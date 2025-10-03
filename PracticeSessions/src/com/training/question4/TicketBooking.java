package com.training.question4;

public class TicketBooking {
	
	void bookingDetails(String busName, String destination, String source, String... passerNames) {
		System.out.print("Bus No: "+" "+busName+"\n"+"Destination: "+destination+"\n"+"Source: "+source+
	"\n"+"PassengerNames :");
		for(String passerName : passerNames) {
			System.out.print(passerName +", ");
			
		}
	}

}
