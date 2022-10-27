package es.us.dp1.games.chess.web;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import es.us.dp1.games.chess.service.ChessBoardService;

@Controller
public class WelcomeController {
	
	@Autowired
	ChessBoardService chessService;
	
	  @GetMapping({"/","/welcome"})
	  public String welcome(Map<String, Object> model, HttpServletResponse response) {	    		
		//response.addHeader("Refresh","1"); 
		model.put("now", new Date());
		model.put("chessBoard",chessService.findById(1).get());
	    return "welcome";
	  }
	  
	  
}
