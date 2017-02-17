package lslin.Design.CreatePattern.FactoryMethod;

public class SmsSender implements Sender {

	public void send() {
		System.out.println("发送短信");
	}
}
