package es.us.dp1.games.chess.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.us.dp1.games.chess.repository.ChessBoardRepository;
import es.us.dp1.games.chess.model.ChessBoard;

@Service
public class ChessBoardService {

	@Autowired 
	ChessBoardRepository boardRepo;
	
	public Optional<ChessBoard> findById(Integer id){
		return boardRepo.findById(id);
	}
}
