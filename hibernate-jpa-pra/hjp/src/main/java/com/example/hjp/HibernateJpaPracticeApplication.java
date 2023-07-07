package com.example.hjp;

//import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.hjp.dao.StudentDAO;
import com.example.hjp.entity.Student;

@SpringBootApplication
public class HibernateJpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaPracticeApplication.class, args);
	}


	@Bean 
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		
		return runner -> {
			//createStudent(studentDAO);
			
			createMultipleStudents(studentDAO);
			
			//readStudent(studentDAO);
			
			//queryForStudents(studentDAO);
			
			//queryForStudentsByLastName(studentDAO);
			
			//updateStudent(studentDAO);
			
			//deleteStudent(studentDAO);
			
			//deleteAllStudents(studentDAO);
		};
		
	}


	//delete all
//	private void deleteAllStudents(StudentDAO studentDAO) {
//		System.out.println("Deleting all students");
//		int numRowsDeleted = studentDAO.deleteAll();
//		System.out.println("Deleted row count: " + numRowsDeleted);
//		
//	}


	//delete one
//	private void deleteStudent(StudentDAO studentDAO) {
//		int studentId = 5;
//		System.out.println("Deleting student id: " + studentId);
//		studentDAO.delete(studentId);
//		
//	}

	//update name
//	private void updateStudent(StudentDAO studentDAO) {
//		//retrieve student based in the id: primary key
//		int studentId = 1;
//		System.out.println("Getting student with id: " + studentId);
//		Student myStudent = studentDAO.findById(studentId);
//		
//		//change first name to "Shawn"
//		System.out.println("Updating student...");
//		myStudent.setFirstName("Shawn");
//		
//		//update the student
//		studentDAO.update(myStudent);
//		
//		//display the updated student
//		System.out.println("Updated student: " + myStudent); 
//		
//	}


	//read by specific name
//	private void queryForStudentsByLastName(StudentDAO studentDAO) {
//		//get a list of students
//		List<Student> theStudents = studentDAO.findByLastName("Duc"); 
//		
//		//display list of students
//		for (Student tempStudent : theStudents) {
//			System.out.println(tempStudent);
//		}
//		
//	}

	//read all
//	private void queryForStudents(StudentDAO studentDAO) {
//		//get a list of students
//		List<Student> theStudents = studentDAO.findAll();
//		
//		//display list of students
//		for (Student tempStudent  : theStudents) {
//			System.out.println(tempStudent);
//		}
//		
//		
//	}

	//read single data
//	private void readStudent(StudentDAO studentDAO) {
//		
//		//create a student object
//		System.out.println("Creating new student object...");
//		Student tempStudent = new Student("Daff", "Duc", "daff.duc@gmail.com");
//		
//		//save the student
//		System.out.println("Saving the student...");
//		studentDAO.save(tempStudent);
//		
//		//display id of the saved student
//		int theId = tempStudent.getId();
//		System.out.println("Saved student. Generate id: "+ theId);
//		
//		//retrieve student based on the id: primary key
//		System.out.println("Retrieving student with id: " + theId);
//		Student myStudent = studentDAO.findById(theId);
//		
//		//display student
//		System.out.println("Found the student: " + myStudent);
//		
//	}

	//multiple create
	private void createMultipleStudents(StudentDAO studentDAO) {
		
		// create the student object
		System.out.println("Creating 2 student object ...");
		Student tempStudent1 = new Student ( "Paulo", "chloe", "paulo.chloe@gmail.com");
		Student tempStudent2 = new Student ( "Pilo", "chlo", "pilo.chlo@gmail.com");
				
		// save the student object
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
				
				
		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent1.getId());
		System.out.println("Saved student. Generated id: " + tempStudent2.getId());		

		
	}

	//single create
//	private void createStudent(StudentDAO studentDAO) {
//		
//		// create the student object
//		System.out.println("Creating new student object ...");
//		Student tempStudent = new Student ( "Paul", "Doe", "paul.doe@gmail.com");
//		
//		// save the student object
//		System.out.println("Saving the student ...");
//		studentDAO.save(tempStudent);
//		
//		
//		// display id of the saved student
//		System.out.println("Saved student. Generated id: " + tempStudent.getId());
//				
//	}

}
