package lslin.Design.CreatePattern.FactoryMethod;

public class Test {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.product();
		sender.send();
	}
}
