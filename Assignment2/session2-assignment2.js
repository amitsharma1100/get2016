function funPattern() {
	var tempVar = document.getElementById("rowNo").value.trim();

	if (tempVar == "") {
		alert("Values can't be left empty");
		return false;
	} else if (isNaN(tempVar)) {
		alert("Enter only numbers");
		return false;
	} else if (tempVar < 1) {
		alert("Numbers less than 1 are not allowed");
		return false;
	} else {
		var rowNo = parseInt(tempVar);
		funDoWhileLoop(rowNo);
	}
}

function funForLoop(rowNo) {
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
	return true;

}

function funWhileLoop(rowNo) {
	var result = "";
	var i = 0;
	while (i < rowNo) {
		var j = 0;
		while (j < rowNo - i) {
			result += "&nbsp;&nbsp;";
			j++;
		}
		var k = 0;
		while (k <= i) {
			result += "*&nbsp; ";
			k++;
		}
		result += "<br>";
		i++;
	}
	document.getElementById("result").innerHTML = result;
	return true;

}

function funDoWhileLoop(rowNo) {
	var result = "";
	var i = 0;
	do {
		var j = 0;
		while (j < rowNo - i) {
			result += "&nbsp;&nbsp;";
			j++;
		}
		var k = 0;
		while (k <= i) {
			result += "*&nbsp; ";
			k++;
		}
		result += "<br>";
		i++;
	} while (i < rowNo);
	document.getElementById("result").innerHTML = result;
	return true;

}
