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

var products = null;
$.get("products", function(data){
	if(data!==''){
		products = data;
	}
}).done(function(){
	var cardsContent = " ";
	jQuery.each(products,function(i,value){
	cardsContent+="<div class='col'>"+
	"<div class='card'>"+
	"<div class='card-body'>"+
	"<h5 class='card-title'>"+value.name+"</h5"+
	"<br>"+
	"<h6 class='card-subtitle mb-2 text-muted'>"+value.price+"</h6>"+
	"<p class='card-text'>"+value.description+"</p>"+
	"<a href='product?id="+value.id+"'class='card-link'>Detais</a>"+
	"</div>"+
	"</div>"+
	"</div>"+
	"</div>"
	});
	$('#productCards').html(cardsContent);
});