package lslin.Design.CreatePattern.FactoryMethod;

public class SendSmsFactory implements Provider {

	public Sender product() {
		return new SmsSender();
	}
}
