package com.cs.onlinelearning.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaCourse implements Course {
	
	@Autowired
	@Qualifier("onlineDelivery")
	private DeliveryMode deliveryMode;

	@Override
	public String getCourseName() {
		return  "Java Programming";
	}
	
	public String getDeliveryMode() {
		return deliveryMode.deliver(getCourseName());
	}
}
