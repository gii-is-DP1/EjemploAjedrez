package es.us.dp1.games.ajedrez.model;

import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChessPiece extends BaseEntity {
    String type;
    String color;
    @Range(min=0,max=7)
    int xPosition;
    @Range(min=0,max=7)
    int yPosition;
}