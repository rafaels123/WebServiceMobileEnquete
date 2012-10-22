<script type="text/javascript">
		$(document).ready(
				function(){
					$.ajax({
						type: "GET",
	               		url: "http://simaodev.com:8080/WebServiceMobileEnquete/projeto/projetos",
	               		dataType: "xml",
	               		success: parseXml
					});
					function parseXml(xml){
						$(xml).find('projetos').each(function(){
		            		$("catalogue").append('<li><h3>') + $(this).find("description").text() + '</h3></li>');
		       			}
					}
				}
				);