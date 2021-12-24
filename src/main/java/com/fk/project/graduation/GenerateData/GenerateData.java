package com.fk.project.graduation.GenerateData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: gao jw
 * @date: 2021/12/21  10:55
 */
public class GenerateData {

    //健康
    public static final String HEALTHY = "healthy";
    //消化不良
    public static final String INDIGESTION = "indigestion";
    //中暑
    public static final String HEATSTROKE = "heatstroke";
    //流感
    public static final String INFLUENZA = "influenza";
    //其他症状
    public static final String OTHER = "other";
    //严重症状
    public static final String SERIOUS = "serious";

    public static void main(String[] args) {
        List<GenerateDataNode> list = new ArrayList<>();
        List<GenerateDataNode> list1 = new ArrayList<>();
        List<GenerateDataNode> list2 = new ArrayList<>();
        List<GenerateDataNode> list3 = new ArrayList<>();
        List<GenerateDataNode> list4 = new ArrayList<>();
        List<GenerateDataNode> list5 = new ArrayList<>();
        List<GenerateDataNode> list6 = new ArrayList<>();
        int i = 0;


       /* while (i < 120) {
            GenerateDataNode generateDataNode = new GenerateDataNode();
            generateDataNode = generateHealthyData();
            list1.add(generateDataNode);
            generateDataNode = generateIndigestionData();
            list2.add(generateDataNode);
            generateDataNode = generateHeatstrokeData();
            list3.add(generateDataNode);
            generateDataNode = generateInfluenzaData();
            list4.add(generateDataNode);
            generateDataNode = generateOtherData();
            list5.add(generateDataNode);
            generateDataNode = generateSeriousLowData();
            list6.add(generateDataNode);
            generateDataNode = generateSeriousHighData();
            list6.add(generateDataNode);
            i++;
        }

        while (i < 240) {
            GenerateDataNode generateDataNode = new GenerateDataNode();
            generateDataNode = generateHealthyData();
            list1.add(generateDataNode);
            generateDataNode = generateIndigestionData();
            list2.add(generateDataNode);
            generateDataNode = generateHeatstrokeData();
            list3.add(generateDataNode);
            generateDataNode = generateInfluenzaData();
            list4.add(generateDataNode);
            generateDataNode = generateOtherData();
            list5.add(generateDataNode);
            i++;
        }*/

        while (i < 120) {
            GenerateDataNode generateDataNode = new GenerateDataNode();
            generateDataNode = generateHealthyData();
            list.add(generateDataNode);
            generateDataNode = generateIndigestionData();
            list.add(generateDataNode);
            generateDataNode = generateHeatstrokeData();
            list.add(generateDataNode);
            generateDataNode = generateInfluenzaData();
            list.add(generateDataNode);
            generateDataNode = generateOtherData();
            list.add(generateDataNode);
            generateDataNode = generateSeriousLowData();
            list.add(generateDataNode);
            generateDataNode = generateSeriousHighData();
            list.add(generateDataNode);
            i++;
        }

        while (i < 240) {
            GenerateDataNode generateDataNode = new GenerateDataNode();
            generateDataNode = generateHealthyData();
            list.add(generateDataNode);
            generateDataNode = generateIndigestionData();
            list.add(generateDataNode);
            generateDataNode = generateHeatstrokeData();
            list.add(generateDataNode);
            generateDataNode = generateInfluenzaData();
            list.add(generateDataNode);
            generateDataNode = generateOtherData();
            list.add(generateDataNode);
            i++;
        }


//
//        while (i < 400) {
//            GenerateDataNode generateDataNode = new GenerateDataNode();
//            generateDataNode = generateHealthyData();
//            list.add(generateDataNode);
//            i++;
//        }

        try {
            File file = new File("D:\\data.txt");
            if (!file.exists()) {
                file.createNewFile();

            }
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("heartRate,temperature,ambientTemperature,ambientHumidity,light,ammonia,state\n");
            list.addAll(list1);/*
            list.addAll(list2);
            list.addAll(list3);
            list.addAll(list4);
            list.addAll(list5);
            list.addAll(list6);*/
            for (GenerateDataNode d : list
            ) {
                bw.write(d.toString());
            }
            bw.close();
            fw.close();
        } catch (Exception ignored) {
        }
    }


    /**
     * 产生健康数据
     *
     * @return
     */
    public static GenerateDataNode generateHealthyData() {
        int heartRate = getRandomInteger(70, 80);
        double temperature = getRandomInteger(380, 395) / 10.0;
        double ambientTemperature = getRandomInteger(140, 230) / 10.0;
        int ambientHumidity = getRandomInteger(65, 80);
        int light = getRandomInteger(100, 300);
        double ammonia = getRandomInteger(375, 625) / 100.0;
        return new GenerateDataNode(heartRate, temperature, ambientTemperature, ambientHumidity, light, ammonia, HEALTHY);
    }

    /**
     * 产生消化不良数据
     * 氨气含量上升
     *
     * @return
     */
    public static GenerateDataNode generateIndigestionData() {
        int heartRate = getRandomInteger(70, 80);
        double temperature = getRandomInteger(380, 395) / 10.0;
        double ambientTemperature = getRandomInteger(140, 230) / 10.0;
        int ambientHumidity = getRandomInteger(65, 80);
        int light = getRandomInteger(100, 300);
        //氨气含量上升
        double ammonia = getRandomInteger(600, 900) / 100.0;
        return new GenerateDataNode(heartRate, temperature, ambientTemperature, ambientHumidity, light, ammonia, INDIGESTION);
    }


    /**
     * 产生中暑数据
     * 环境温度、心率、体温、光照上升
     *
     * @return
     */
    public static GenerateDataNode generateHeatstrokeData() {

        int heartRate = getRandomInteger(85, 110);
        double temperature = getRandomInteger(400, 425) / 10.0;
        double ambientTemperature = getRandomInteger(320, 400) / 10.0;
        //夏季室外阳光直射强度6-10w lx
        int light = getRandomInteger(300, 1000);

        int ambientHumidity = getRandomInteger(65, 80);
        double ammonia = getRandomInteger(375, 625) / 100.0;
        return new GenerateDataNode(heartRate, temperature, ambientTemperature, ambientHumidity, light, ammonia, HEATSTROKE);
    }

    /**
     * 产生流感数据
     * 心率、体温上升
     *
     * @return
     */
    public static GenerateDataNode generateInfluenzaData() {
        int heartRate = getRandomInteger(85, 110);
        double temperature = getRandomInteger(400, 420) / 10.0;

        double ambientTemperature = getRandomInteger(140, 230) / 10.0;
        int ambientHumidity = getRandomInteger(65, 80);
        int light = getRandomInteger(100, 300);
        double ammonia = getRandomInteger(375, 625) / 100.0;
        return new GenerateDataNode(heartRate, temperature, ambientTemperature, ambientHumidity, light, ammonia, INFLUENZA);
    }


    /**
     * 产生其他症状数据(数值较低，如果较高就是感冒，如果过低过高就是严重)
     *
     * @return
     */
    public static GenerateDataNode generateOtherData() {
        int heartRate = getRandomInteger(50, 70);
        double temperature = getRandomInteger(365, 375) / 10.0;
        double ambientTemperature = getRandomInteger(140, 230) / 10.0;
        int ambientHumidity = getRandomInteger(65, 80);
        int light = getRandomInteger(100, 300);
        double ammonia = getRandomInteger(375, 625) / 100.0;
        return new GenerateDataNode(heartRate, temperature, ambientTemperature, ambientHumidity, light, ammonia, OTHER);
    }

    /**
     * 产生严重症状数据（低）
     *
     * @return
     */
    public static GenerateDataNode generateSeriousLowData() {
        int heartRate = getRandomInteger(45, 55);
        double temperature = getRandomInteger(300, 365) / 10.0;

        double ambientTemperature = getRandomInteger(140, 230) / 10.0;
        int ambientHumidity = getRandomInteger(65, 80);
        int light = getRandomInteger(100, 300);
        double ammonia = getRandomInteger(375, 625) / 100.0;
        return new GenerateDataNode(heartRate, temperature, ambientTemperature, ambientHumidity, light, ammonia, SERIOUS);
    }

    /**
     * 产生严重症状数据（高）
     *
     * @return
     */
    public static GenerateDataNode generateSeriousHighData() {
        int heartRate = getRandomInteger(110, 150);
        double temperature = getRandomInteger(420, 450) / 10.0;

        double ambientTemperature = getRandomInteger(140, 230) / 10.0;
        int ambientHumidity = getRandomInteger(65, 80);
        int light = getRandomInteger(100, 300);
        double ammonia = getRandomInteger(375, 625) / 100.0;
        return new GenerateDataNode(heartRate, temperature, ambientTemperature, ambientHumidity, light, ammonia, SERIOUS);
    }

    /**
     * 产生范围内的随机数
     *
     * @param start
     * @param end
     * @return
     */
    public static int getRandomInteger(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }

}
