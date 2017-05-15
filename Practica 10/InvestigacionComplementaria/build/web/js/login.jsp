$(document).ready(function() {
    $("#loginForm").submit(function(e) {
        e.preventDefault();
        $.ajax({
            type: 'POST',
            url: "login.jsp",
            data: ,
            success: function(msg){
                    $('#login').append(msg);
            },
            error: function(){
                alert(data);
            }
        });
    });
});