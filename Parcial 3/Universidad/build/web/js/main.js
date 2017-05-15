function habilitarControlesUsuarios() {
    $('#loginForm').prop("hidden", true);
    $('#navbar-nav').prop("hidden", false);
    $('#navbar-right').prop("hidden", false);
    $('#only-users-username').append(username);
}
;
function logout() {
    if (confirm("Esta apunto de abondonar la sesion, esta seguro?"))
    {
        $.ajax({
            type: 'POST',
            url: "logout.jsp",
            data: {},
            success: function (msg) {
                $('<div id="loginMsg"></div>').replaceAll('#loginMsg');
                logged = false;
                username = '';
                isDirector = false;
                window.location.href = 'index.jsp';
            },
            error: function () {
                alert();
            }
        });
    }
}
$(document).ready(function () {
    $("#loginForm").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: 'POST',
            url: "login.jsp",
            data: $('#loginForm').serialize(),
            success: function (msg) {
                $('<div id="loginMsg"></div>').replaceAll('#loginMsg');
                $('#loginMsg').append(msg);
                if (logged)
                {
                    habilitarControlesUsuarios();
                }
                $('div.alert').hide();
                $('div.alert').alert();
                $('div.alert').fadeTo(2000, 500).slideUp(500, function () {
                    $('div.alert').slideUp(500);
                });
                if (isDirector) {
                    $('#only-directors').css("display", "block");
                }
                document.getElementById("loginForm").reset();
            },
            error: function () {
                alert();
            }
        });
    });
    $("#editProfileForm").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: 'POST',
            url: "editprofile.jsp",
            data: $('#editProfileForm').serialize(),
            success: function (msg) {
                $('<div id="editProfileMsg"></div>').replaceAll('#editProfileMsg');
                $('#editProfileMsg').append(msg);
                $('div.alert').hide();
                $('div.alert').alert();
                $('div.alert').fadeTo(2000, 500).slideUp(500, function () {
                    $('div.alert').slideUp(500);
                });
                document.getElementById("editProfileForm").reset();
            },
            error: function () {
                alert();
            }
        });
    });
    $("#addTeacher").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: 'POST',
            url: "addteacher.jsp",
            data: $('#addTeacher').serialize(),
            success: function (msg) {
                $('<div id="teacherOptionMsg"></div>').replaceAll('#teacherOptionMsg');
                $('#teacherOptionMsg').append(msg);
                $('div.alert').hide();
                $('div.alert').alert();
                $('div.alert').fadeTo(2000, 500).slideUp(500, function () {
                    $('div.alert').slideUp(500);
                });
                document.getElementById("addTeacher").reset();
                $('#cerrarInsertarTeacher').click();
            },
            error: function () {
                alert();
            }
        });
    });
    $("#escuela").change(function (e) {
        $.ajax({
            type: 'POST',
            url: "fillDocenteSelect.jsp",
            data: { escuela : $("#escuela").val() },
            success: function (msg) {
                $('#docente').append(msg);
            },
            error: function () {
                alert();
            }
        });
    });
    $("#addVisit").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: 'POST',
            url: "addVisit.jsp",
            data: $('#addVisit').serialize(),
            success: function (msg) {
                $('<div id="visitOptionMsg"></div>').replaceAll('#visitOptionMsg');
                $('#visitOptionMsg').append(msg);
                $('div.alert').hide();
                $('div.alert').alert();
                $('div.alert').fadeTo(2000, 500).slideUp(500, function () {
                    $('div.alert').slideUp(500);
                });
                document.getElementById("addVisit").reset();
                $('#cerrarInsertarVisit').click();
            },
            error: function () {
                alert();
            }
        });
    });
});