package com.charlesgnuhc.chess.board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    private Board board;

    public static void main(String[] args) {
        SpringApplication.run(BoardController.class, args);
    }


    // @GetMapping("/getBoardState")
    // public Board getBoardState() {
    //     return board.getBoardStateAsJson();
    // }

    @GetMapping("/")
    public Board apiRoot() {
        return "Hello World!";
    }
}
