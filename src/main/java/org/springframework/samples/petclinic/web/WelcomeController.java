package org.springframework.samples.petclinic.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.samples.petclinic.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.model.ChessBoard;
import org.springframework.samples.petclinic.model.ChessPiece;

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
		  horseBlack.setXPosition(2);
		  horseBlack.setYPosition(2);
		  result.setPieces(pieces);
		  pieces.add(horseBlack);
		  return result;
	  }
}
