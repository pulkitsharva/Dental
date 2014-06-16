<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
		<!--<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>-->
		<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  		<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  
   <!--    <script>
            $(document).ready(function()
            {
                $("#searchbox").keyup(function()
                {
                   var sr=$("#searchbox").val();
                   $("#suggestion_box").val('');
                  $.ajax(
                  {
                      type:"get",
                      url:"suggestion?value="+sr,
                      cache:false,
                      success:function(data)
                      {
                    	  alert(data.length)
                    	  for( var i = 0, len = data.length; i < len; ++i)
                    	  {
                    		  console.log("value:"+data[i].name);
                    		  alert("value:"+data[i].name);
                    	  }
                      },
                  	error:function(error) 
                  	{ 
                      alert("error"+JSON.stringify(error));
                 }
                  });
                });   
            });
        </script>-->
        <script>
        	$(function() 
        	{
			    var availableTags=[];
			    $.ajax(
			   	{
			   		type:"get",
			        url:"load",
			        cache:false,
			        success:function(data)
			        {
			            for( var i = 0, len = data.length; i < len; ++i)
			            {
			         		 console.log("value:"+data[i].name);
			              	 //alert("value:"+data[i].name);
			              	  availableTags[i]=data[i].name;
			             }
			         },
			       	error:function(error) 
			        { 
			           	alert("error"+JSON.stringify(error));
			        }
			     });
			    $( "#tags" ).autocomplete({
			      source: availableTags
			    });
			  });
  		</script>
	</head>
	<body>
	${springVar } is awesome!!!!
  
	  <label for="tags">Tags: </label>
	  <input id="tags">
	</body>
</html>