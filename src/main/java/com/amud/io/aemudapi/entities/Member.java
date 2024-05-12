package com.amud.io.aemudapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String areYouMemberOfPoliticOrganisation;
    private String politicOrganisation;
    private String yearOfMembership;
    private String twinsName;
    private String pay;
    @OneToOne
    private Commission commission;
    @ManyToMany()
    private List<Club> clubs;

    public Member() {
    }

    public Member(Long id, String name, String firstname, String nationality, String birthday, String maritalStatus, String addressInDakar, String holidayAddress, String numberPhone, String email, String personToCall, String faculty, String department, String bourse, String participatedActivity, String addressToCampus, String aemudCourses, String otherCourses, String areYouMemberOfPoliticOrganisation, String politicOrganisation, String yearOfMembership, String twinsName, String pay, Commission commission, List<Club> clubs) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.nationality = nationality;
        this.birthday = birthday;
        this.maritalStatus = maritalStatus;
        this.addressInDakar = addressInDakar;
        this.holidayAddress = holidayAddress;
        this.numberPhone = numberPhone;
        this.email = email;
        this.personToCall = personToCall;
        this.faculty = faculty;
        this.department = department;
        this.bourse = bourse;
        this.participatedActivity = participatedActivity;
        this.addressToCampus = addressToCampus;
        this.aemudCourses = aemudCourses;
        this.otherCourses = otherCourses;
        this.areYouMemberOfPoliticOrganisation = areYouMemberOfPoliticOrganisation;
        this.politicOrganisation = politicOrganisation;
        this.yearOfMembership = yearOfMembership;
        this.twinsName = twinsName;
        this.pay = pay;
        this.commission = commission;
        this.clubs = clubs;
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

    public String getAreYouMemberOfPoliticOrganisation() {
        return areYouMemberOfPoliticOrganisation;
    }

    public void setAreYouMemberOfPoliticOrganisation(String areYouMemberOfPoliticOrganisation) {
        this.areYouMemberOfPoliticOrganisation = areYouMemberOfPoliticOrganisation;
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

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
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

    public void setClubs(List<Club> club) {
        this.clubs = club;
    }
}
