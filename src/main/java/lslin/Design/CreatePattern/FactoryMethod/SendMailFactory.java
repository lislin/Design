package lslin.Design.CreatePattern.FactoryMethod;

public class SendMailFactory implements Provider {

	public Sender product() {
		return new MailSender();
	}
}
