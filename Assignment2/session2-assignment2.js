$(document).ready(init);

function init() {
	$(window).load(ajaxCall);

	$("#select-id").on('change', getSelectedOption);

}

function ajaxCall() {
	$.getJSON("http://localhost:8080/test/data/employee.json",
			displayDropDown);
}

function displayDropDown(data) {

	$("#select-id").append("<option> -- Select Name--</option>");

	$.each(data.employees, function(key, value) {
		$("#select-id").append("<option>" + value.name + "</option>");
		$(".dropdown-content").css({
			"display" : "block"
		});
	});
}

function getSelectedOption() {

	$.getJSON("http://localhost:8080/test/data/employee.json",
			getDetails);
}

function getDetails(data) {

	var optionObject = document.getElementById("select-id");
	var selectedOption = optionObject.value;
	$.each(data.employees, function(key, value) {
		if (value.name == selectedOption) {
			$("#result").css({
				"display" : "inline-block"
			});
			$("#result-name").html(value.name);
			$("#result-email").html(value.email);
			$("#result-dob").html(value.dob);
			$("#result-address").html(value.address);
		}
	});
}
