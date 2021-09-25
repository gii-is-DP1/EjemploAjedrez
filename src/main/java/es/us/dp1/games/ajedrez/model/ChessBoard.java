package es.us.dp1.games.ajedrez.model;

import javax.validation.constraints.Positive;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChessBoard extends BaseEntity {
    String background;
    @Positive
    int width;
    @Positive
    int height;

    public ChessBoard(){
        this.background="resources/images/tablero-ajedrez.jpg";
        this.width=800;
        this.height=800;
    }

    List<ChessPiece> pieces; 
}
