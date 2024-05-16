package com.amud.io.aemudapi.buiders;

import com.amud.io.aemudapi.entities.Club;
import com.amud.io.aemudapi.entities.Commission;
import com.amud.io.aemudapi.entities.Member;

import java.util.List;

public class MemberBuilder {

    private Member member = new Member();

    public MemberBuilder setId(Long id) {
        member.setId(id);
        return this;
    }

    public MemberBuilder setName(String name) {
        member.setName(name);
        return this;
    }

    public MemberBuilder setFirstname(String firstname) {
        member.setFirstname(firstname);
        return this;
    }

    public MemberBuilder setNationality(String nationality) {
        member.setNationality(nationality);
        return this;
    }

    public MemberBuilder setBirthday(String birthday) {
        member.setBirthday(birthday);
        return this;
    }

    public MemberBuilder setMaritalStatus(String maritalStatus) {
        member.setMaritalStatus(maritalStatus);
        return this;
    }

    public MemberBuilder setAddressInDakar(String addressInDakar) {
        member.setAddressInDakar(addressInDakar);
        return this;
    }

    public MemberBuilder setHolidayAddress(String holidayAddress) {
        member.setHolidayAddress(holidayAddress);
        return this;
    }

    public MemberBuilder setNumberPhone(String numberPhone) {
        member.setNumberPhone(numberPhone);
        return this;
    }

    public MemberBuilder setEmail(String email) {
        member.setEmail(email);
        return this;
    }

    public MemberBuilder setPersonToCall(String personToCall) {
        member.setPersonToCall(personToCall);
        return this;
    }

    public MemberBuilder setFaculty(String faculty) {
        member.setFaculty(faculty);
        return this;
    }

    public MemberBuilder setDepartment(String department) {
        member.setDepartment(department);
        return this;
    }

    public MemberBuilder setBourse(String bourse) {
        member.setBourse(bourse);
        return this;
    }

    public MemberBuilder setParticipatedActivity(String participatedActivity) {
        member.setParticipatedActivity(participatedActivity);
        return this;
    }

    public MemberBuilder setAddressToCampus(String addressToCampus) {
        member.setAddressToCampus(addressToCampus);
        return this;
    }

    public MemberBuilder setAemudCourses(String aemudCourses) {
        member.setAemudCourses(aemudCourses);
        return this;
    }

    public MemberBuilder setOtherCourses(String otherCourses) {
        member.setOtherCourses(otherCourses);
        return this;
    }


    public MemberBuilder setPoliticOrganisation(String politicOrganisation) {
        member.setPoliticOrganisation(politicOrganisation);
        return this;
    }

    public MemberBuilder setYearOfMembership(String yearOfMembership) {
        member.setYearOfMembership(yearOfMembership);
        return this;
    }

    public MemberBuilder setTwinsName(String twinsName) {
        member.setTwinsName(twinsName);
        return this;
    }

    public MemberBuilder setPay(boolean pay) {
        member.setPay(pay);
        return this;
    }

    public MemberBuilder setCommission(Commission commission) {
        member.setCommission(commission);
        return this;
    }

    public MemberBuilder setClubs(List<Club> clubs) {
        member.setClubs(clubs);
        return this;
    }

    public Member build() {
        return member;
    }
}
