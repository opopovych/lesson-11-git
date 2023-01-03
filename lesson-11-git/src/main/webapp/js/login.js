
function loginRegisterSwitch() {
	$('form').animate({ height: "toggle", opacity: "toggle" }, "slow");
}

$('.message a').click(function() {
	loginRegisterSwitch();
});

function showAlertAfterRegistration() {
	$('div.alert.alert-success').show();
}


$("button.register").click(function() {
	var firstName = $("form.register-form input.firstName").val();
	var lastName = $("form.register-form input.lastName").val();
	var email = $("form.register-form input.email").val();
	var password = $("form.register-form input.password").val();


	if (firstName == '' || lastName == '' || email == '' || password == '') {
		alert("Please Fill All Fields");
	}
	else if ((password.length) < 8) {
		alert("Password should atleast 8 character in length...!!!!!!");

	} else {


		var userRegistration = {
			firstName: firstName,
			lastName: lastName,
			email: email,
			password: password
		};
		$.post("ServletRegister", userRegistration, function(data) {
			if (data == 'success') {
				$("form")[0].reset();
				$("form")[1].reset();
				loginRegisterSwitch();
				showAlertAfterRegistration();
			}

		});
	}
});




$("button.login").click(function() {

	var email = $("form.login-form input.email").val();
	var password = $("form.login-form input.password").val();


	if (email == '' || password == '') {
		alert("Please Fill All Fields");
	} else {


		var userLogin = {

			email: email,
			password: password
		};
		$.post("login", userLogin, function(data) {
			if (data !== '') {
				var customUrl = '';

				var urlContent = window.location.href.split('/');
				for (var i = 0; i < urlContent.length - 1; i++) {
					customUrl += urlContent[i] + '/';
				}
				customUrl += data.destinationUrl;
				window.location = customUrl;
			}




		});
	}
});


