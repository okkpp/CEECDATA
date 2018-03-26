/**
*	wzyBootStrapTable 1.0
*	Date: 2018-03-16
*	定制化BootStrapTable
*/
(function($) {
	$.fn.wzyTable = function(options) {
		console.log(options);
		console.log(options.column);
		var thisTable = $(this);
		thisTable.attr('class','table table-hover');
		thisTable.append('<tr>');
		for (var i = 0 ; i < column.length; i++) {
			thisTable.append('<td>' + column[i].title + '</td>');
		}
		thisTable.append('</tr>');
	}
})(jQuery)