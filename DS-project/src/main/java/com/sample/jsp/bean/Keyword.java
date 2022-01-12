package com.sample.jsp.bean;

import java.util.ArrayList;

public class Keyword {
  public String name;
  private int score;
  private ArrayList<Keyword> applelist = new ArrayList<Keyword>();
  private ArrayList<Keyword> cosmeticlist = new ArrayList<Keyword>();
  private ArrayList<Keyword> selectlist = applelist;
  
  public Keyword(String name,int score){
   this.name = name;
   this.score = score;
  }
  public Keyword() {
  
  }
  
  public int getScore() {
  return score;
 }
 public void setScore(int score) {
  this.score = score;
 }
 public ArrayList<Keyword> getSelectlist() {
  return selectlist;
 }
 public void setSelectlist(String select) {
  System.out.println(select);
  if(select.equals("apple")) {
   this.selectlist = applelist;
  }
  else {
   this.selectlist = cosmeticlist;
  }
  
 }
 public ArrayList<Keyword> getapplelist() {
  return applelist;
 }
 public void setapplelist() {
  applelist.add(new Keyword("APPLE", 5));
  applelist.add(new Keyword("MacBook", 5));
  applelist.add(new Keyword("iMac", 5));
  applelist.add(new Keyword("electronic", 5));
  applelist.add(new Keyword("computer", 5));
  applelist.add(new Keyword("merchandise", 2));
  applelist.add(new Keyword("working system", 4));
  applelist.add(new Keyword("phone", 3));
  applelist.add(new Keyword("iPad", 5));
  applelist.add(new Keyword("BTS", 4));
  applelist.add(new Keyword("secondhand", 2));
  applelist.add(new Keyword("M.A.C", -3));
  applelist.add(new Keyword("Cosmetic", -3));
  applelist.add(new Keyword("cosmetic" ,-5));
  applelist.add(new Keyword("foundation", -5));
  applelist.add(new Keyword("lipstick", -5));
  applelist.add(new Keyword("makeup", -5));
  applelist.add(new Keyword("lipstick", -5));
  applelist.add(new Keyword("counter", -2));
  applelist.add(new Keyword("bullet", -4));
  applelist.add(new Keyword("endorse", -3));
  
  
 }
  public ArrayList<Keyword> getcosmeticlist() {
   return cosmeticlist;
  }
  public void setcosmeticlist() {
   cosmeticlist.add(new Keyword("M.A.C", 3));
   cosmeticlist.add(new Keyword("Cosmetic", 3));
   cosmeticlist.add(new Keyword("彩妝" ,5));
   cosmeticlist.add(new Keyword("粉底", 5));
   cosmeticlist.add(new Keyword("口紅", 5));
   cosmeticlist.add(new Keyword("化妝品", 5));
   cosmeticlist.add(new Keyword("唇膏", 5));
   cosmeticlist.add(new Keyword("專櫃", 2));
   cosmeticlist.add(new Keyword("bullet", 4));
   cosmeticlist.add(new Keyword("代言", 3));
   cosmeticlist.add(new Keyword("APPLE", -5));
   cosmeticlist.add(new Keyword("MacBook", -5));
   cosmeticlist.add(new Keyword("iMac", -5));
   cosmeticlist.add(new Keyword("電子產品", -5));
   cosmeticlist.add(new Keyword("電腦", -5));
   cosmeticlist.add(new Keyword("周邊", -2));
   cosmeticlist.add(new Keyword("作業系統", -4));
   cosmeticlist.add(new Keyword("手機", -3));
   cosmeticlist.add(new Keyword("平板", -5));
   cosmeticlist.add(new Keyword("BTS", -4));
   cosmeticlist.add(new Keyword("二手", -2));
   
   
   
  }
 public void setName(String name) {
   this.name = name;
  }
  public String getName() {
   return name;
  }
  @Override
  public String toString(){
   return "["+name+","+"]";
  }
  public static void main(String[] args) {
   System.out.println("QQ");
  }
 }