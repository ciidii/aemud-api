package com.amud.io.aemudapi.entities;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

@Entity
@Table(name = "contribution")
public class Contribution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Year year;
    private Month month;
    private DayOfWeek dayOfWeek;
    private LocalTime localTime;
    private Float amount;
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    public Contribution() {
        //constructor without args
    }

    public Contribution(Long id, Year year, Month month, DayOfWeek dayOfWeek, LocalTime localTime, Float amount, Member member) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.dayOfWeek = dayOfWeek;
        this.localTime = localTime;
        this.amount = amount;
        this.member = member;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
