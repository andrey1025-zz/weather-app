package com.abhishek.amplyweather;

import java.io.Serializable;

public class MData implements Serializable {
    public String city;
    public String state;
    public String cur_tmp;
    public String high_tmp;
    public String low_tmp;

    public MData(String city, String state, String cur_tmp, String high_tmp, String low_tmp) {
        this.city = city;
        this.state = state;
        this.cur_tmp = cur_tmp;
        this.high_tmp = high_tmp;
        this.low_tmp = low_tmp;
    }
    public MData() {
        this.city = "";
        this.state = "";
        this.cur_tmp = "";
        this.high_tmp = "";
        this.low_tmp = "";
    }

}
