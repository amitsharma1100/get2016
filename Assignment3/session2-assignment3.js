$(document).ready(init);

function init() {
	$("#btn-start").click(startAnimation);
	$("#btn-stop").click(stopAnimation);
	$("#btn-back").click(reverseAnimation);
	$("#btn-top").click(moveTop);
	$("#btn-left").click(moveLeft);
	$("#btn-right").click(moveRight);
	$("#btn-bottom").click(moveBottom);
}

function startAnimation() {
	$("#my-div").animate({
		left : '+=300px'
	}, 200);
}

function stopAnimation() {
	$("#my-div").stop();
}

function reverseAnimation() {
	$("#my-div").animate({
		left : '-=300px'
	}, 200);
}

function moveTop() {
	$("#my-div").animate({
		top : '-=50px'
	}, 200);
}

function moveRight() {
	$("#my-div").animate({
		left : '+=50px'
	}, 200);
}
function moveBottom() {
	$("#my-div").animate({
		top : '+=50px'
	}, 200);
}
function moveLeft() {
	$("#my-div").animate({
		left : '-=50px'
	}, 200);
}