package es.us.dp1.games.chess.repository;

import org.springframework.data.repository.CrudRepository;

import es.us.dp1.games.chess.model.ChessBoard;
import es.us.dp1.games.chess.model.User;

public interface ChessBoardRepository extends  CrudRepository<ChessBoard, Integer>{

}
