<%@ attribute name="chessBoard" required="false" rtexprvalue="true" type="org.springframework.samples.petclinic.model.ChessBoard"
 description="Chessboard to be rendered" %>
<canvas id="canvas" width="${chessBoard.width}" height="${chessBoard.height}" width="${chessBoard.width}" height="${chessBoard.height}"></canvas>
<img id="source" src="${chessBoard.background}" style="display:none">
<img id="HORSE-BLACK" src="resources/images/HORSE-BLACK.png" style="display:none">
<script>
var canvas = document.getElementById("canvas");
var ctx = canvas.getContext("2d");
var image = document.getElementById('source');

ctx.drawImage(image, 0, 0, ${chessBoard.width}, ${chessBoard.height});
</script>
