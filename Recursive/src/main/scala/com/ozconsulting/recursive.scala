package com.ozconsulting

import scala.annotation.tailrec;

object recursive extends App {
  
  @tailrec
  def recursiveDisplay (nameList : List[String]) : Unit = {
    
    nameList match {
      case Nil => println("La comedia e finita");
      case head::tail => { 
              println(head);
              recursiveDisplay(tail);
        }
        
    }
  
  }
 
  val nameList : List[String] = List("Patrick", "Lauren", "Benett", "Andrew", "Alex");
  recursiveDisplay(nameList);
  
}