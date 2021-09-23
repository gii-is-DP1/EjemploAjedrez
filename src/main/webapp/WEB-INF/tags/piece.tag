<%@ attribute name="size" required="true" rtexprvalue="true" 
 description="Size of the piece to show" %>
 <%@ attribute name="piece" required="true" rtexprvalue="true" type="org.springframework.samples.petclinic.model.ChessPiece"
 description="Piece to be rendered" %>
 <script>
 var canvas = document.getElementById("canvas");
 var ctx = canvas.getContext("2d");
 ctx.globalAlpha = 0.4;
 var image = document.getElementById('${piece.type}-${piece.color}');
 ctx.drawImage(image,${piece.getXPosition()}*${size},${piece.getYPosition()}*${size},${size},${size});
 </script>