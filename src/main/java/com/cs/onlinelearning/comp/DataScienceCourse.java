package com.cs.onlinelearning.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DataScienceCourse implements Course {
	
	@Autowired
	@Qualifier("classroomDelivery")
	private DeliveryMode deliveryMode;

	@Override
	public String getCourseName() {
		return  "Data Science with ML";
	}
	
	public String getDeliveryMode() {
		return deliveryMode.deliver(getCourseName());
	}

}
