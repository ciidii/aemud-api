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
        member = new Member(1L, "Boubacar", "Diallo", "SN", "10/03/2000", "Single", "Malika", "Dakar", "7777777777", "cidi@gmail.com", "Tanou", "FSR", "Math-Info", "bourse_entier", "Set Setal", "Pavillons H", "Arabe", "", "no", "no", "2019", "Loum", "no", commission, clubs);
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
        assertThat(1L).isEqualTo(contribution.getId());
        assertThat(Year.of(2020)).isEqualTo(contribution.getYear());
        assertThat(Month.of(12)).isEqualTo(contribution.getMonth());
        assertThat(DayOfWeek.MONDAY).isEqualTo(contribution.getDayOfWeek());
        assertThat(LocalTime.of(23, 59, 59)).isEqualTo(contribution.getLocalTime());
        assertThat(10.0f).isEqualTo(contribution.getAmount());
        assertThat(member).isEqualTo(contribution.getMember());

    }

}