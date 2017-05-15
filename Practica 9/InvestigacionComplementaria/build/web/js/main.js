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
                    $('#output').append(msg);
            },
            error: function(){
                alert(data);
            }
        });
    });
});