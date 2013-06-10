/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package disco.utils;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import lejos.robotics.DirectionFinder;

/**
 *
 * @author sam
 */
public class DiscoGyro extends Gyro implements DirectionFinder {

    double offset = 0;

    public DiscoGyro(int channel) {
        super(channel);
    }

    public DiscoGyro(int slot, int channel) {
        super(slot, channel);
    }

    public DiscoGyro(AnalogChannel channel) {
        super(channel);
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }

    public double getAngle() {
        double res = -1*super.getAngle();
        return res + offset;
    }

    public double getRawAngle() {
        return (super.getAngle());
    }

    public void reset() {
        super.reset();
    }

    protected double normalize(double in) {
        /*
         * returns equivalent angle between -180 and +180
         */
        double a = in;
        while (a > 180) {
            a -= 360;
        }
        while (a < -180) {
            a += 360;
        }
        return a;
    }

    public float getDegreesCartesian() {
    }

    public void startCalibration() {
    }

    public void stopCalibration() {
    }

    public void resetCartesianZero() {
    }
}
