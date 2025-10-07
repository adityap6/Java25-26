class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  
    // Call the function discount_rate()
    System.out.println( discount_rate(100.22) );   

    // Call the function honors()
  System.out.println("What is your total amount? ");
  amt = Input.readDouble();
  msg = discount_rate(amt);
  System.out.println(msg); 
    // Call the function shortSize()

    
  }

  /*
    Problem 1:      
    Write a function discount_rate() that takes an amount spent
    at the grocery and returns the rate 10% if the amount
    spent is over $100, otherwise it returns 0%.
  */
 double discount_rate(double amount){
  if(amount>100){
    return .1;
    }
    else{
      return 0;
    }

  /*
    Problem 2:
    Write a function honors() that takes a GPA (0 - 4.0) and returns 
    a string "Honors Student" if the GPA is 3.5 or above; otherwise
    it returns "Work harder".
  */
 double honors(double GPA){
  if(GPA>3.5){
    return "Honors student";
  } else{
    return "work harder";
  }
 }
  
  /*
    Problem 3:
    Write a function shortsSize() that takes a waist measurement
    in inches and returns a string "Medium" if the measurement
    is under 36inches; otherwise it returns "Large".
  */


  
  