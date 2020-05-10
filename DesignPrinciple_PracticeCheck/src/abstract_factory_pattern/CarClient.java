package abstract_factory_pattern;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(CarClient.class);
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Car c;
	String location;
	int con=1;
	while(con==1){
	System.out.println("Enter Your Location");
	location=sc.nextLine();
	boolean choice=false;
	do{
		switch (location) {
		case "USA":System.out.println("Enter your car model type");
		           String Type=sc.nextLine();
		           switch (Type) {
			         case "LUXURY":c=new USACarFactory(CarType.LUXURY).getCar();
		                           break;
		                  
			         case "MICRO":c=new USACarFactory(CarType.MICRO).getCar();
                                  break;
                         
			         case "MINI":c=new USACarFactory(CarType.MINI).getCar();
                                 break;

			         default:System.out.println("Wrong model type input....Enter again");
			                 choice=true;
				             break;
			        }
			
			          break;
		case "INDIA":System.out.println("Enter your car model type");
        String Type1=sc.nextLine();
        switch (Type1) {
	         case "LUXURY":c=new IndianCarFactory(CarType.LUXURY).getCar();
                        break;
               
	         case "MICRO":c=new IndianCarFactory(CarType.MICRO).getCar();
                       break;
              
	         case "MINI":c=new IndianCarFactory(CarType.MINI).getCar();
                      break;

	         default:System.out.println("Wrong model type input....Enter again");
	                 choice=true;
		             break;
	        }
	
	          break;

		default:System.out.println("Enter your car model type");
        String Type2=sc.nextLine();
        switch (Type2) {
	         case "LUXURY":c=new DefaultCarFactory(CarType.LUXURY).getCar();
                        break;
               
	         case "MICRO":c=new DefaultCarFactory(CarType.MICRO).getCar();
                       break;
              
	         case "MINI":c=new DefaultCarFactory(CarType.MINI).getCar();
                      break;

	         default:System.out.println("Wrong model type input....Enter again");
	                 choice=true;
		             break;
	        }
			break;
		}
	}while(choice==true);
	LOGGER.info("Press 1 to enter another order else Press 0");
	con=sc.nextInt();
	sc.nextLine();
}
}
}
