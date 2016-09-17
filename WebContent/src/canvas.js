var canvas = document.querySelector("#canvas");
var ctx = canvas.getContext("2d");

ctx.fillStyle = "blue";
// Start at (0,0) and draw a 50px x 50px blue rectangle.
ctx.fillRect(0,0,200,200);
// Start at (0,0) and clear a 25px x 25px rectangle.
// ctx.clearRect(0,0,25,25);