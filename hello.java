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
    
  }
}