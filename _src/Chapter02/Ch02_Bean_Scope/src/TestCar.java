import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ch02.beans.Car;


public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		// first request to get the car instance
		Car car_one=(Car)context.getBean("car");
        car_one.show();
        
        //second request to get the car instance
        Car car_two=(Car)context.getBean("car");
        car_two.show();
	}

}
