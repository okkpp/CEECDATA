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
		thisTable.append('<table class="table table-hover">');

		thisTable.append('</table>');
	}
})(jQuery)