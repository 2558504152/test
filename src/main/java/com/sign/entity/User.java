package com.sign.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "gender", nullable = false)
    private Short gender;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "graduate_school", nullable = false)
    private String graduateSchool;

    @Column(name = "id_number", nullable = false)
    private String idNumber;

    @Transient
    private String idNumber1;

    @Column(name = "hk", nullable = false)
    private String hk;

    @Column(name = "phone_number1", nullable = false)
    private String phoneNumber1;

    @Column(name = "phone_number2", nullable = false)
    private String phoneNumber2;

    @Column(name = "living_address", nullable = false)
    private String livingAddress;


    @Column(name = "detail_address", nullable = false)
    private String detailAddress;


    @Column(name = "skill", nullable = false)
    private String skill;

    public String getIdNumber1() {
        return idNumber1;
    }

    public void setIdNumber1(String idNumber1) {
        this.idNumber1 = idNumber1;
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

    public Short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getHk() {
        return hk;
    }

    public void setHk(String hk) {
        this.hk = hk;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
