//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.02 at 03:15:48 PM IST 
//


package com.cognizant.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}select_stmt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "selectStmt"
})
@XmlRootElement(name = "sql_stmt")
public class SqlStmt {

    @XmlElement(name = "select_stmt", required = true)
    protected SelectStmt selectStmt;

    /**
     * Gets the value of the selectStmt property.
     * 
     * @return
     *     possible object is
     *     {@link SelectStmt }
     *     
     */
    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    /**
     * Sets the value of the selectStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectStmt }
     *     
     */
    public void setSelectStmt(SelectStmt value) {
        this.selectStmt = value;
    }

}
