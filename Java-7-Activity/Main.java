
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/* For each of the challenges below:
    a) declare the variables, 
    b) ask the user for the variable values, 
    c) write the specified equation, and 
    d) display the equation value.
*/    
 
//    Challenge 1:  See file Actvy7_Eq1  (done for you)
      System.out.println("Enter the value for x ");
      double x =Input.readDouble();
      double y = Math.pow(x,7);
      System.out.println("Value of y is "+y);   
  
//    Challenge 2:  See file Actvy7_Eq2
double A = 3;
double B = 2;  
double C = Math.sqrt(A+B);
System.out.println(C);
//    Challenge 3:  See file Actvy7_Eq3
double z = 3; 
double q = Math.pow(z, 3)+5;
System.out.println(q);
  
//    Challenge 4:  See file Actvy7_Eq4
double m = 3; 
double n =2; 
double k = Math.pow(m,5)/Math.sqrt(n+1);
System.out.println(k); 

//    Challenge 5:  See file Actvy7_Eq5
  double r = 4; 
  double t =6;
  double s = Math.pow(t,5)*Math.pow(r+2, 4);
  System.out.println(s);
//    Challenge 6:  See file Actvy7_Eq6
  double x1=2;
  double x2=5;
  double y1=20;
  double y2=10;
  double d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); 
  System.out.println(d);

//    Challenge 7:  See file Actvy7_Eq7    (HINT: What does the "plus minus: after "-b" mean?)
  double a=1; 
  double b=3;
  double c = -10;
  double xI = -1*b+Math.sqrt(Math.pow(b,2)-4*a*c);
  double xII = -1*b-Math.sqrt(Math.pow(b,2)-4*a*c);
  System.out.println(xI);
  System.out.println(xII);
    

    // **************************************************
    // ******** Don't write any code below here. ********
    // **************************************************
  }
}