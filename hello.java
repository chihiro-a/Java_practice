public class hello {
 
  public static void main(String []args) {
    System.out.println("Hello, World!");
 
    System.out.println("The sum of 2 and 3 is 5.");
 
    int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
 
    System.out.format("The sum of %s and %s is %s.\n",
      args[0], args[1], Integer.toString(sum));
      
    String[] names = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"}
    for(int i = 0;i < names.lenght;i ++){
      System.out.println("私の名前は" + names[i] + "です")
    }
    for(String name:names){
      System.out.println("私の名前は" + name + "です");
    }
    
    int[] numbers = {1, 4, 6, 9, 13, 16};
    int oddSum = 0;
    int evenSum = 0;
    
    for(int number:numbers){
      if (number % 2 == 0){
        evenSum += number;
      } else {
        oddSum += number;
    }
    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
  System.out.println(true);
  System.out.println(false);
  System.out.println(12 / 4 == 3);
  System.out.println(12 / 4 != 3);
  boolean bool = 3 * 9 == 27;
  System.out.println(bool);
  
  System.out.println(8 < 5);
  System.out.println(3 >= 2);
  
  System.out.println(true || false);
  System.out.println(false && true);
  System.out.println(8 < 5 && 3 >= 2);
  System.out.println(8 < 5 || 3 >= 3);
  System.out.println(!(8 < 5));
  
  int x = 5;
  if(x > 2){
    System.out.println("xは2より大きい");
  }
  if(x > 8){
    System.out.println("xは8より大きい");
  }
  
  int number = 12;
  if(number < 10){
    System.out.println("10より小さい")
  } else if(number < 20){
    System.out.println("10以上、20より小さい");
  } else {
    System.out.println("20以上");
  }
  
  int number = 12;
  switch(number % 3){
    case 0:
      System.out.println("3で割り切れます");
      break;
    case 1:
      System.out.println("3で割ると1余ります");
      break;
    case 2:
      System.out.println("3で割ると2余ります")
      break;
    default:
      System.out.println("吉です");
      break;
    }
    
    int number = 10;
    while(number > 0){
      System.out.println(number)
      number -- 
    }
    
    int number = 10;
    while(number > 0){
      System.out.println(number)
      number -- 
    }
    
     int number = 12;
  if(number < 10){
    System.out.println("10より小さい")
  } else if(number < 20){
    System.out.println("10以上、20より小さい");
  } else {
    System.out.println("20以上");
  }
  
  int number = 12;
  switch(number % 3){
    case 0:
      System.out.println("3で割り切れます");
      break;
    case 1:
      System.out.println("3で割ると1余ります");
      break;
    case 2:
      System.out.println("3で割ると2余ります")
      break;
    default:
      System.out.println("吉です");
      break;
    }
  
}