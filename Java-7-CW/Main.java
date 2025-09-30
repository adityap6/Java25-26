class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  // For each problem below, prompt the user for the input values for each variable in the formula.
    
  /*
    Problem 1: Translate the formula from eq1.png.
  */
 double A = 3; 
 double x = 2; 
 double z = Math.pow(A, 2*x+1);
 System.out.println(z);

    
  /*
    Problem 2: Translate the formula from eq2.png.
  */
 double y = 2*x/Math.sin(Math.toRadians(3*x)); 
 System.out.println(y);

    
    /*
    Problem 3: Translate the formula from eq3.png.
  */
 double b = Math.abs(Math.pow(x, 2)+1);
 System.out.println(b);
    

  }

  
}