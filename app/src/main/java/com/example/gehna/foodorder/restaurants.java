package com.example.gehna.foodorder;

import android.graphics.Bitmap;

/**
 * Created by GEHNA on 2/11/2018.
 */

public class restaurants {
    private Bitmap cover,item1,item2,item3,item4;
    private String rest_name,n1,n2,n3,n4,p1,p2,p3,p4,call;

    public restaurants(Bitmap cover, Bitmap item1, Bitmap item2, Bitmap item3, Bitmap item4, String rest_name, String n1, String n2, String n3, String n4, String p1, String p2, String p3, String p4, String call) {
        this.cover = cover;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.rest_name = rest_name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.call = call;
    }

    public Bitmap getCover() {
        return cover;
    }

    public void setCover(Bitmap cover) {
        this.cover = cover;
    }

    public Bitmap getItem1() {
        return item1;
    }

    public void setItem1(Bitmap item1) {
        this.item1 = item1;
    }

    public Bitmap getItem2() {
        return item2;
    }

    public void setItem2(Bitmap item2) {
        this.item2 = item2;
    }

    public Bitmap getItem3() {
        return item3;
    }

    public void setItem3(Bitmap item3) {
        this.item3 = item3;
    }

    public Bitmap getItem4() {
        return item4;
    }

    public void setItem4(Bitmap item4) {
        this.item4 = item4;
    }

    public String getRest_name() {
        return rest_name;
    }

    public void setRest_name(String rest_name) {
        this.rest_name = rest_name;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }
}
