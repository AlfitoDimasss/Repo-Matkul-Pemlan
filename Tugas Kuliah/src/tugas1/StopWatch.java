/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Date;

/**
 *
 * @author Illuminare
 */
public class StopWatch {

    private double startTime;
    private double endTime;

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public void start() {
        Date start = new Date();
        this.startTime = start.getTime();
    }

    public void stop() {
        Date end = new Date();
        this.endTime = end.getTime();
    }

    public double getElapsedTime() {
        double result = this.endTime - this.startTime;
        return result;
    }

}
