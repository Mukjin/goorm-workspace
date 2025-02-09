package io.groom.mybatis.Controller;

import io.groom.mybatis.model.Board;
import io.groom.mybatis.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class BoardRestController {
    @Autowired
    private BoardService boardService;

    @GetMapping("")
    public String index() {
        return "api index";
    }

    /* 리스트 */
    @GetMapping("/boards")
    public List<Board> list() {
        List<Board> list = boardService.getBoards();
        log.debug("list size : " + list.size());
        log.debug("test ");
        return list;
    }

    /* 상세보기 */
    @GetMapping("/boards/{seq}")
    public Board get(@PathVariable Long seq) {
        log.debug("seq : " + seq);
        return boardService.getBoardById(seq);
    }

    @PostMapping("/boards")
    public int create(@RequestBody Board board) {
        log.debug("board : " + board);
        return boardService.createBoard(board);
    }

    /* 수정 */
    @PutMapping("/boards")
    public Board put(@RequestBody Board board){
        log.debug("seq: " + board.getSeq());
        log.debug("title : " + board.getTitle());
        log.debug("contents : " + board.getContents());
        log.debug("reguser : " + board.getRegUser());

        return boardService.updateBoard(board);
    }

    /* 삭제 */
    @DeleteMapping("/boards/{seq}")
    public boolean delete(@PathVariable Long seq){
        log.debug("seq : " + seq);

        return boardService.deletedBoard(seq);
    }
}
