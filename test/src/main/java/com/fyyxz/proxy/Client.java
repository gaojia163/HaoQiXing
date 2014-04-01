package com.fyyxz.proxy;

import org.apache.log4j.Logger;

public class Client {
	static Logger logger = Logger.getLogger(Client.class);
	public static void main(String[] args) {
	   PassengerProxy proxy = new PassengerProxy();
	   Passenger passenger = (Passenger) proxy.obj(new RealPassenger());
	   logger.info("Client运行");
	   passenger.buyTicket();
	}
}
