package es.us.dp1.games.ajedrez.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import es.us.dp1.games.ajedrez.model.ChessBoard;
import es.us.dp1.games.ajedrez.model.ChessPiece;
import es.us.dp1.games.ajedrez.model.User;
import es.us.dp1.games.ajedrez.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {
	
	
	  @GetMapping({"/","/welcome"})
	  public String welcome(Map<String, Object> model) {	    
		model.put("chessBoard",createChessBoard());
	    return "welcome";
	  }
	  
	  public ChessBoard createChessBoard() {
		  ChessBoard result=new ChessBoard();
		  List<ChessPiece> pieces=new ArrayList<ChessPiece>();
		  ChessPiece horseBlack=new ChessPiece();
		  horseBlack.setColor("BLACK");
		  horseBlack.setType("HORSE");
		  horseBlack.setXPosition(1);
		  horseBlack.setYPosition(1);
		  result.setPieces(pieces);
		  pieces.add(horseBlack);
		  return result;
	  }
}
