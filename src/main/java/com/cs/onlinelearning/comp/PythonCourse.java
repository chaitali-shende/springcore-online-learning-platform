package com.cs.onlinelearning.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PythonCourse implements Course {
	@Autowired
	@Qualifier("recordedDelivery")
	private DeliveryMode deliveryMode;

	@Override
	public String getCourseName() {
		return "Python for Beginners";
	}
	
	public String getDeliveryMode() {
		return deliveryMode.deliver(getCourseName());
	}
}
