$(document).ready(function() {

	/* Q1 */
	$("#spanDivSpanButton").click(function() {
		$("span.message").fadeOut("slow");
	});

	$("#boxDivButton").click(function() {

		/* Q2 */
		$("div.box:first").slideUp("slow", function() {

			/* Q8 */
			$(".box , .error").css({
				"border-style" : "double",
				"border-color" : "black"
			});

			/* Q9 */
			$(".box.error").css({
				"border-style" : "dashed",
				"border-color " : "black"
			});
		});
	});

	/* Q3 */
	$("button").mouseenter(function() {
		$("button").css({
			"box-shadow" : "10px 10px 5px 	#F08080"
		});
	});

	/* Q4 */
	$("#imgButton").click(function() {
		$("img[alt='hello']").animate({
			left : '+=250px',
			opacity : '0.5',
			height : '150px',
			width : '150px'
		});
	});

	$("#myDivButton").click(function() {
		/* Q10 */
		$("span.info").css({
			"color" : "crimson",
			"font-family" : "Georgia"
		});

		/* Q5 */
		$("#myDiv :text").hide("slow", function() {
			/* Q6 */
			$("input[name^='txt']").fadeIn("medium", function() {
				$("input[name^='txt']").css({
					"background-color" : "crimson"
				});
			});
		});
	});

	/* Q7 */
	$("#paraDivButton").click(function() {
		$("p[class!='box']").css({
			"color" : "#F08080"
		});
	});
});