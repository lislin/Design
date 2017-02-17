package lslin.Design.StructPattern.Adapter.ObjectAdapter;

public class Adapter implements Targetable {
	private Sources sources;

	public Adapter(Sources sources) {
		this.sources = sources;
	}

	public void method2() {
		System.out.println("方法2");
	}

	public void method1() {
		this.sources.method1();
	}
}
