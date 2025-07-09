import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@SpringBootApplication
@RestController
public class TransactionHistoryApplication {

    public static void main(String args[]){
        SpringApplication.run(TransactionHistoryApplication.class, args);
    }

    private final Map<String, List<Transactions>> userTransactions= new ConcurrentHashMap<>();

    public TransactionHistoryApplication(){
        List<Transactions> mockTx= Arrays.asList(
                new Transactions("txt1","user1", 1200, TransactionType.DEPOSITE, LocalDateTime.of(2025,1,2, 10, 2,3)),
                new Transactions("txt2","user1", 1200, TransactionType.WITHDRAWAL, LocalDateTime.of(2025,3,2, 10, 2,3)),
                new Transactions("txt3","user2", 1200, TransactionType.DEPOSITE, LocalDateTime.of(2025,6,2, 10, 2,3)),
                new Transactions("txt4","user1", 1200, TransactionType.DEPOSITE, LocalDateTime.of(2025,2,2, 10, 2,3))
        );

        for(Transactions tx : mockTx) {
            userTransactions.computeIfAbsent(tx.getUserId(), k -> new ArrayList<>()).add(tx);
        }

        @RequestMapping(path = "/users/{userId}/transactions", method = RequestMethod.GET)
        public TransactionsResponse getTransactions(@PathVariable String userId,
                @RequestParam(required = false) String startDate,
                @RequestParam(required = false) String endDate,
                @RequestParam(defaultValue = "1") int page,
                @RequestParam(defaultValue = "10") int size){



        }
    }
}

