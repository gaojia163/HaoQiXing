package fyyxz.generics;

class Gen<T> {
	
	private T ob; //定义泛型成员变量
	
	public Gen(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public void showType() {
		System.out.println("T的实际类型是: " + ob.getClass().getName());
	}
}

class Gen1< T extends Gen<T>> {
	Gen<? extends Gen> listFoo1 = null;
	private T ob; //定义泛型成员变量
	
	public Gen1(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public void showType() {
		System.out.println("T的实际类型是: " + ob.getClass().getName());
	}
}