/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.studentskillsservice.queries;

import com.studentskillsservice.dol.Skill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bjw
 */
public class SkillQueries {
    private Connection connection;
    
    public SkillQueries(Connection connection) {
        this.connection = connection;
    }
    
    public List<String> getStudentSkillCodes(String SSNumber) 
            throws SQLException {
        List<String> list = new ArrayList<String>();
        PreparedStatement stmt = connection.prepareStatement(
            " SELECT skill_code " +
            " FROM course_skill NATURAL JOIN course " +
            " NATURAL JOIN section NATURAL JOIN attended " +
            " WHERE ss_number = ?"
        );
        stmt.setString(1, SSNumber);
        ResultSet results = stmt.executeQuery();
        // Walk through the results...
        while (results.next()) {
            // Create a new Course from the results
            // and add it to the list.
            list.add(results.getString("skill_code"));
        }
        return list;
    }
}
