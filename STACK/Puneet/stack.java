class Stack{
  
  private int[] stackArray = new int[10];
  private int size;
  private int index = 0;
  
  public Stack(int size){
    
    stackArray = new int[size]; 
  }
  
  public void push(int element){
    
    if(index >= 10){
      
      System.out.println("The stack is full now ");
      
    }
    else{
      stackArray[index++] = element;
    }
  }
  
  public int pop(){
    
    if(index <= 0){
      
      System.out.println("The stack is already empty");
      return 0;
    }
    return stackArray[--index];
  }
  
  
  public static void main(String[] args) {
    System.out.println("hello world");
    
    Stack newStack = new Stack(100);
    newStack.push(10);
    System.out.println("10 pushed");
    newStack.push(15);
    System.out.println("15 pushed");
    newStack.push(55);
    System.out.println("55 pushed");
    newStack.push(65);
    System.out.println("65 pushed");
    
    System.out.println("Number popped : "+ String.valueOf(newStack.pop()));
    System.out.println("Number popped : "+ String.valueOf(newStack.pop()));
    System.out.println("Number popped : "+ String.valueOf(newStack.pop()));
  }
}
