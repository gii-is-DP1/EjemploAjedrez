package es.us.dp1.games.chess.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Positive;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
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

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "board",fetch = FetchType.EAGER)
    List<ChessPiece> pieces; 
}
