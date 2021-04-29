package com.deploy.DEPLOY.Kodlamaio;

import com.deploy.DEPLOY.DeployApplication;
import org.springframework.boot.SpringApplication;

public class Main {

    public static void main(String[] args) {

      Instructor instructor = new Instructor();
      instructor.userName = "Engin Demirog";
      Student student = new Student();
      student.userName  = "Davud Mamedovi";
      StudentManager studentManager = new StudentManager();
      InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        studentManager.add(student);


    }

}


