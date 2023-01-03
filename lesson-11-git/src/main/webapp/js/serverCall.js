$("button.buy-product").click(function() {
	var productId = jQuery(this).attr("product-id");
	
	
	$.post("bucket", {'productId':productId},
			function(data) {
				if (data == 'Success') {
					$('#buyProductModal').modal('hide');
					alert('Success');
				}
			});
});