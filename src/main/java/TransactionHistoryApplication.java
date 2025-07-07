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


}

