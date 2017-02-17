package lslin.Design.CreatePattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List<Sender> senders = new ArrayList<Sender>();

	public void productMailSender(Integer count) {
		for (int i = 0; i < count; i++)
			senders.add(new MailSender());
	}

	public void productSmsSender(Integer count) {
		for (int i = 0; i < count; i++)
			senders.add(new SmsSender());
	}
}
