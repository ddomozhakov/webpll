package com.example.webpll.models;

public class Calculator {
    private double Result;
    private double UI;
    private double Jdet;
    private double Jran;
    private double Tsetup;
    private double Thold;

    public Calculator(){
        Result = 0;
        UI = 320;
        Jdet = 0;
        Jran = 0;
        Tsetup = 0;
        Thold = 0;
    }

    public Calculator(String ui, String jdet, String jran, String tsetup, String thold){
        Result = 0;
        UI = Double.parseDouble(ui);
        Jdet = Double.parseDouble(jdet);
        Jran = Double.parseDouble(jran);
        Tsetup = Double.parseDouble(tsetup);
        Thold = Double.parseDouble(thold);
    }

    public double getResult() {
        return Result;
    }

    public void setResult(double result) {
        Result = result;
    }

    public double getUI() {
        return UI;
    }

    public void setUI(double ui) {
        UI = ui;
    }

    public double getJdet() {
        return Jdet;
    }

    public void setJdet(double jdet) {
        Jdet = jdet;
    }

    public double getJran() {
        return Jran;
    }

    public void setJran(double jran) {
        Jdet = jran;
    }

    public double getTsetup() {
        return Tsetup;
    }

    public void setTsetup(double tsetup) {
        Jdet = tsetup;
    }

    public double getThold() {
        return Thold;
    }

    public void setThold(double thold) {
        Jdet = thold;
    }

    public void calculateBER() {
        Result = 50;
    }

}
