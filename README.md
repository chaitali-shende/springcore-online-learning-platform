# 🎓 Online Learning Platform (Spring Core Project)

This project simulates an **Online Learning Platform** built using **Spring Core (Annotation-based Configuration)**.  
Students can enroll in different courses — Java, Python, or Data Science — and each course is delivered through a specific delivery mode such as **Online**, **Recorded**, or **Classroom**.

---

## 🧩 Project Overview

### 🔹 Objective
To demonstrate the use of **Spring Core features** like:
- Interfaces and their concrete implementations.
- **Dependency Injection (DI)** using `@Autowired` and `@Qualifier`.
- **Annotation-based configuration** (no XML).

---

## ⚙️ Technologies Used
- **Java 17+**
- **Spring Core 6+**
- **AnnotationConfigApplicationContext**
- **Maven / IDE-based run configuration**

---

## 🧱 Project Structure

com.cs.onlinelearning

┣ 📂 comp

┃ ┣ Course.java

┃ ┣ DeliveryMode.java

┃ ┣ JavaCourse.java

┃ ┣ PythonCourse.java

┃ ┣ DataScienceCourse.java

┃ ┣ OnlineDelivery.java

┃ ┣ RecordedDelivery.java

┃ ┣ ClassroomDelivery.java

┃ ┗ LearningController.java

┣ 📂 config

┃ ┗ AppConfig.java

┗ 📂 main

┗ OnlineLearningPlatformApplication.java

---

## 🧾 Expected Console Output

🎓 Welcome to Online Learning Courses
==========================================


===== Course Enrollment =====

Enrolled in:: Java Programming

Delivered via:: Live Online

---------------------------------------

===== Course Enrollment =====

Enrolled in:: Python for Beginners

Delivered via:: Recorded Video

---------------------------------------

===== Course Enrollment =====

Enrolled in:: Data Science with ML

Delivered via:: In-Person Classroom

---------------------------------------

🏁 Thank you for learning with us!
Keep exploring, keep growing! 🌱

---

## 💡 Key Learnings

Demonstrated @Component, @Autowired, @Qualifier usage.

Used annotation-based configuration instead of XML.

Showed real-world DI mapping between course and delivery strategy.

Implemented modular & scalable Spring Core design.
