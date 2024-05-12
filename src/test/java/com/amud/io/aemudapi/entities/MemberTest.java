package com.amud.io.aemudapi.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {
    private Commission commission;
    private List<Club> clubs;

    @BeforeEach
    void setUp() {
        commission = new Commission(1L, "Commission");
        clubs = new ArrayList<>();
        clubs.add(new Club(1L, "Club Informatique"));
        clubs.add(new Club(1L, "Club Maths"));
    }

    @Test
    void testConstructorsWithAllArgs() {

        Member member = new Member(1L, "Boubacar", "Diallo", "SN", "10/03/2000", "Single", "Malika", "Dakar", "7777777777", "cidi@gmail.com", "Tanou", "FSR", "Math-Info", "bourse_entier", "Set Setal", "Pavillons H", "Arabe", "", "no", "no", "2019", "Loum", "no", commission, clubs);
       //then
        assertThat(member.getName()).isEqualTo("Boubacar");
        assertThat(member.getEmail()).isEqualTo("cidi@gmail.com");
        assertThat(member.getFirstname()).isEqualTo("Diallo");
        assertThat(member.getNationality()).isEqualTo("SN");
        assertThat(member.getBirthday()).isEqualTo("10/03/2000");
        assertThat(member.getMaritalStatus()).isEqualTo("Single");
        assertThat(member.getAddressInDakar()).isEqualTo("Malika");
        assertThat(member.getHolidayAddress()).isEqualTo("Dakar");
        assertThat(member.getNumberPhone()).isEqualTo("7777777777");
        assertThat(member.getPersonToCall()).isEqualTo("Tanou");
        assertThat(member.getFaculty()).isEqualTo("FSR");
        assertThat(member.getDepartment()).isEqualTo("Math-Info");
        assertThat(member.getClubs()).isEqualTo(clubs);
        assertThat(member.getCommission()).isEqualTo(commission);
        assertThat(member.getBourse()).isEqualTo("bourse_entier");
        assertThat(member.getParticipatedActivity()).isEqualTo("Set Setal");
        assertThat(member.getAddressToCampus()).isEqualTo("Pavillons H");
        assertThat(member.getAemudCourses()).isEqualTo("Arabe");
        assertThat(member.getOtherCourses()).isEqualTo("");
        assertThat(member.getAreYouMemberOfPoliticOrganisation()).isEqualTo("no");
        assertThat(member.getYearOfMembership()).isEqualTo("2019");
        assertThat(member.getTwinsName()).isEqualTo("Loum");
        assertThat(member.getPay()).isEqualTo("no");
        assertThat(member.getPay()).isEqualTo("no");
    }
    @Test
    void testSetters(){
        Member member = new Member();
        member.setId(1L);
        member.setName("Diallo");
        member.setEmail("boubacar@gmail.com");
        member.setFirstname("Boubacar");
        member.setNationality("SN");
        member.setBirthday("10/03/2000");
        member.setMaritalStatus("Single");
        member.setAddressInDakar("Malika");
        member.setHolidayAddress("Dakar");
        member.setNumberPhone("7777777777");
        member.setPersonToCall("Tanou");
        member.setFaculty("FSR");
        member.setDepartment("Math-Info");
        member.setClubs(clubs);
        member.setCommission(commission);
        member.setBourse("bourse_entier");
        member.setParticipatedActivity("Set Setal");
        member.setAddressToCampus("Pavillons H");
        member.setAemudCourses("Arabe");
        member.setOtherCourses("No");
        member.setAreYouMemberOfPoliticOrganisation("no");
        member.setYearOfMembership("2019");
        member.setTwinsName("Loum");
        member.setPay("no");
        //then
        assertThat(member.getId()).isEqualTo(1L);
        assertThat(member.getName()).isEqualTo("Diallo");
        assertThat(member.getEmail()).isEqualTo("boubacar@gmail.com");
        assertThat(member.getFirstname()).isEqualTo("Boubacar");
        assertThat(member.getNationality()).isEqualTo("SN");
        assertThat(member.getBirthday()).isEqualTo("10/03/2000");
        assertThat(member.getMaritalStatus()).isEqualTo("Single");
        assertThat(member.getAddressInDakar()).isEqualTo("Malika");
        assertThat(member.getHolidayAddress()).isEqualTo("Dakar");
        assertThat(member.getNumberPhone()).isEqualTo("7777777777");
        assertThat(member.getPersonToCall()).isEqualTo("Tanou");
        assertThat(member.getFaculty()).isEqualTo("FSR");
        assertThat(member.getDepartment()).isEqualTo("Math-Info");
        assertThat(member.getClubs()).isEqualTo(clubs);
        assertThat(member.getCommission()).isEqualTo(commission);
        assertThat(member.getBourse()).isEqualTo("bourse_entier");
        assertThat(member.getParticipatedActivity()).isEqualTo("Set Setal");
        assertThat(member.getAddressToCampus()).isEqualTo("Pavillons H");
        assertThat(member.getAemudCourses()).isEqualTo("Arabe");
        assertThat(member.getOtherCourses()).isEqualTo("No");
        assertThat(member.getAreYouMemberOfPoliticOrganisation()).isEqualTo("no");
        assertThat(member.getYearOfMembership()).isEqualTo("2019");
        assertThat(member.getTwinsName()).isEqualTo("Loum");
        assertThat(member.getPay()).isEqualTo("no");
        assertThat(member.getAreYouMemberOfPoliticOrganisation()).isEqualTo("no");
    }
}