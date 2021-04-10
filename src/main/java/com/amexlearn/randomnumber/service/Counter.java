package com.amexlearn.randomnumber.service;

import lombok.ToString;

@ToString
public class Counter {
    private String name = null;
    private Integer counter = 0;

    public Counter(String str){
        this.name = str;
    }

    public void increment(){
        counter ++;
    }

    public Integer getCurrentValue(){
        return counter;
    }




}
