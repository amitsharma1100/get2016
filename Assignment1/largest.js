function funFindLargest() {

	var temp1 = document.getElementById("firstno").value.trim();
	var temp2 = document.getElementById("secondno").value.trim();
	var temp3 = document.getElementById("thirdno").value.trim();

	if (temp1 == "" || temp2 == "" || temp3 == "") {
		alert("Values can't be left empty");
		return false;
	} else if (isNaN(temp1) || isNaN(temp2) || isNaN(temp3)) {
		alert("Enter only numbers");
		return false;
	} else {
		var fno = parseInt(temp1);
		var sno = parseInt(temp2);
		var tno = parseInt(temp3);
		var result;
		if (fno > sno) {
			if (fno > tno) {
				result = fno;
			} else {
				result = tno;
			}
		} else {
			if (sno > tno) {
				result = sno;
			} else {
				result = tno;
			}
		}

		document.getElementById("result").innerHTML = "Max is: " + result;
		return true;
	}
}