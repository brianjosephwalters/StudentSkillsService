/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.studentskillsservice.business;

import com.studentskillsservice.db.StudentSkillsDB;
import com.studentskillsservice.dol.NonexistentSkillException_Exception;
import com.studentskillsservice.dol.Skill;
import com.studentskillsservice.queries.SkillQueries;
import com.studentskillsservice.exceptions.NonexistentStudentException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjw
 */
public class StudentSkillsServiceImpl {
    
    public List<Skill> getStudentSkills(String SSNumber) 
            throws NonexistentStudentException {
        List<Skill> skills = new ArrayList<Skill>();
        SkillQueries queries = new SkillQueries(StudentSkillsDB.dbConnection());
        
        List<String> skillCodes = null;
        try {
            skillCodes = queries.getStudentSkillCodes(SSNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (skillCodes == null) {
            throw new NonexistentStudentException(SSNumber);
        } 
        
        for (String code : skillCodes) {
            try {
                Skill skill = getSkill(code);
                skills.add(skill);
            } catch (NonexistentSkillException_Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return skills;
    }

    private static Skill getSkill(java.lang.String skillID) throws NonexistentSkillException_Exception {
        com.studentskillsservice.dol.DOLService_Service service = new com.studentskillsservice.dol.DOLService_Service();
        com.studentskillsservice.dol.DOLService port = service.getDOLServicePort();
        return port.getSkill(skillID);
    }
    
}
