/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package ex20.base;

public class StateTax {
    private String state;
    private String county;
    private double amount;
    private double stateTax;
    private double countyTax;

    public StateTax(String state, String county, double amount){
        this.state = state;
        this.amount = amount;
        if("wisconsin".equalsIgnoreCase(state)){
            this.stateTax = 5.0/100;
            this.county = county;
            if("eau claire".equalsIgnoreCase(county)){
                this.countyTax = 0.005;
            }else if("dunn".equalsIgnoreCase(county)){
                this.countyTax = 0.004;
            }else{
                this.countyTax = 0.0;
            }
        }else if("illinois".equals(state)){
            this.stateTax = 8.0/100;
        }else{
            this.stateTax = 0.00;
        }
    }


    public StringBuilder stateTax(){
        StringBuilder output = new StringBuilder();

        double tax = amount * stateTax;

        if("wisconsin".equalsIgnoreCase(state)){
            if("eau claire".equalsIgnoreCase(county) || "dunn".equalsIgnoreCase(county) ) {
                tax = (tax / stateTax) * (stateTax + countyTax);
                System.out.println(tax);
            }
        }

        double total = amount + tax;

        output.append(String.format("The tax is $%.2f.\nThe total is $%.2f.", tax, total));
        return output;
    }
}
