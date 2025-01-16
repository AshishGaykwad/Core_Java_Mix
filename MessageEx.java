package abstraction;

interface MessageService
{
	void sendMessage(String message,String receiptient);
	void receiveMessage (String message, String sender);
}
class EmailService implements MessageService
{
	
	public void sendMessage (String message,String receiptient)
	{
		System.out.println(receiptient + ":"+message);
	}
	

	@Override
	public void receiveMessage(String message, String sender) {
		// TODO Auto-generated method stub
		System.out.println(message+"From: "+sender);
	}
}
	

public class MessageEx {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		EmailService email = new EmailService();
		email.sendMessage("abc", "xyz");
		email.receiveMessage("efg ", "pqe");
		
	}

}
