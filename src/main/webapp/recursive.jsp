<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page import="com.recursive.demo.*" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Hello</title>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/common.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<form:form method = "GET" action='result-data-import'>
<%!
	public void addMessagePartToDisplay(StringBuilder output, String key, String value){
		output.append("<tr>");
		output.append("<td>" + key + "</td>");
		output.append("<td>" + value + "</td>");
		output.append("</tr>");
	}
	public void appendHtml(StringBuilder output, int index, String key, String value){
		if(!(output.toString().endsWith("</tr>") || output.toString().endsWith("'tblRecursive'>"))){
			output.append("</tr>");
		}
		output.append("<tr>");
		for(int i = 0; i < index; i++){
			output.append("<td></td>");
		}
		output.append("<td>" + key + "</td>");
		output.append("<td>" + value + "</td>");
	}
	public int displayDataRecursively(MessageParts msgParts, StringBuilder output, int index){
		for(MessageParts parts : ((MessageSection)msgParts).getSectionData()){
			if(parts instanceof MessageSection){
				appendHtml(output, index, parts.getKey(), parts.getValue());
				index+=1;
				index = displayDataRecursively(parts, output, index);
			}else if(parts instanceof MessageParameter){
				appendHtml(output, index, parts.getKey(), parts.getValue());
			}
		}
		return index;
	}
	public void formatHtmlData(MessageParts msgParts, StringBuilder output){
		int iterator = 0;
		for(MessageParts parts : ((MessageSection)msgParts).getSectionData()){
			if(parts instanceof MessageSection){
				addMessagePartToDisplay(output, parts.getKey(), parts.getValue());
				displayDataRecursively(parts, output, 1);
			}else{
				addMessagePartToDisplay(output, parts.getKey(), parts.getValue());
			}
		}
	}
%>

<%
	int index = 0;
	StringBuilder output = new StringBuilder();
	MessageParts msgParts = (MessageParts)request.getAttribute("msgParts");
	output.append("<table class = 'tblRecursive'>");
	formatHtmlData(msgParts, output);
	output.append("</table>");
	System.out.println(output.toString());
	out.write(output.toString());
	
%>
</form:form>
</html>