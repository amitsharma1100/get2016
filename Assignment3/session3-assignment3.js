function funRadioSelect() {

	if (document.getElementById("dropDownOne").checked) {
		var radioSelectorValue = document.getElementById('car');
		var result = radioSelectorValue.options[radioSelectorValue.selectedIndex].value;
	} else if (document.getElementById("dropDownTwo").checked) {
		var radioSelectorValue = document.getElementById('bike');
		var result = radioSelectorValue.options[radioSelectorValue.selectedIndex].value;
	}
	alert(result);
	return true;
}
