
package com.studentskillsservice.dol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOccupationsByType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOccupationsByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOccupationsByType", propOrder = {
    "skillType"
})
public class GetOccupationsByType {

    protected String skillType;

    /**
     * Gets the value of the skillType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillType() {
        return skillType;
    }

    /**
     * Sets the value of the skillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillType(String value) {
        this.skillType = value;
    }

}
