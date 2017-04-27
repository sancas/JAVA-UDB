$(document).ready(function() {
    $("form.form-horizontal").submit(function(e) {
        e.preventDefault();
        $.ajax({
            type: 'POST',
            url: "addEmployee.jsp",
            data: {
                "txtEmployeeNum" : $('#txtEmployeeNum').val(),
                txtName: $('#txtName').val(),
                txtLastName: $('#txtLastName').val(),
                txtTelephone: $('#txtTelephone').val(),
                txtAddress1: $('#txtAddress1').val(),
                txtAddress2: $('#txtAddress2').val(),
                txtState : $('#txtState').val(),
                txtCity : $('#txtCity').val(),
                txtZip : $('#txtZip').val()
            },
            success: function(msg){
                $('<div id="output"></div>').replaceAll('#output');
                $('#output').append(msg);
                $('div.alert').hide();
                $('div.alert').alert();
                $('div.alert').fadeTo(5000, 500).slideUp(500, function(){
                    $('div.alert').slideUp(500);
                });
            },
            error: function(){
                alert(data);
            }
        });
    });
});