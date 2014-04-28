/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.studentskillsservice;

import com.studentskillsservice.business.StudentSkillsServiceImpl;
import com.studentskillsservice.dol.Skill;
import com.studentskillsservice.exceptions.NonexistentStudentException;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author bjw
 */
@WebService(serviceName = "StudentSkillsService")
public class StudentSkillsService {
    StudentSkillsServiceImpl impl;
    
    public StudentSkillsService() {
        this.impl = new StudentSkillsServiceImpl();
    }
    
    @WebMethod(operationName = "getStudentSkills")
    public List<Skill> getStudentSkills(
            @WebParam(name = "SSNumber") String SSNumber) 
            throws NonexistentStudentException {
        return impl.getStudentSkills(SSNumber);
    }
}
