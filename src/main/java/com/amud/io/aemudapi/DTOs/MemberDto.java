package com.amud.io.aemudapi.DTOs;

import com.amud.io.aemudapi.entities.Club;
import com.amud.io.aemudapi.entities.Commission;

import java.util.List;

public class MemberDto {
    private Long id;
    private String name;
    private String firstname;
    private String nationality;
    private String birthday;
    private String maritalStatus;
    private String addressInDakar;
    private String holidayAddress;
    private String numberPhone;
    private String email;
    private String personToCall;
    private String faculty;
    private String department;
    private String bourse;
    private String participatedActivity;
    private String addressToCampus;
    private String aemudCourses;
    private String otherCourses;
    private String politicOrganisation;
    private String yearOfMembership;
    private String twinsName;
    private boolean pay;
    private Commission commission;
    private List<Club> clubs;

    public MemberDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddressInDakar() {
        return addressInDakar;
    }

    public void setAddressInDakar(String addressInDakar) {
        this.addressInDakar = addressInDakar;
    }

    public String getHolidayAddress() {
        return holidayAddress;
    }

    public void setHolidayAddress(String holidayAddress) {
        this.holidayAddress = holidayAddress;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonToCall() {
        return personToCall;
    }

    public void setPersonToCall(String personToCall) {
        this.personToCall = personToCall;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBourse() {
        return bourse;
    }

    public void setBourse(String bourse) {
        this.bourse = bourse;
    }

    public String getParticipatedActivity() {
        return participatedActivity;
    }

    public void setParticipatedActivity(String participatedActivity) {
        this.participatedActivity = participatedActivity;
    }

    public String getAddressToCampus() {
        return addressToCampus;
    }

    public void setAddressToCampus(String addressToCampus) {
        this.addressToCampus = addressToCampus;
    }

    public String getAemudCourses() {
        return aemudCourses;
    }

    public void setAemudCourses(String aemudCourses) {
        this.aemudCourses = aemudCourses;
    }

    public String getOtherCourses() {
        return otherCourses;
    }

    public void setOtherCourses(String otherCourses) {
        this.otherCourses = otherCourses;
    }

    public String getPoliticOrganisation() {
        return politicOrganisation;
    }

    public void setPoliticOrganisation(String politicOrganisation) {
        this.politicOrganisation = politicOrganisation;
    }

    public String getYearOfMembership() {
        return yearOfMembership;
    }

    public void setYearOfMembership(String yearOfMembership) {
        this.yearOfMembership = yearOfMembership;
    }

    public String getTwinsName() {
        return twinsName;
    }

    public void setTwinsName(String twinsName) {
        this.twinsName = twinsName;
    }

    public boolean getPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }
}
