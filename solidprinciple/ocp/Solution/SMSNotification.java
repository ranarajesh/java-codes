package solidprinciple.ocp.Solution;

public class SMSNotification implements INotificationService{
    @Override
    public void sendOTP(String medium) {
        //write Logic using Twilio SMS API
    }

    @Override
    public String sendTransactionStatus(String medium) {
        return null;
    }
}
