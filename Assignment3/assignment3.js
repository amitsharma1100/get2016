window.onload = function funAddTen() {

	var input = prompt("Enter the value", "");
	if (input.trim() == "" || isNaN(input) || input==null) {
		funAddTen();
		return false;
	} else {
		var result = parseInt(input) + 10;
		document.getElementById("container").innerHTML = "The result is "
				+ result;
	}
}