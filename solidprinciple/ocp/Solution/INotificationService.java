package solidprinciple.ocp.Solution;

public interface INotificationService {
    public void sendOTP(String medium);
    public String sendTransactionStatus(String medium);
}
