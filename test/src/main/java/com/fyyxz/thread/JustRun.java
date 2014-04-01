package com.fyyxz.thread;

public class JustRun {
	
	static int i = 10;
	int j ;

	public static void main(String[] args)  {
		RabbitRun r =new RabbitRun();
		TomRun t = new TomRun("Tom");
		TomRun t1 = new TomRun("Cat");
		//t.setPriority(10);
		r.run();
		t.start();
		t1.start();
		

	}

}
