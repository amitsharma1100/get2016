function funFindLargest(temp1, temp2, temp3) {

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