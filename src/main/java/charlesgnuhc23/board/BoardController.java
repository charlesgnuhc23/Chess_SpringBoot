import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BoardController {

    private Board board;

    public static void main(String[] args) {
        SpringApplication.run(BoardController.class, args);
    }


    // @GetMapping("/getBoardState")
    // public String getBoardState() {
    //     return board.getBoardStateAsJson();
    // }

    @GetMapping("/")
    public String apiRoot() {
        return "Hello World!";
    }
}
