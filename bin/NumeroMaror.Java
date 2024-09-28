public static void main (String []args) {
	
	var consola = new Scanner(System.in);
	
	  System.out.print("Digite primer numero: ");
      var num1 = Double.parseDouble(consola.nextLine());
      
      System.out.print("Digite segundo numero: ");
      var num2 = Double.parseDouble(consola.nextLine());
      
      if(num1>num2)
    	  System.out.print("El numero 1 es mayor.");
      else
    	  System.out.primt("EL numero 2 es mayor");
	
	
	
	
}