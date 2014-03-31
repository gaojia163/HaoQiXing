package fyyxz.thread;

public class TomRun extends Thread {
	public String name;
	public TomRun(String name){
		this.name=name;
	}

	public synchronized void run() {
        System.out.println( name+"线程运行开始!");
        for (int i = 0; i < 40; i++) {
//        	i*=2;
            System.out.println(name+"跑了"+i + " 米");
            try {
                sleep((int) Math.random() * 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+"线程运行结束!");
    }
	
}
