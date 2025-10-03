class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
    double FtoC(Double F){
    double C = (F-32)*5/9;
    return C; 
  }

  //3: Sphere volume
    double SphereVolume(double r){
      double V = 4/3*Math.PI*Math.pow(r, 3);
      return V; 
    } 
  
  //4: Cone volume


  //5: Distance between two coordinate points



  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
System.out.println("Enter a temp in F");
double F=Input.readDouble(); 
System.out.println("Temp in deg C is "+ FtoC(F)); 
    //3
System.out.println("Enter the radius");
double radius =Input.readDouble();
System.out.println("The volume ");
    //4 

    //5
    
    
  }
 
}