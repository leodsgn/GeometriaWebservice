(function(){
    "use strict";

    console.log("hello world");

    $("#form_canvas").on("submit", function(e){
        e.preventDefault();
        console.log("the value is: " + $(this).serialize());
        console.log("didn' work");
    });

    var postData = function(){
        $.ajax({
            type: "POST",
            url: "/GeometriaWebService",
            data: $("#form_canvas").serialize(),
            success: success,
            dataType: "JSON"
        });

        function success(response){
            if(response){
                var ctx = $("#canvas").getContext("2d");
                var answer = $("#answer").append("<h1>" + response.nome + "</h1>");

                ctx.beginPath();
                ctx.moveTo(20,20);

                for(var i = 0; data.length(); i++){

                    // Start at (0,0) and draw a 50px x 50px blue rectangle.
                    ctx.lineTo(data[i].x,data[i].y);
                }
                ctx.stroke();


            }
        }
    };

}).call(this);