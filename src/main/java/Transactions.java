import java.time.LocalDateTime;

public class Transactions {

    private String id;
    private String userId;
    private double amount;
    private TransactionType type;
    private LocalDateTime transactionTime;


    public String getUserId() {
        return userId;
    }

    public Transactions(String id, String userId, double amount, TransactionType type, LocalDateTime transactionTime) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.type = type;
        this.transactionTime = transactionTime;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

}
