package com.amud.io.aemudapi.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ContributionTest {
    private Commission commission;
    private List<Club> clubs;
    private Member member;

    @BeforeEach
    void setUp() {
        commission = new Commission(1L, "Commission");
        clubs = new ArrayList<>();
        clubs.add(new Club(1L, "Club Informatique"));
        clubs.add(new Club(1L, "Club Maths"));
        member = Member.builder()
                .setId(1L)
                .setName("Diallo")
                .setEmail("boubacar@gmail.com")
                .setFirstname("Boubacar")
                .setNationality("SN")
                .setBirthday("10/03/2000")
                .setMaritalStatus("Single")
                .setAddressInDakar("Malika")
                .setHolidayAddress("Dakar")
                .setNumberPhone("7777777777")
                .setPersonToCall("Tanou")
                .setFaculty("FSR")
                .setDepartment("Math-Info")
                .setClubs(clubs)
                .setCommission(commission)
                .setBourse("bourse_entier")
                .setParticipatedActivity("Set Setal")
                .setAddressToCampus("Pavillons H")
                .setAemudCourses("Arabe")
                .setOtherCourses("No")
                .setYearOfMembership("2019")
                .setTwinsName("Loum")
                .setPay(false)
                .build();
    }

    @Test
    void testConstructorWithAllAgrs() {
        //given
        Long id = 1L;
        Year year = Year.of(2020);
        Month month = Month.of(12);
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        LocalTime localTime = LocalTime.of(23, 59, 59);
        Float amount = 10.0f;
        //when
        Contribution contribution = new Contribution(id, year, month, dayOfWeek, localTime, amount, member);
        //then
        assertThat(id).isEqualTo(contribution.getId());
        assertThat(year).isEqualTo(contribution.getYear());
        assertThat(month).isEqualTo(contribution.getMonth());
        assertThat(dayOfWeek).isEqualTo(contribution.getDayOfWeek());
        assertThat(localTime).isEqualTo(contribution.getLocalTime());
        assertThat(amount).isEqualTo(contribution.getAmount());
        assertThat(member).isEqualTo(contribution.getMember());
    }

    @Test
    void testGetters() {
        //given
        LocalTime localTime = LocalTime.of(23, 59, 59);
        Contribution contribution = new Contribution(1L, Year.of(2000), Month.APRIL, DayOfWeek.FRIDAY, localTime, 12f, member);
        //when
        Long id = contribution.getId();
        Year year = contribution.getYear();
        Month month = contribution.getMonth();
        DayOfWeek dayOfWeek = contribution.getDayOfWeek();
        LocalTime time = contribution.getLocalTime();
        Float amount = contribution.getAmount();
        Member member = contribution.getMember();
        //then
        assertThat(id).isEqualTo(contribution.getId());
        assertThat(year).isEqualTo(contribution.getYear());
        assertThat(month).isEqualTo(contribution.getMonth());
        assertThat(dayOfWeek).isEqualTo(contribution.getDayOfWeek());
        assertThat(localTime).isEqualTo(contribution.getLocalTime());
        assertThat(amount).isEqualTo(contribution.getAmount());
        assertThat(member).isEqualTo(contribution.getMember());
    }

    @Test
    void testSetters() {
        //given
        Contribution contribution = new Contribution();
        //when
        contribution.setId(1L);
        contribution.setYear(Year.of(2020));
        contribution.setMonth(Month.of(12));
        contribution.setDayOfWeek(DayOfWeek.MONDAY);
        contribution.setLocalTime(LocalTime.of(23, 59, 59));
        contribution.setAmount(10.0f);
        contribution.setMember(member);
        //then
        assertThat(contribution.getId()).isEqualTo(1L);
        assertThat(Year.of(2020)).isEqualTo(contribution.getYear());
        assertThat(Month.of(12)).isEqualTo(contribution.getMonth());
        assertThat(contribution.getDayOfWeek()).isEqualTo(DayOfWeek.MONDAY);
        assertThat(LocalTime.of(23, 59, 59)).isEqualTo(contribution.getLocalTime());
        assertThat(contribution.getAmount()).isEqualTo(10.0f);
        assertThat(member).isEqualTo(contribution.getMember());

    }

}