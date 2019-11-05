/**
 * Copyright 2005-2019 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.test.ext.odata.deepexpand.model;

import java.util.Date;
import java.util.List;

import org.restlet.test.ext.odata.deepexpand.model.Address;
import org.restlet.test.ext.odata.deepexpand.model.CoOp;
import org.restlet.test.ext.odata.deepexpand.model.Department;
import org.restlet.test.ext.odata.deepexpand.model.Language;
import org.restlet.test.ext.odata.deepexpand.model.Location;
import org.restlet.test.ext.odata.deepexpand.model.Nationality;
import org.restlet.test.ext.odata.deepexpand.model.Registration;
import org.restlet.test.ext.odata.deepexpand.model.Report;
import org.restlet.test.ext.odata.deepexpand.model.Role;
import org.restlet.test.ext.odata.deepexpand.model.Telephone;

/**
 * Generated by the generator tool for the OData extension for the Restlet
 * framework.<br>
 * 
 * @see <a
 *      href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata
 *      of the target OData service</a>
 * 
 */
public class Student {

    private Date admissionDate;

    private String ama;

    private Date dateOfBirth;

    private String email;

    private boolean ethnicMinority;

    private String fatherName;

    private String gender;

    private boolean hasOtherDegree;

    private boolean hasSpecialNeeds;

    private String iban;

    private int id;

    private Date idIssueDate;

    private String idIssuer;

    private String idNumber;

    private String idType;

    private boolean immigrant;

    private String motherName;

    private String name;

    private String notes;

    private boolean publicClerk;

    private boolean religiousMinority;

    private String serialNumber;

    private String socialSecurityId;

    private String surname;

    private String taxDepartment;

    private String taxDivision;

    private String taxId;

    private String userName;

    private String workExperience;

    private Tracking tracking;

    private Registration activeRegistration;

    private List<Address> addresses;

    private CoOp defaultCoOp;

    private Department department;

    private Location issuerLocation;

    private Nationality nationality;

    private Language preferredLanguage;

    private List<Registration> registrations;

    private List<Report> reports;

    private List<Role> roles;

    private List<Telephone> telephones;

    /**
     * Constructor without parameter.
     * 
     */
    public Student() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Student(int id) {
        this();
        this.id = id;
    }

    /**
     * Returns the value of the "admissionDate" attribute.
     * 
     * @return The value of the "admissionDate" attribute.
     */
    public Date getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Returns the value of the "ama" attribute.
     * 
     * @return The value of the "ama" attribute.
     */
    public String getAma() {
        return ama;
    }

    /**
     * Returns the value of the "dateOfBirth" attribute.
     * 
     * @return The value of the "dateOfBirth" attribute.
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Returns the value of the "email" attribute.
     * 
     * @return The value of the "email" attribute.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the value of the "ethnicMinority" attribute.
     * 
     * @return The value of the "ethnicMinority" attribute.
     */
    public boolean getEthnicMinority() {
        return ethnicMinority;
    }

    /**
     * Returns the value of the "fatherName" attribute.
     * 
     * @return The value of the "fatherName" attribute.
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Returns the value of the "gender" attribute.
     * 
     * @return The value of the "gender" attribute.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Returns the value of the "hasOtherDegree" attribute.
     * 
     * @return The value of the "hasOtherDegree" attribute.
     */
    public boolean getHasOtherDegree() {
        return hasOtherDegree;
    }

    /**
     * Returns the value of the "hasSpecialNeeds" attribute.
     * 
     * @return The value of the "hasSpecialNeeds" attribute.
     */
    public boolean getHasSpecialNeeds() {
        return hasSpecialNeeds;
    }

    /**
     * Returns the value of the "iban" attribute.
     * 
     * @return The value of the "iban" attribute.
     */
    public String getIban() {
        return iban;
    }

    /**
     * Returns the value of the "id" attribute.
     * 
     * @return The value of the "id" attribute.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the value of the "idIssueDate" attribute.
     * 
     * @return The value of the "idIssueDate" attribute.
     */
    public Date getIdIssueDate() {
        return idIssueDate;
    }

    /**
     * Returns the value of the "idIssuer" attribute.
     * 
     * @return The value of the "idIssuer" attribute.
     */
    public String getIdIssuer() {
        return idIssuer;
    }

    /**
     * Returns the value of the "idNumber" attribute.
     * 
     * @return The value of the "idNumber" attribute.
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Returns the value of the "idType" attribute.
     * 
     * @return The value of the "idType" attribute.
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Returns the value of the "immigrant" attribute.
     * 
     * @return The value of the "immigrant" attribute.
     */
    public boolean getImmigrant() {
        return immigrant;
    }

    /**
     * Returns the value of the "motherName" attribute.
     * 
     * @return The value of the "motherName" attribute.
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Returns the value of the "name" attribute.
     * 
     * @return The value of the "name" attribute.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the value of the "notes" attribute.
     * 
     * @return The value of the "notes" attribute.
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Returns the value of the "publicClerk" attribute.
     * 
     * @return The value of the "publicClerk" attribute.
     */
    public boolean getPublicClerk() {
        return publicClerk;
    }

    /**
     * Returns the value of the "religiousMinority" attribute.
     * 
     * @return The value of the "religiousMinority" attribute.
     */
    public boolean getReligiousMinority() {
        return religiousMinority;
    }

    /**
     * Returns the value of the "serialNumber" attribute.
     * 
     * @return The value of the "serialNumber" attribute.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Returns the value of the "socialSecurityId" attribute.
     * 
     * @return The value of the "socialSecurityId" attribute.
     */
    public String getSocialSecurityId() {
        return socialSecurityId;
    }

    /**
     * Returns the value of the "surname" attribute.
     * 
     * @return The value of the "surname" attribute.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Returns the value of the "taxDepartment" attribute.
     * 
     * @return The value of the "taxDepartment" attribute.
     */
    public String getTaxDepartment() {
        return taxDepartment;
    }

    /**
     * Returns the value of the "taxDivision" attribute.
     * 
     * @return The value of the "taxDivision" attribute.
     */
    public String getTaxDivision() {
        return taxDivision;
    }

    /**
     * Returns the value of the "taxId" attribute.
     * 
     * @return The value of the "taxId" attribute.
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Returns the value of the "userName" attribute.
     * 
     * @return The value of the "userName" attribute.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Returns the value of the "workExperience" attribute.
     * 
     * @return The value of the "workExperience" attribute.
     */
    public String getWorkExperience() {
        return workExperience;
    }

    /**
     * Returns the value of the "tracking" attribute.
     * 
     * @return The value of the "tracking" attribute.
     */
    public Tracking getTracking() {
        return tracking;
    }

    /**
     * Returns the value of the "activeRegistration" attribute.
     * 
     * @return The value of the "activeRegistration" attribute.
     */
    public Registration getActiveRegistration() {
        return activeRegistration;
    }

    /**
     * Returns the value of the "addresses" attribute.
     * 
     * @return The value of the "addresses" attribute.
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Returns the value of the "defaultCoOp" attribute.
     * 
     * @return The value of the "defaultCoOp" attribute.
     */
    public CoOp getDefaultCoOp() {
        return defaultCoOp;
    }

    /**
     * Returns the value of the "department" attribute.
     * 
     * @return The value of the "department" attribute.
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Returns the value of the "issuerLocation" attribute.
     * 
     * @return The value of the "issuerLocation" attribute.
     */
    public Location getIssuerLocation() {
        return issuerLocation;
    }

    /**
     * Returns the value of the "nationality" attribute.
     * 
     * @return The value of the "nationality" attribute.
     */
    public Nationality getNationality() {
        return nationality;
    }

    /**
     * Returns the value of the "preferredLanguage" attribute.
     * 
     * @return The value of the "preferredLanguage" attribute.
     */
    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Returns the value of the "registrations" attribute.
     * 
     * @return The value of the "registrations" attribute.
     */
    public List<Registration> getRegistrations() {
        return registrations;
    }

    /**
     * Returns the value of the "reports" attribute.
     * 
     * @return The value of the "reports" attribute.
     */
    public List<Report> getReports() {
        return reports;
    }

    /**
     * Returns the value of the "roles" attribute.
     * 
     * @return The value of the "roles" attribute.
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Returns the value of the "telephones" attribute.
     * 
     * @return The value of the "telephones" attribute.
     */
    public List<Telephone> getTelephones() {
        return telephones;
    }

    /**
     * Sets the value of the "admissionDate" attribute.
     * 
     * @param admissionDate
     *            The value of the "admissionDate" attribute.
     */
    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * Sets the value of the "ama" attribute.
     * 
     * @param ama
     *            The value of the "ama" attribute.
     */
    public void setAma(String ama) {
        this.ama = ama;
    }

    /**
     * Sets the value of the "dateOfBirth" attribute.
     * 
     * @param dateOfBirth
     *            The value of the "dateOfBirth" attribute.
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Sets the value of the "email" attribute.
     * 
     * @param email
     *            The value of the "email" attribute.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the value of the "ethnicMinority" attribute.
     * 
     * @param ethnicMinority
     *            The value of the "ethnicMinority" attribute.
     */
    public void setEthnicMinority(boolean ethnicMinority) {
        this.ethnicMinority = ethnicMinority;
    }

    /**
     * Sets the value of the "fatherName" attribute.
     * 
     * @param fatherName
     *            The value of the "fatherName" attribute.
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    /**
     * Sets the value of the "gender" attribute.
     * 
     * @param gender
     *            The value of the "gender" attribute.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Sets the value of the "hasOtherDegree" attribute.
     * 
     * @param hasOtherDegree
     *            The value of the "hasOtherDegree" attribute.
     */
    public void setHasOtherDegree(boolean hasOtherDegree) {
        this.hasOtherDegree = hasOtherDegree;
    }

    /**
     * Sets the value of the "hasSpecialNeeds" attribute.
     * 
     * @param hasSpecialNeeds
     *            The value of the "hasSpecialNeeds" attribute.
     */
    public void setHasSpecialNeeds(boolean hasSpecialNeeds) {
        this.hasSpecialNeeds = hasSpecialNeeds;
    }

    /**
     * Sets the value of the "iban" attribute.
     * 
     * @param iban
     *            The value of the "iban" attribute.
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Sets the value of the "id" attribute.
     * 
     * @param id
     *            The value of the "id" attribute.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the value of the "idIssueDate" attribute.
     * 
     * @param idIssueDate
     *            The value of the "idIssueDate" attribute.
     */
    public void setIdIssueDate(Date idIssueDate) {
        this.idIssueDate = idIssueDate;
    }

    /**
     * Sets the value of the "idIssuer" attribute.
     * 
     * @param idIssuer
     *            The value of the "idIssuer" attribute.
     */
    public void setIdIssuer(String idIssuer) {
        this.idIssuer = idIssuer;
    }

    /**
     * Sets the value of the "idNumber" attribute.
     * 
     * @param idNumber
     *            The value of the "idNumber" attribute.
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Sets the value of the "idType" attribute.
     * 
     * @param idType
     *            The value of the "idType" attribute.
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Sets the value of the "immigrant" attribute.
     * 
     * @param immigrant
     *            The value of the "immigrant" attribute.
     */
    public void setImmigrant(boolean immigrant) {
        this.immigrant = immigrant;
    }

    /**
     * Sets the value of the "motherName" attribute.
     * 
     * @param motherName
     *            The value of the "motherName" attribute.
     */
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    /**
     * Sets the value of the "name" attribute.
     * 
     * @param name
     *            The value of the "name" attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the value of the "notes" attribute.
     * 
     * @param notes
     *            The value of the "notes" attribute.
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Sets the value of the "publicClerk" attribute.
     * 
     * @param publicClerk
     *            The value of the "publicClerk" attribute.
     */
    public void setPublicClerk(boolean publicClerk) {
        this.publicClerk = publicClerk;
    }

    /**
     * Sets the value of the "religiousMinority" attribute.
     * 
     * @param religiousMinority
     *            The value of the "religiousMinority" attribute.
     */
    public void setReligiousMinority(boolean religiousMinority) {
        this.religiousMinority = religiousMinority;
    }

    /**
     * Sets the value of the "serialNumber" attribute.
     * 
     * @param serialNumber
     *            The value of the "serialNumber" attribute.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Sets the value of the "socialSecurityId" attribute.
     * 
     * @param socialSecurityId
     *            The value of the "socialSecurityId" attribute.
     */
    public void setSocialSecurityId(String socialSecurityId) {
        this.socialSecurityId = socialSecurityId;
    }

    /**
     * Sets the value of the "surname" attribute.
     * 
     * @param surname
     *            The value of the "surname" attribute.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Sets the value of the "taxDepartment" attribute.
     * 
     * @param taxDepartment
     *            The value of the "taxDepartment" attribute.
     */
    public void setTaxDepartment(String taxDepartment) {
        this.taxDepartment = taxDepartment;
    }

    /**
     * Sets the value of the "taxDivision" attribute.
     * 
     * @param taxDivision
     *            The value of the "taxDivision" attribute.
     */
    public void setTaxDivision(String taxDivision) {
        this.taxDivision = taxDivision;
    }

    /**
     * Sets the value of the "taxId" attribute.
     * 
     * @param taxId
     *            The value of the "taxId" attribute.
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Sets the value of the "userName" attribute.
     * 
     * @param userName
     *            The value of the "userName" attribute.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Sets the value of the "workExperience" attribute.
     * 
     * @param workExperience
     *            The value of the "workExperience" attribute.
     */
    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    /**
     * Sets the value of the "tracking" attribute.
     * 
     * @param tracking
     *            The value of the "tracking" attribute.
     */
    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }

    /**
     * Sets the value of the "activeRegistration" attribute.
     * 
     * @param activeRegistration
     *            " The value of the "activeRegistration" attribute.
     */
    public void setActiveRegistration(Registration activeRegistration) {
        this.activeRegistration = activeRegistration;
    }

    /**
     * Sets the value of the "addresses" attribute.
     * 
     * @param addresses
     *            " The value of the "addresses" attribute.
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /**
     * Sets the value of the "defaultCoOp" attribute.
     * 
     * @param defaultCoOp
     *            " The value of the "defaultCoOp" attribute.
     */
    public void setDefaultCoOp(CoOp defaultCoOp) {
        this.defaultCoOp = defaultCoOp;
    }

    /**
     * Sets the value of the "department" attribute.
     * 
     * @param department
     *            " The value of the "department" attribute.
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Sets the value of the "issuerLocation" attribute.
     * 
     * @param issuerLocation
     *            " The value of the "issuerLocation" attribute.
     */
    public void setIssuerLocation(Location issuerLocation) {
        this.issuerLocation = issuerLocation;
    }

    /**
     * Sets the value of the "nationality" attribute.
     * 
     * @param nationality
     *            " The value of the "nationality" attribute.
     */
    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    /**
     * Sets the value of the "preferredLanguage" attribute.
     * 
     * @param preferredLanguage
     *            " The value of the "preferredLanguage" attribute.
     */
    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    /**
     * Sets the value of the "registrations" attribute.
     * 
     * @param registrations
     *            " The value of the "registrations" attribute.
     */
    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }

    /**
     * Sets the value of the "reports" attribute.
     * 
     * @param reports
     *            " The value of the "reports" attribute.
     */
    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    /**
     * Sets the value of the "roles" attribute.
     * 
     * @param roles
     *            " The value of the "roles" attribute.
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /**
     * Sets the value of the "telephones" attribute.
     * 
     * @param telephones
     *            " The value of the "telephones" attribute.
     */
    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

}