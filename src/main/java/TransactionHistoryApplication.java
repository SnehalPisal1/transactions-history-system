import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class TransactionHistoryApplication {

    public static void main(String args[]){
        SpringApplication.run(TransactionHistoryApplication.class, args);
    }

}

