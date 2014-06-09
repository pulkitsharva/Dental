<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<link rel="stylesheet" href="<c:url value="/resources/programdiary.css"/>"/>
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
  $(function() {
    var availableTags = [
      "ActionScript",
      "AppleScript",
      "Asp",
      "BASIC",
      "C",
      "C++",
      "Clojure",
      "COBOL",
      "ColdFusion",
      "Erlang",
      "Fortran",
      "Groovy",
      "Haskell",
      "Java",
      "JavaScript",
      "Lisp",
      "Perl",
      "PHP",
      "Python",
      "Ruby",
      "Scala",
      "Scheme"
    ];
    $( "#tags" ).autocomplete({
      source: availableTags
    });
  });
  </script>
	</head>
	<body>
	${springVar } is awesome!!!!
	
	<div id="container">
     <center><h1 style='color:#777777'><a href='http://www.programdiary.in'><img src="pd.jpg" /> </a> Suggestion box</h1></center>
         <div><center><textarea name="search" id="searchbox"></textarea><center></div>
         <div id="suggestion_box"></div>
                
        </div>
       
  <label for="tags">Tags: </label>
  <input id="tags">

	</body>
</html>