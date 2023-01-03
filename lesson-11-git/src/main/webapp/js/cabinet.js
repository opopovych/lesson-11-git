$(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });
        
        
        $("button.product-logout").click(function() {

		$.get("logout", function(data) {
			if (data !== '') {
				var customUrl = '';

				var urlContent = window.location.href.split('/');
				for (var i = 0; i < urlContent.length - 1; i++) {
					customUrl += urlContent[i] + '/';
				}
				customUrl += data;
				window.location = customUrl;
			}

		});
	
});