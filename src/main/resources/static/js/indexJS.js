function registration() {
    var login = document.getElementById("username");
    var password = document.getElementById("password");

    var dataJson = {
        login: login,
        password: password
    }
                $.ajax({
                    type: "POST",
                    url: "/registration",
                    data: JSON.stringify(dataJson),
                    async: false,
                    dataType: "json",
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    },
                    success: function (data) {
                        alert("Пароль успешно изменен!")
                    }
                })

    }
