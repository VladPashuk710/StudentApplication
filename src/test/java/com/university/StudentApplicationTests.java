package com.university;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes = {StudentApplication.class})

class StudentApplicationTests {

	@Autowired

	University student;

	@Test

	private void assertEquals() {
		student.getClass();
		student.hashCode();
		student.toString();
	}

}
