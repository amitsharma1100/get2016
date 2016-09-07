function funToggleSpan() {

	var objButton = document.getElementById("button");
	var objSpan = document.getElementById("span");
	var buttonText = objButton.value;

	if (buttonText == "Hide") {
		objSpan.style.visibility = 'hidden';
		objButton.value = "Show";
		objButton.innerHTML = "Show";
	} else {
		objSpan.style.visibility = 'visible';
		objButton.value = "Hide";
		objButton.innerHTML = "Hide";
	}
	return true;
}