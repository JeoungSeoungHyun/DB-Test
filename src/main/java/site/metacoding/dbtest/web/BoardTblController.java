package site.metacoding.dbtest.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.dbtest.domain.BoardTbl;
import site.metacoding.dbtest.domain.BoardTblRepository;

@RequiredArgsConstructor
@Controller
public class BoardTblController {

    private final BoardTblRepository boardTblRepository;

    @GetMapping("/search")
    public String search(Model model) {

        List<BoardTbl> boards = boardTblRepository.findAll();

        model.addAttribute("boards", boards);

        return "home";
    }
}
