using System;
class MainClass {
  public static void Main (string[] args) {
    Stack<int> s = new Stack<int>(15);
    s.push(45);
    s.push(46);
    s.push(78);
    s.push(49);
    s.push(49);
    s.push(49);
    s.push(49);
    s.push(49);
    s.push(49);
    s.push(49);
    s.push(49);
    Console.WriteLine(s.pop());
    Console.WriteLine(s.pop());
    Console.WriteLine(s.pop());
    Console.WriteLine(s.pop());
  }
}
   
public class Stack<T>{
  int index = 0;
  T[] arr;
  
  public Stack(int size){
    arr = new T[size];
  }
  
  public void push(T data){
    try {
      arr[index++] = data;
    }
    catch(Exception e){
      Console.WriteLine("Stack is full ");
    }
  }
  
  public T pop(){
    try {
      return arr[--index];  
    }
    catch(Exception e){
      Console.Write("There is something wrong ;retrun is ");
      return default(T);
    }
  }
}   