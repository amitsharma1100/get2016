$(document).ready(init);

function init() {
	initCheck();
	getData();
	$(window).resize(initCheck);
	$('.getIt').click(function() {
		showPaging($(this));
	});
	$('#movie-reviews').click(function() {
		$('#table_div').removeClass('hide');
		addTable();
		addPagination();
		$(document).ready(init);
	});
	$('#submit_button').click(search);
	$('#table_div').removeClass('hide');
}

function initCheck() {
	if ($(window).width() < 768) {
		addPlaceHolder();
	} else {
		removePlaceHolder();
	}
}

function addPlaceHolder() {
	$('#movie_title').attr('placeholder', 'Movie Title');
	$('genre').attr('placeholder', 'Genre');
	$('#director').attr('placeholder', 'Director');
	$('#writer').attr('placeholder', 'Writer');
	$('#composer').attr('placeholder', 'Composer');
	$('#producer').attr('placeholder', 'Producer');
	$('#website').attr('placeholder', 'Website');
	$('#youtube').attr('placeholder', 'You Tube');
}

function removePlaceHolder() {
	$('#movie_title').removeAttr('placeholder');
	$('genre').removeAttr('placeholder');
	$('#director').removeAttr('placeholder');
	$('#writer').removeAttr('placeholder');
	$('#composer').removeAttr('placeholder');
	$('#producer').removeAttr('placeholder');
	$('#website').removeAttr('placeholder');
	$('#youtube').removeAttr('placeholder');
}
var movieData;
var perPage = 5;
var total;
var last;
function getData() {
	movieData = [ {
		movieTitle : 'MT1',
		Genre : 'G1',
		Director : 'D1'
	}, {
		movieTitle : 'MT2',
		Genre : 'G2',
		Director : 'D2'
	}, {
		movieTitle : 'MT3',
		Genre : 'G3',
		Director : 'D3'
	}, {
		movieTitle : 'MT4',
		Genre : 'G4',
		Director : 'D4'
	}, {
		movieTitle : 'MT5',
		Genre : 'G5',
		Director : 'D5'
	}, {
		movieTitle : 'MT6',
		Genre : 'G6',
		Director : 'D6'
	}, {
		movieTitle : 'MT7',
		Genre : 'G7',
		Director : 'D7'
	}, {
		movieTitle : 'MT8',
		Genre : 'G8',
		Director : 'D8'
	}, {
		movieTitle : 'MT9',
		Genre : 'G9',
		Director : 'D8'
	}, {
		movieTitle : 'MT10',
		Genre : 'G10',
		Director : 'D10'
	}, {
		movieTitle : 'MT11',
		Genre : 'G11',
		Director : 'D11'
	}, {
		movieTitle : 'MT12',
		Genre : 'G12',
		Director : 'D12'
	}, {
		movieTitle : 'MT13',
		Genre : 'G13',
		Director : 'D13'
	} ];
	total = movieData.length;
}
function addTable() {

	var totalFiel = parseInt(total / perPage);
	var classes = "";
	var id = "pagging";
	var htmlString = "";
	for (i = 0; i < total && i < perPage; i++) {
		htmlString += '<tr>' + '<td>' + 'movie title:'
				+ movieData[i].movieTitle + '</td>';
		htmlString += '<td> Genre : ' + movieData[i].Genre + '</td>';
		htmlString += '<td> Director : ' + movieData[i].Director
				+ '</td> </tr>';
	}
	var table = $('#movieTable').children();
	table.html(htmlString)
}

function addPagination() {
	var table = $('#page');
	var htmlString = "";
	htmlString += '<li id="1"  class="getIt active ' + (1) + '"> <a>' + (1)
			+ '</a></li>';
	last = 1;
	for (var i = 1; i <= parseInt(total / perPage); i++) {
		htmlString += '<li class="getIt" id="' + (i + 1) + '"> <a>' + (i + 1)
				+ '</a></li>';
	}
	table.html(htmlString);
}

function showPaging(tag) {
	getId = parseInt(tag.attr('id'));
	var htmlString = "";
	for (i = (getId * perPage - perPage); i < total && i < (getId * perPage); i++) {

		htmlString += '<tr>' + '<td>' + 'movie title:'
				+ movieData[i].movieTitle + '</td>';
		htmlString += '<td> Genre : ' + movieData[i].Genre + '</td>';
		htmlString += '<td> Director : ' + movieData[i].Director
				+ '</td> </tr>';

	}
	var table = $('#movieTable');
	table.html(htmlString);
	var selectId = "#" + last;
	last = getId;
	$(selectId).removeClass('active');
	tag.addClass('active');
}

function search() {
	var search_data = ($('#search-term').val()).trim();
	var table = $('#movieTable').children();
	table.html("");
	var htmlString = "";
	for (var i = 0; i < total; i++) {
		if (movieData[i].movieTitle === search_data) {
			htmlString += '<tr>' + '<td>' + 'movie title:'
					+ movieData[i].movieTitle + '</td>';
			htmlString += '<td> Genre : ' + movieData[i].Genre + '</td>';
			htmlString += '<td> Director : ' + movieData[i].Director
					+ '</td> </tr>';
		}
	}
	if (htmlString === "") {
		htmlString = "Sorry, We have nothing like this";
		$('#page').html(htmlString);
	} else {
		table.html(htmlString);
	}

}