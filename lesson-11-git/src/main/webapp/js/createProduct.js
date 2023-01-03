$("button.createProduct").click(function() {
	var name = $("div.form-group input.nameProduct").val();
	var description = $("div.form-group input.descriptionProduct").val();
	var price = $("div.form-group input.priceProduct").val();



	


		var productObject = {
			name: name,
			description: description,
			price: price,
			
		};
		$.post("product", productObject, function(data) {
			if (data == 'success') {
				
			
			}

		});
	
});