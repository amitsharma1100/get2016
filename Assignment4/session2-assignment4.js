$('document').ready(init);

function init() {

	$('input#name-text-box-id').keyup(keyupNameHandler);
	$('input#age-text-box-id').keyup(keyupAgeHandler);
	$('textarea#address-text-area-id').keyup(keyupAddressHandler);
}

function keyupNameHandler() {

	$('input#name-text-box-id').animate({
		backgroundColor : 'red'
	}, 'slow', function() {
		$('input#name-text-box-id').animate({
			backgroundColor : 'white'
		}, '1000000');
	});
	$('div#div-inside-div-id').html(
			"Name : " + $('input#name-text-box-id').val());

}

function keyupAgeHandler() {

	$('input#age-text-box-id').animate({
		backgroundColor : 'red'
	}, 'slow', function() {
		$('input#age-text-box-id').animate({
			backgroundColor : 'white'
		}, '1000000');
	});
	$('div#div-inside-div-id')
			.html("Age : " + $('input#age-text-box-id').val());

}

function keyupAddressHandler() {

	$('textarea#address-text-area-id').animate({
		backgroundColor : 'red'
	}, 'slow', function() {
		$('textarea#address-text-area-id').animate({
			backgroundColor : 'white'
		}, '1000000');
	});
	$('div#div-inside-div-id').html(
			"Address : " + $('textarea#address-text-area-id').val());

}
