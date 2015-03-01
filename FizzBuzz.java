public class FizzBuzz
{

  	public FizzBuzz(){


	     int i = 0;

	     for( i = 1 ; i < 101 ; i++){
	
	
		  if((i % 3) == 0){
	
		  System.out.println("fizz");

		  }
	
		else if((i % 5) == 0){
	
		System.out.println("buzz");

		}


		else if((((i % 5) == 0) && ((i % 3) == 0))){
	
		System.out.println("fizzbuzz" );

		}
		
		else{

		System.out.println(i);

		}
		
		}


	}


	public static void main(String args[]){

	new FizzBuzz();

	}
	


}
