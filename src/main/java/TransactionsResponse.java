import java.util.List;

public class TransactionsResponse {

    List<Transactions> transactionsList;
    int totalPages;
    int currentPages;

    public TransactionsResponse(List<Transactions> transactionsList, int totalPages, int currentPages) {
        this.transactionsList = transactionsList;
        this.totalPages = totalPages;
        this.currentPages = currentPages;
    }
}
