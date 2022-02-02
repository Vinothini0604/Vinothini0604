class Stock {
  int qty = 15;
  
  synchronized void purchaseStock(int quantity) {
    System.out.println("Purchase stock");
     
    if(this.qty < quantity) {
      System.out.println("Insufficient quantity available");
      try {
        wait();
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    }
    this.qty = this.qty - quantity;
    System.out.println("Purchase stock completed");
  }
  
  synchronized void addStock(int quantity) {
    System.out.println("Adding Product stock");
    
    this.qty = this.qty + quantity;
    System.out.println("Add stock completed");
    notify();
    
  }
}
public class InterThreadCommunicationDemo {
  public static void main(String[] args) {
    Stock s = new Stock();
    new Thread() {
      public void run() {
        s.purchaseStock(20);
      }
    }.start();
     
    new Thread() {
      public void run() {
        s.addStock(10);
      }
    }.start();
  }
}