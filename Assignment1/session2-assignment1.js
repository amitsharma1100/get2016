$(document).ready(setText);

function setText() {
	$(window).load(function() {
		$('label.hello').text("Hello World");
	});
}
