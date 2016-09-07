$(document).ready(function(){
	$("#button1").click(function(){
		$("h2").siblings().css({"color": "red", "border": "2px solid red"});
	});
	$("#button2").click(function(){
		$(".siblings *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
		$("h2").siblings("p").css({"color": "red", "border": "2px solid red"});
	});
	$("#button3").click(function(){
		$(".siblings *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
		$("h2").next().css({"color": "red", "border": "2px solid red"});
	});
	$("#button4").click(function(){
		$(".siblings *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
		$("h2").nextAll().css({"color": "red", "border": "2px solid red"});
	});
	$("#button5").click(function(){
		$(".siblings *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
		$("h2").nextUntil("h6").css({"color": "red", "border": "2px solid red"});
	});
	$("#button6").click(function(){
		$(".siblings *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
		$("h2").prev().css({"color": "red", "border": "2px solid red"});
	});
	$("#button7").click(function(){
		$(".siblings *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
		$("h2").prevAll().css({"color": "red", "border": "2px solid red"});
	});
	$("#button8").click(function(){
		$(".siblings *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
		$("h2").prevUntil("p").css({"color": "red", "border": "2px solid red"});
	});
});