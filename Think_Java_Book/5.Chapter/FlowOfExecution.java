class  FlowOfExecution{
  
  public static void baffle(String blimp) { //3
    System.out.println(blimp); 
    zippo("ping", -5); //4
  }
  
  public static void zippo(String quince, int flag) { //1,5
    if (flag < 0) {
      System.out.println(quince + " zoop"); 
    } else { 
      System.out.println("ik"); 
      baffle(quince); //2
      System.out.println("boo-wa-ha-ha"); //6
    }
    
  }
  public static void main(String[] args) {
    zippo("rattle", 13);
  }
  
}