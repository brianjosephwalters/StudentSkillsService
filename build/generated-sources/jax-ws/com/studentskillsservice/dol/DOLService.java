
package com.studentskillsservice.dol;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DOLService", targetNamespace = "http://dol.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DOLService {


    /**
     * 
     * @param occupationID
     * @param skillID
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dropSkillFromOccupation", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.DropSkillFromOccupation")
    @ResponseWrapper(localName = "dropSkillFromOccupationResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.DropSkillFromOccupationResponse")
    @Action(input = "http://dol.com/DOLService/dropSkillFromOccupationRequest", output = "http://dol.com/DOLService/dropSkillFromOccupationResponse")
    public boolean dropSkillFromOccupation(
        @WebParam(name = "skillID", targetNamespace = "")
        Integer skillID,
        @WebParam(name = "occupationID", targetNamespace = "")
        Integer occupationID);

    /**
     * 
     * @param skillID
     * @return
     *     returns java.util.List<com.studentskillsservice.dol.Occupation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOccupationFromSkill", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetOccupationFromSkill")
    @ResponseWrapper(localName = "getOccupationFromSkillResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetOccupationFromSkillResponse")
    @Action(input = "http://dol.com/DOLService/getOccupationFromSkillRequest", output = "http://dol.com/DOLService/getOccupationFromSkillResponse")
    public List<Occupation> getOccupationFromSkill(
        @WebParam(name = "skillID", targetNamespace = "")
        Integer skillID);

    /**
     * 
     * @param skillType
     * @return
     *     returns java.util.List<com.studentskillsservice.dol.Skill>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSkillsByType", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetSkillsByType")
    @ResponseWrapper(localName = "getSkillsByTypeResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetSkillsByTypeResponse")
    @Action(input = "http://dol.com/DOLService/getSkillsByTypeRequest", output = "http://dol.com/DOLService/getSkillsByTypeResponse")
    public List<Skill> getSkillsByType(
        @WebParam(name = "skillType", targetNamespace = "")
        String skillType);

    /**
     * 
     * @param skillType
     * @return
     *     returns java.util.List<com.studentskillsservice.dol.Occupation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOccupationsByType", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetOccupationsByType")
    @ResponseWrapper(localName = "getOccupationsByTypeResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetOccupationsByTypeResponse")
    @Action(input = "http://dol.com/DOLService/getOccupationsByTypeRequest", output = "http://dol.com/DOLService/getOccupationsByTypeResponse")
    public List<Occupation> getOccupationsByType(
        @WebParam(name = "skillType", targetNamespace = "")
        String skillType);

    /**
     * 
     * @param occupationID
     * @param skillID
     */
    @WebMethod
    @RequestWrapper(localName = "addSkillToOccupation", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.AddSkillToOccupation")
    @ResponseWrapper(localName = "addSkillToOccupationResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.AddSkillToOccupationResponse")
    @Action(input = "http://dol.com/DOLService/addSkillToOccupationRequest", output = "http://dol.com/DOLService/addSkillToOccupationResponse")
    public void addSkillToOccupation(
        @WebParam(name = "occupationID", targetNamespace = "")
        Integer occupationID,
        @WebParam(name = "skillID", targetNamespace = "")
        Integer skillID);

    /**
     * 
     * @param occupationID
     * @return
     *     returns java.util.List<com.studentskillsservice.dol.Skill>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSkillsFromOccupation", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetSkillsFromOccupation")
    @ResponseWrapper(localName = "getSkillsFromOccupationResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetSkillsFromOccupationResponse")
    @Action(input = "http://dol.com/DOLService/getSkillsFromOccupationRequest", output = "http://dol.com/DOLService/getSkillsFromOccupationResponse")
    public List<Skill> getSkillsFromOccupation(
        @WebParam(name = "occupationID", targetNamespace = "")
        Integer occupationID);

    /**
     * 
     * @return
     *     returns java.util.List<com.studentskillsservice.dol.Skill>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSkills", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetAllSkills")
    @ResponseWrapper(localName = "getAllSkillsResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetAllSkillsResponse")
    @Action(input = "http://dol.com/DOLService/getAllSkillsRequest", output = "http://dol.com/DOLService/getAllSkillsResponse")
    public List<Skill> getAllSkills();

    /**
     * 
     * @return
     *     returns java.util.List<com.studentskillsservice.dol.Occupation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllOccupations", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetAllOccupations")
    @ResponseWrapper(localName = "getAllOccupationsResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetAllOccupationsResponse")
    @Action(input = "http://dol.com/DOLService/getAllOccupationsRequest", output = "http://dol.com/DOLService/getAllOccupationsResponse")
    public List<Occupation> getAllOccupations();

    /**
     * 
     * @param occupationID
     * @return
     *     returns com.studentskillsservice.dol.Occupation
     * @throws NonexistentOccupationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOccupation", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetOccupation")
    @ResponseWrapper(localName = "getOccupationResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetOccupationResponse")
    @Action(input = "http://dol.com/DOLService/getOccupationRequest", output = "http://dol.com/DOLService/getOccupationResponse", fault = {
        @FaultAction(className = NonexistentOccupationException_Exception.class, value = "http://dol.com/DOLService/getOccupation/Fault/NonexistentOccupationException")
    })
    public Occupation getOccupation(
        @WebParam(name = "occupationID", targetNamespace = "")
        String occupationID)
        throws NonexistentOccupationException_Exception
    ;

    /**
     * 
     * @param skillID
     * @return
     *     returns com.studentskillsservice.dol.Skill
     * @throws NonexistentSkillException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSkill", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetSkill")
    @ResponseWrapper(localName = "getSkillResponse", targetNamespace = "http://dol.com/", className = "com.studentskillsservice.dol.GetSkillResponse")
    @Action(input = "http://dol.com/DOLService/getSkillRequest", output = "http://dol.com/DOLService/getSkillResponse", fault = {
        @FaultAction(className = NonexistentSkillException_Exception.class, value = "http://dol.com/DOLService/getSkill/Fault/NonexistentSkillException")
    })
    public Skill getSkill(
        @WebParam(name = "skillID", targetNamespace = "")
        String skillID)
        throws NonexistentSkillException_Exception
    ;

}