function funValueChanged() {
	var gender = document.getElementsByName("gender");
	var maritalStatus = document.getElementsByName("maritalStatus");
	var result = "";
	var i;
	for (i = 0; i < gender.length; i++) {
		if (gender[i].checked) {
			result = "Gender :" + gender[i].value;
			result += "<br />";
		}
	}
	for (i = 0; i < maritalStatus.length; i++) {
		if (maritalStatus[i].checked) {
			result += "Marital  Status :" + maritalStatus[i].value;
		}
	}
	document.getElementById("result").innerHTML = result;
	return true;
}
