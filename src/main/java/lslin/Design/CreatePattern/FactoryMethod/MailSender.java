package lslin.Design.CreatePattern.FactoryMethod;

public class MailSender implements Sender {

	public void send() {
		System.out.println("发送邮件");
	}
}
