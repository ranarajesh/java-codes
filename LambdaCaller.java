import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.google.gson.Gson; // For JSON serialization/deserialization

// Class holding environment variable names for easy reference
class EnvVars {
    public static final String AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID";
    public static final String AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY";
    public static final String AWS_REGION = "AWS_REGION";
    public static final String FUNCTION_NAME = "YOUR_FUNCTION_NAME";
}

public class LambdaCaller {

    public static void main(String[] args) throws Exception {
        // Get environment variables (secure alternatives in production)
        String accessKeyId = System.getenv(EnvVars.AWS_ACCESS_KEY_ID);
        String secretAccessKey = System.getenv(EnvVars.AWS_SECRET_ACCESS_KEY);
        String region = System.getenv(EnvVars.AWS_REGION);
        String functionName = System.getenv(EnvVars.FUNCTION_NAME);

        if (accessKeyId == null || secretAccessKey == null || region == null || functionName == null) {
            throw new RuntimeException("Please set all required environment variables.");
        }

        // Create AWS credentials provider
        AWSCredentialsProvider credentialsProvider = new BasicAWSCredentialsProvider(accessKeyId, secretAccessKey);

        // Build the Lambda client
        AWSLambda lambdaClient = AWSLambdaClientBuilder.standard()
                .withRegion(Regions.fromName(region))
                .withCredentials(credentialsProvider)
                .build();

        // Prepare payload data (replace with your desired format)
        MyPayload payload = new MyPayload("hello", 123);
        String payloadJson = new Gson().toJson(payload);

        // Build the InvokeRequest
        InvokeRequest invokeRequest = new InvokeRequest()
                .withFunctionName(functionName)
                .withPayload(payloadJson);

        // Invoke the Lambda function
        try {
            InvokeResult invokeResult = lambdaClient.invoke(invokeRequest);
            String resultJson = new String(invokeResult.getPayload().array(), StandardCharsets.UTF_8);

            // Process the response (replace with your specific logic)
            MyResponse response = new Gson().fromJson(resultJson, MyResponse.class);
            System.out.println("Result: " + response.getMessage() + ", Value: " + response.getValue());
        } catch (Exception e) {
            System.err.println("Error invoking Lambda function: " + e.getMessage());
        }
    }

    // Define your payload and response data classes (example)
    private static class MyPayload {
        String message;
        int value;

        public MyPayload(String message, int value) {
            this.message = message;
            this.value = value;
        }
    }

    private static class MyResponse {
        String message;
        int value;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
