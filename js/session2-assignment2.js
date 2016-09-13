$(document).ready(init);

function init() {
	$('#button').on('click', function(e) {
		Custombox.open({
			target : '#modal-buttons',
			effect : 'blur',
			escKey : 'true'
		});
		e.preventDefault();
	});

	$('#panel').on('click', function(e) {
		Custombox.open({
			target : '#modal-panel',
			effect : 'blur',
			escKey : 'true'
		});
		e.preventDefault();
	});

	$('#grid').on('click', function(e) {
		Custombox.open({
			target : '#modal-grid',
			effect : 'blur',
			escKey : 'true'
		});
		e.preventDefault();
	});

	$('#pagination').on('click', function(e) {
		Custombox.open({
			target : '#modal-pagination',
			effect : 'blur',
			escKey : 'true'
		});
		e.preventDefault();
	});

	$('#progressbar').on('click', function(e) {
		Custombox.open({
			target : '#modal-progressbar',
			effect : 'blur',
			escKey : 'true'
		});
		e.preventDefault();
	});
}