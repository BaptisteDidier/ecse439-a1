package org.xtext.example.cps.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.cps.cps.Course;
import org.xtext.example.cps.cps.Student;
import org.xtext.example.cps.cps.CpsPackage;
import org.xtext.example.cps.cps.Program;

public class CpsValidator extends AbstractCpsValidator {
	
	private static final int MIN_COURSE_YEAR = 1;
	private static final int MAX_COURSE_YEAR = 5;
	
	private static final int MIN_COURSE_CREDITS = 0;
	private static final int MAX_COURSE_CREDITS = 4;
	
	private static final int MIN_TERM_CREDITS = 0;
	private static final int MAX_TERM_CREDITS = 22;
	
	@Check
	public void checkCourseYear(Course course) {
	    if (course.getYear() < MIN_COURSE_YEAR || course.getYear() > MAX_COURSE_YEAR) {
	        error("Year must be between 1 and 5", CpsPackage.Literals.COURSE__YEAR);
	    }
	}
	
	@Check
	public void checkCourseCredits(Course course) {
	    if (course.getCredits() < MIN_COURSE_CREDITS || course.getCredits() > MAX_COURSE_CREDITS) {
	        error("Credits must be between 0 and 4", CpsPackage.Literals.COURSE__CREDITS);
	    }
	}
	
	@Check
	public void checkStudentMaxCredits(Student student) {
	    if (student.getMaxCredits() < MIN_TERM_CREDITS || student.getMaxCredits() > MAX_TERM_CREDITS) {
	        error("Maximum credits per term must be between 0 and 22", CpsPackage.Literals.STUDENT__MAX_CREDITS);
	    }
	}
	
	@Check
	public void checkCourseFormat(Course course) {
	    if (!course.getCode().matches("[A-Z]{4}[0-9]{3}")) {
	        error("Course code must have 4 uppercase letters followed by 3 digits", CpsPackage.Literals.COURSE__CODE);
	    }
	}
	
	@Check
	public void checkCourseUnique(Course course) {
	    Program program = (Program) course.eContainer();
	    for (Course other : program.getCourses()) {
	        if (other != course) {
	            if (other.getCode().equals(course.getCode())) {
	                error("Course code must be unique", CpsPackage.Literals.COURSE__CODE);
	            }
	        }
	    }
	}
}
