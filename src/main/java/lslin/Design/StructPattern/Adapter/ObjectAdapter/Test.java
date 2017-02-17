package lslin.Design.StructPattern.Adapter.ObjectAdapter;

public class Test {
	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Sources());
		adapter.method1();
		adapter.method2();
	}
}
