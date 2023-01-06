/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Illuminare
 */
public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    private double percent;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public void setPrevClosingPrice(double input) {
        this.previousClosingPrice = input;
    }

    public void setCurrentPrice(double input) {
        this.currentPrice = input;
    }

    public double getChangedPercent() {
        this.percent = this.previousClosingPrice - this.currentPrice;
        percent *= 100;
        return percent;
    }

}
