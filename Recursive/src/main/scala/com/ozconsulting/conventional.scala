package com.ozconsulting

object conventional extends App {
  
  def printConventional(nameList : List[String]) : Unit = {
        
      val revList = nameList.reverse;
      revList.foreach(println);
      
  }
    
   val nameList : List[String] = List("Patrick", "Lauren", "Benett", "Andrew", "Alex");
   printConventional(nameList);
}