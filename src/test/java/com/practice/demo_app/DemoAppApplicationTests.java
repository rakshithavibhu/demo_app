package com.practice.demo_app;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.practice.demo_app.Models.Student;
import com.practice.demo_app.Models.Teacher;
import com.practice.demo_app.Repository.MyRepo;
import com.practice.demo_app.Repository.TeacherRepo;
import com.practice.demo_app.Service.StudentService;
import com.practice.demo_app.Service.TeacherService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class DemoAppApplicationTests {
	@MockBean
	MyRepo myRepo;
	@MockBean
	TeacherRepo myRep;
	@Autowired
	StudentService studentService;

	@Autowired
	TeacherService teacherService;
	@Test
	public void saveStudentTest(){
		Student student=new Student(123,"abc","pract");
		when(myRepo.save(student)).thenReturn(student);
		assertEquals(student,studentService.saveStudent(student));
	}
	@Test
	public void getStudentByIdTest(){
		Student student=new Student(12,"abc","pract");
		when(myRepo.findById(12)).thenReturn(Optional.of(student));
		assertEquals(Optional.of(student),studentService.getStudentById(12));
	}
	@Test
	public void updateStudentTest(){
		Student student=new Student(345,"bob","theory");
		Student updated=new Student(345,"bobby","pract");
		when(myRepo.findById(Mockito.anyInt())).thenReturn(Optional.of(student));
		when(myRepo.save(Mockito.any())).thenReturn(updated);
		assertEquals(updated,studentService.updateStudent(updated));
	}
	@Test
	public void getAllStudentTest(){
		Student student1=new Student(45,"bob","theory");
		Student student2=new Student(35,"bobby","pract");
		when(myRepo.findAll()).thenReturn(Stream.of(student1,student2).collect(Collectors.toList()));
		assertEquals(2,studentService.getAllStudent().size());
	}

	@Test
	public void saveTeacherTest(){
		Teacher teacher =  new Teacher(12,"Eric","theory");
		when(myRep.save(teacher)).thenReturn(teacher);
		assertEquals(teacher,teacherService.saveTeacher(teacher));
	}
	@Test
	public void getTeacherByIdTest() {
		Teacher teacher = new Teacher(1, "Ross", "theory");
		when(myRep.findById(1)).thenReturn(Optional.of(teacher));
		assertEquals(Optional.of(teacher),teacherService.getTeacherById(1));
	}
	@Test
	public void updateTeacherTest(){
		Teacher teacher= new Teacher(2,"Joey","theory");
		Teacher updated= new Teacher(2,"Joey","pract");
		when(myRep.findById(Mockito.anyInt())).thenReturn(Optional.of(teacher));
		when(myRep.save(Mockito.any())).thenReturn(updated);
		assertEquals(updated,teacherService.updateTeacher(teacher));
	}
	@Test
	public void getAllTeacherTest() {
		Teacher teacher = new Teacher(67, "xyz", "theory");
		Teacher teacher1 = new Teacher(28, "qwe", "pract");
		when(myRep.findAll()).thenReturn(Stream.of(teacher, teacher1).collect(Collectors.toList()));
		assertEquals(2, teacherService.getAllTeacher().size());

	}
}

