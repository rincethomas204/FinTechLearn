package com.amexlearn.randomnumber.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustomerModel {
    private String name;
    private String pin;
    private Double balance;
    private String type;



}
