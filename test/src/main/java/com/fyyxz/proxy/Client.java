package com.fyyxz.proxy;

public class Client {
	public static void main(String[] args) {
	   PassengerProxy proxy = new PassengerProxy();
	   Passenger passenger = (Passenger) proxy.obj(new RealPassenger());
	   passenger.buyTicket();
	}
}
