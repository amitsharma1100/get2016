function funChart() {
	var temp1 = document.getElementById("firstno").value.trim();
	var temp2 = document.getElementById("secondno").value.trim();
	var temp3 = document.getElementById("thirdno").value.trim();
	var temp4 = document.getElementById("fourthno").value.trim();

	if (temp1 == "" || temp2 == "" || temp3 == "" || temp4 == "") {
		alert("Values can't be left empty");
		return false;
	} else if (isNaN(temp1) || isNaN(temp2) || isNaN(temp3) || isNaN(temp4)) {
		alert("Enter only numbers");
		return false;
	} else if (temp1 < 0 || temp2 < 0 || temp3 < 0 || temp4 < 0) {
		alert("Negative numbers are not allowed");
		return false;
	} else {
		var fno = parseInt(temp1);
		var sno = parseInt(temp2);
		var tno = parseInt(temp3);
		var fono = parseInt(temp4);
		var array = [ fno, sno, tno, fono ];
		var max = Math.max(fno, sno, tno, fono);
		var result = "";

		for (var index1 = max; index1 > 0; index1--) {
			for (var index2 = 0; index2 < array.length; index2++) {
				if (array[index2] < index1) {
					result += "&nbsp;&nbsp;";
				} else {
					result += "*";
				}
				result += "&nbsp;&nbsp;&nbsp;";
			}
			result += "<br />";
		}
		for (var index2 = 0; index2 < array.length; index2++) {
			result += array[index2] + "&nbsp;&nbsp;&nbsp;";
		}

		document.getElementById("result").innerHTML = result;
	}
}