function funPattern() {
	var tempVar = document.getElementById("rowNo").value.trim();

	if (tempVar == "") {
		alert("Values can't be left empty");
		return false;
	} else if (isNaN(tempVar)) {
		alert("Enter only numbers");
		return false;
	} else if (tempVar < 0) {
		alert("Negative numbers are not allowed");
		return false;
	} else {
		var rowNo = parseInt(tempVar);
		var result = "";

		for (var i = 0; i < rowNo; i++) {
			for (var j = 0; j < rowNo - i; j++) {
				result += "&nbsp;&nbsp;";
			}
			for (var k = 0; k <= i; k++) {
				result += "*&nbsp; ";
			}
			result += "<br>";
		}
		document.getElementById("result").innerHTML = result;
	}
}