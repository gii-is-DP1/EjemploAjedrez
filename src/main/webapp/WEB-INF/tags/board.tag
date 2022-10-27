<%@ attribute name="chessBoard" required="false" rtexprvalue="true" type="es.us.dp1.games.chess.model.ChessBoard"
 description="Chessboard to be rendered" %>
<canvas id="canvas" width="${chessBoard.width}" height="${chessBoard.height}"></canvas>
<img id="source" src="${chessBoard.background}" style="display:none">
<img id="HORSE-BLACK" src="resources/images/HORSE-BLACK.png" style="display:none">
<img id="KING-BLACK" src="resources/images/KING-BLACK.png" style="display:none">
<img id="KING-WHITE" src="resources/images/KING-WHITE.png" style="display:none">
<script>
function drawBoard(){ 
    var canvas = document.getElementById("canvas");
    var ctx = canvas.getContext("2d");
    var image = document.getElementById('source');
    ctx.drawImage(image, 0, 0, ${chessBoard.width}, ${chessBoard.height});     
    <jsp:doBody/>
}
window.onload =drawBoard();
</script>
