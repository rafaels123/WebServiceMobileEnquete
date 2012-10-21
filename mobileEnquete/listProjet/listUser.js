/**
 * 
 */


	
	$( #first" ).live("pagebeforecreate", function(){ 
			$.ajax({ 
				url:"http://localhost:8080/WebServiceMobileEnquete/aluno/alunos", 
				dataType:"xml", 
				success:function( response ) { 
				// Generate a list item for each tweet 
				var markup = ""; 
					$.each(response.results, function(index, result) { 
					var $template = $('<div><li><img class="ui-li-icon profile"> 
					<p class="from"></p><p class="tweet"></p></li></div>'); 
					$template.find(".from").append(result.from_user); 
					$template.find(".tweet").append(result.text); 
					$template.find(".profile") 
					.attr("src", result.profile_image_url); 
					markup += $template.html(); 
					}); 
				});
			)}