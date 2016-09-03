window.onload = function funTable() {
	var input = prompt("Enter the number", "").trim();

	if (input == null || input == "") {
		alert('Value can\'t be empty');
		funTable();
	} else if (isNaN(input)) {
		alert('Enter only numbers');
		funTable();
	} else {
		var result = "";
		for (var index = 1; index < 11; index++) {
			var value = index * parseInt(input);
			result += index + "   *   " + input + " =   " + value + "<br/>";

		}
		document.getElementById("result").innerHTML = result;
		document.getElementById("header").innerHTML = "Table of " + input;

	}
}