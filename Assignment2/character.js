function funCheckCharacter() {
	var input = document.getElementById("uservaluegetter").value.trim();

	if (input == "") {
		alert("Fiels can't be empty");
		document.getElementById("result").innerHTML = "";
		return false;
	} else if (!isNaN(input)) {
		alert("Numbers are not allowed");
		document.getElementById("result").innerHTML = "";
		return false;
	} else if (input.match(/[A-Z ]/i)) {
		var result = "consonant";
		if (input == "a" || input == "e" || input == "i" || input == "o"
				|| input == "u") {
			result = "vowel";
		}
		document.getElementById("result").innerHTML = input + " is a " + result;
		return true;
	} else {
		alert("Enter a valid character");
		document.getElementById("result").innerHTML = "";
		return false;
	}
}