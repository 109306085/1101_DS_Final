<%@ page import="com.sample.jsp.bean.CallGoogle" %>
<%@ page import="com.sample.jsp.bean.WebNode" %>
<%@ page import="com.sample.jsp.bean.WebTree" %>
<%@ page import="com.sample.jsp.bean.WebPage" %>
<%@ page language="java"  import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoogleSearch</title>
<style type="text/css">

body{
    animation:backgroundcolor 5s infinite;
}

h1{
    font-size: 50px;
    font-style: Impact;
    font-weight: 600;
    text-align: center;
    color: #8e8ee4;
    margin-top: 80px;
    animation: blink 3s infinite;
}

.container{
    text-align: center;
    line-height: 100px;
}

.bar{
    width:50%;
    height:40px;
    border-radius: 30px;
    border: 3px solid #8e8ee4;
    font-size: 30px;
    padding-left: 30px;
    
}

.bar:hover{
    box-shadow: 5px 5px 5px 5px rgba(175, 170, 177, 0.808);
    transition: 1s;
}

#search{
 position: absolute;
 top:143px;
 left:1173px;
    font-size:30px;
    width:103px;
    height:45px;
    margin-left: -108px;
    background-color: #8e8ee4;
    border-top-right-radius: 30px;
    border-bottom-right-radius: 30px;
    border: none;
    cursor: pointer;
    margin-top:50px
}
#search:hover{
    background-color: rgb(192, 173, 228);
    color: white;
}

.searchicon{
  position: absolute;
     top:-20px;
     left:15px;
     height:60px;
     weight:60px;
}

#cosmetic{
 position:absolute;
 top:400px;
 left:700px;
    font-size:30px;
    width:105px;
    height:50px;
    margin: -108px;
    background-color: #8e8ee4;
    border-radius: 30px;
    border: none;
    cursor: pointer;
    margin-right: 20px;
    onclick: preventDefault();
    
}
#cosmetic:hover{
    background-color: rgb(192, 173, 228);
    color: white;
}
.cos{
     height:45px;
     weight:45px;
}

.cosgif{
 position: absolute;
 height:170px;
 weight:160px;
 top: 80px;
 left:80px;
}

#apple{
    position:absolute;
    top:400px;
    left:750px;
    font-size:30px;
    width:105px;
    height:50px;
    margin: -108px;
    background-color: #8e8ee4;
    border-radius: 30px;
    border: none;
    cursor: pointer;
    margin-left: 20px;
    onclick: preventDefault2();
}
#apple:hover{
    background-color: rgb(192, 173, 228);
    color: white;
}
.apple{
     height:40px;
     weight:40px;
     position:absolute;
     top:5px;
     left:35px;
     onclick:changeColor();
}
.applegif{
 height: 200px;
 weight: 200px;
 position: absolute;
 right: 30px;
 top: 50px;
}


/* 搜尋結果CSS */

.ui-widget{
    font-size: 20px;
    list-style:none;
    transition: 1s;
    background-color: #8e8ee4;
    width:50%;
    opacity: 0.7;
    border-radius: 30px;
}

.ui-menu-item{
    padding:10px;
    width:95%;
    transition:0.05s;
}

.ui-menu-item:hover{
    background-color: #8e8ee4;
    color: white;
}

.ui-helper-hidden-accessible{
    display: none;
}
p{
	position:absolute;
	top: 400px;
	left: 630px;
	font-size:30px;
	font-style: Impact;
	color: #1d075c;
}

a{
	font-size:20px;
	text-decoration: none;
}
a:hover{
	text-decoration:underline;
}

@keyframes blink {
            0%{opacity: 0}
            50%{opacity: 1}
            100%{opicity:0}
        }
@keyframes backgroundcolor {
            0%{background:beige}
            50%{background:#e4c28e}
            100%{background:beige}
        }
</style>

<script type="text/javascript">
	
   /*function changeColor(){
  	btn1=document.getElementById("apple");
  	btn2=document.getElementById("cosmetic");
  	
  	if(!btn1.classList.add(css)){
  		btn1.classList.add(css)
   		btn2.classList.remove(css)
  	
  	else{
   		btn2.classList.add(css)
   		btn1.classList.remove(css)
  	}
  		if (e.target === btn1) { 
        button1.style.backgroundColor = 'black'; 
        button2.style.backgroundColor = 'gray'; 
       } 

       	if (e.target === btn2) { 
        button2.style.backgroundColor = 'black'; 
        button1.style.backgroundColor = 'gray'; 
       } 

      }; 

      button1.addEventListener('click', changeColour, false); 
      button2.addEventListener('click', changeColour, false); 
 }*/
   
 function preventDefault(){
	 //event.stopPropagation();
	 //event.preventDefault();
	 var1 = document.all.data.value; //獲取頁面form中的變數值   
	 var1 =var1+"cosmetic";   
	 //document.insertForm.submit; 
	 
	}
	function preventDefault2(){
	 //event.stopPropagation();
	 //event.preventDefault();
	 var1 = document.all.data.value; //獲取頁面form中的變數值   
	 var1 = var1+"apple";   
	 //document.insertForm.submit; 
	}

</script>

</head>

<body>
<form action="TEST.jsp" method='get'>

<h1> Mac or Mac </h1>

    <div class="container">
            <input class="bar" id="tags" name="keyword" placeholder="Search something...">
           
            <jsp:useBean id="call" class="com.sample.jsp.bean.CallGoogle" scope="page"></jsp:useBean>
         <jsp:setProperty name="call" property="keyword" />
            <button id="search"  type="submit">
                <img class="searchicon" src="images/icons8-cat-64.png"/>
            </button>

        <button id="cosmetic" type="submit" name="cosmetic" value="cosmetic" >
            <img class="cos" src="images/icons8-cosmetic-64 (1).png"/>
        </button>
        
        <button id="apple" type="submit" name="apple" value="apple">
            <img class="apple" src="images/icons8-apple-logo-30.png"/>
        </button>
        <input type = "hidden" name="data" >
     <%
                    String keyword = null;
              CallGoogle front = new CallGoogle();
              ArrayList<WebNode> console;
              String list=null;
                    %>
    </div>
    <div><img class="applegif" src="images/apple.gif"/></div>
    <div><img class="cosgif" src="images/cos gif.gif"/></div>
    
    <p> ღ Searching Result ღ</p>
    
    		<div style='position: absolute;top:500px;left:500px;font-size:20px;'>
                     <%
                    String str = request.getParameter("keyword");
                    String data = request.getParameter("cosmetic");
                    String data2 = request.getParameter("apple");
                    
                    
                    if(data2==null&data==null){
                     
                     front.getKeylist().setSelectlist("apple");
                    }
                    else if(data2==null&data!=null){
                     
                     front.getKeylist().setSelectlist(data);
                    }
                    else if(data==null&data2!=null){
                     
                     front.getKeylist().setSelectlist(data2);
                    }
                                        front.setKeyword(str);
                                        if(front.getKeyword()!=null){
                                        front.run();
                                        console = front.getTree().getConsole();
                                        for(int i=0;i<console.size();i++){
                                         out.print("<br>");
                                         %>
                                         <a href='<%=console.get(i).webPage.url%>'> <%=console.get(i).webPage.name%> </a> 
                              <%                        
                                        }
                                        }
               
                    %>
                    </div>
</form>
</body>
</html>