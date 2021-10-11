package es.us.dp1.games.chess.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import es.us.dp1.games.chess.model.ChessBoard;
import es.us.dp1.games.chess.model.ChessPiece;
import es.us.dp1.games.chess.model.User;
import es.us.dp1.games.chess.repository.UserRepository;
import es.us.dp1.games.chess.service.ChessBoardService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {
	
	@Autowired
	ChessBoardService chessService;
	
	  @GetMapping({"/","/welcome"})
	  public String welcome(Map<String, Object> model) {	    		
		model.put("chessBoard",chessService.findById(1).get());
	    return "welcome";
	  }
	  
	  
}
