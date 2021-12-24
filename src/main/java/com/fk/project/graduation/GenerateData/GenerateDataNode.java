package com.fk.project.graduation.GenerateData;

/**
 * @author: gao jw
 * @date: 2021/12/21  11:17
 */
public class GenerateDataNode {
    private int heartRate;

    private double temperature;

    private double ambientTemperature;

    private int ambientHumidity;

    private int light;

    private double ammonia;

    private String state;

    public GenerateDataNode() {
    }

    public GenerateDataNode(int heartRate, double temperature, double ambientTemperature, int ambientHumidity, int light, double ammonia, String state) {
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.ambientTemperature = ambientTemperature;
        this.ambientHumidity = ambientHumidity;
        this.light = light;
        this.ammonia = ammonia;
        this.state = state;
    }

    @Override
    public String toString() {
        return heartRate +
                "," + temperature +
                "," + ambientTemperature +
                "," + ambientHumidity +
                "," + light +
                "," + ammonia +
                "," + state + "\n";
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getAmbientTemperature() {
        return ambientTemperature;
    }

    public void setAmbientTemperature(double ambientTemperature) {
        this.ambientTemperature = ambientTemperature;
    }

    public int getAmbientHumidity() {
        return ambientHumidity;
    }

    public void setAmbientHumidity(int ambientHumidity) {
        this.ambientHumidity = ambientHumidity;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public double getAmmonia() {
        return ammonia;
    }

    public void setAmmonia(double ammonia) {
        this.ammonia = ammonia;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
