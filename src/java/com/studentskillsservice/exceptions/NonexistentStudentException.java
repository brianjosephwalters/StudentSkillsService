package com.studentskillsservice.exceptions;

/**
 *
 * @author bjw
 */
public class NonexistentStudentException extends Exception {
    private String SSNumber;
    
    public NonexistentStudentException(String SSNumber) {
        this.SSNumber = SSNumber;
    }
    
    public String getSSNumber() {
        return this.SSNumber;
    }
    
    @Override
    public String getMessage() {
        return "Student does not exist: " + this.SSNumber;
    }
    
}
