$(document).ready(function() {
	$("#button").click(funToggleSpan);
});

function funToggleSpan() {
	var oldText = $("#button").text();
	$("#span").toggle();
	if(oldText === "Hide") {
		
		$("#button").text("Show");
	} else {
		$("#button").text("Hide");
	}
}
