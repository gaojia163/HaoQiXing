package com.fyyxz.thread;

public class RabbitRun implements Runnable {

	public int run(int i) {
		System.out.println(" 兔子线程运行开始!");
//        for (int i = 0; i < 100; i++) {
//        }
        System.out.println(" 兔子跑"+i + "米 ");
        try {
        	Thread.sleep((int) Math.random() * 10);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        return i++;
//        System.out.println(" 兔子线程运行结束!");
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(" 兔子跑" + i + "米 ");
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
