package com.sample.jsp.bean;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import java.util.ArrayList;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CallGoogle {
 private String keyword;
 private String url;
    private String content;
    private ArrayList<WebPage> URList = new ArrayList<WebPage>();
    public ArrayList<String> rand;
    private WebTree tree;
    private Keyword keylist= new Keyword();
    public CallGoogle(){ 
     
    }

 public Keyword getKeylist() {
  return keylist;
 }

 public void setKeylist(Keyword keylist) {
  this.keylist = keylist;
 }

 public String getKeyword() {
  return keyword;
 }
 public void setKeyword(String keyword) {
	 if(keyword!=null && keyword.contains(" ")) {
		 keyword=keyword.replace(" ", "");
	 }
  this.keyword = keyword;
 }
 
 public WebTree getTree() {
  return tree;
 }

 public void setTree(WebTree tree) {
  this.tree = tree;
 }

 public void run() throws IOException{
	 
  keylist.setapplelist();
  keylist.setcosmeticlist();
  constructor();
  query();
  try {
   createWebTree1();
  }catch (IOException e) {
   //e.printStackTrace();
  }
  
  
 }
 
 public void constructor() {
  this.url = "http://www.google.com/search?q="+keyword+"&oe=utf8&num=30";
  System.out.println(url);
  this.URList = new ArrayList<WebPage>();
  tree = new WebTree(new WebPage(url,"root"));
 }
 

 private String fetchContent() throws IOException
 {
  String retVal = "";
  URL u = new URL(url);

  URLConnection conn = u.openConnection();

  conn.setRequestProperty("User-agent", "Chrome/7.0.517.44");

  InputStream in = conn.getInputStream();

  InputStreamReader inReader = new InputStreamReader(in,"utf-8");
  
  BufferedReader bufReader = new BufferedReader(inReader);
  String line = null;

  while((line=bufReader.readLine())!=null)
  {
   retVal+=line;
  }
  
  return retVal;
 }
 
 
 public void query() throws IOException

 {

  if(content==null)

  {
   content= fetchContent();
  }
  
  Document doc = Jsoup.parse(content);
  Elements lis = doc.select("div");
  lis = lis.select(".kCrYT");
   
  for(Element li : lis)
  {
   try 

   {
    
    String citeUrl = li.select("a").get(0).attr("href");
    citeUrl = citeUrl.substring(7,citeUrl.indexOf("&sa=U&ved=2ah"));
    String title = li.select("a").get(0).select(".vvjwJb").text();
    
    if(title.equals("")) {
     continue;
    }
    if(title.contains("dictionary")) {
    	continue;
    }
    if(title.contains("商品")) {
    	continue;
       }
    if(title.contains("體驗中心")) {
    	continue;
      }
    if(title.contains("Big Mac")) {
    	continue;
      }
    WebPage page = new WebPage(citeUrl,title);
    URList.add(page);
    
   } catch (IndexOutOfBoundsException e) {
    //e.printStackTrace();
   }
   

  }

  

  

 }
 
 
 
 public void createWebTree1() throws IOException{
	  

	  for(WebPage rootPage:URList) {
	   WebNode child = new WebNode(rootPage);
	   tree.root.addChild(child);
	   System.out.println(rootPage.name+"|"+rootPage.url);
	      
	  }
	  
	  tree.setPostOrderScore(keylist.getSelectlist());
	  tree.eularPrintTree();
	 }
}