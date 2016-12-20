#https://repl.it/Et5s/2

using System;
class MainClass {
  public static void Main (string[] args) 
  {
    DoublyLinkedList<int> List = new DoublyLinkedList<int>(0);
    Console.WriteLine ("DoublyLinkedList");
    List.add(1);
    List.add(2);
    List.add(3);
    List.print();
    Console.WriteLine ("--------");
    List.delete(2);
    List.print();
    List.delete(3);
    Console.WriteLine ("--------");
    List.print();
    
  }
}

class DoublyLinkedList <T>
{
  T data;
  DoublyLinkedList<T> next;
  DoublyLinkedList<T> previous;
  
  public DoublyLinkedList(T data)
  {
    this.data = data;
  }
  
  public void add(T data)
  {
    DoublyLinkedList<T> holder = this;
    while(holder.next!= null)
    {
      holder = holder.next;
    }
    DoublyLinkedList<T> temp = new DoublyLinkedList<T>(data);
    holder.next = temp;
    temp.previous = holder;
  }
  
  public void print()
  {
    DoublyLinkedList<T> holder = this;
    while(holder.next!= null)
    {
      Console.WriteLine(holder.data);
      holder = holder.next;
    }
    Console.WriteLine(holder.data);
  }
  
  public void delete(T data)
  {
    DoublyLinkedList<T> holder = this;
    while(!holder.data.Equals(data))
    {
      holder = holder.next;
    }
    if(holder.next != null && holder.previous != null )
    {
    holder.previous.next = holder.next;
    holder.next.previous = holder.previous;
    }
    if(holder.previous == null)
    {
      holder.next.previous = holder.previous;
    }
    if(holder.next == null)
    {
      holder.previous.next = holder.next;
    }
  }
}     







