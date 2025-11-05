package com.cs.onlinelearning.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.onlinelearning.comp.LearningController;
import com.cs.onlinelearning.config.AppConfig;

public class OnlineLearningPlatformApplication {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);) {
			LearningController controller= ctx.getBean(LearningController.class);
			controller.displayWelcomeMessage();
			controller.enrollJavaCourse();
			controller.enrollPythonCourse();
			controller.enrollDataScienceCourse();
			controller.displayClosingMessage();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
