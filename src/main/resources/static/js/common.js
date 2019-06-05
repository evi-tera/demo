function openPage(pageName) {
	$("form").attr("action", pageName);
	$("form").submit();
}
