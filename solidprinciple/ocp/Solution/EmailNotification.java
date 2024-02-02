package solidprinciple.ocp.Solution;

public class EmailNotification implements  INotificationService{
    @Override
    public void sendOTP(String medium) {
        // write Logic using JavaEmail api
    }

    @Override
    public String sendTransactionStatus(String medium) {
        return null;
    }
}
