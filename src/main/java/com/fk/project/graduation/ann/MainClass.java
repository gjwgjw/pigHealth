package com.fk.project.graduation.ann;

import com.fk.project.graduation.util.ConsoleHelper;
import com.fk.project.graduation.util.DataUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

/**
 * @author: gao jw
 * @date: 2021/12/21  16:35
 */
public class MainClass {
    public static void main(String[] args) throws Exception {
//        String trainfile = "D:\\bishe\\data\\train.txt";
//        String testfile = "D:\\bishe\\data\\test.txt";
//        String separator = ",";
//        String outputfile = "D:\\bishe\\data\\out.txt";
        String trainfile = "D:\\bishe\\train.txt";
        String testfile = "D:\\bishe\\test.txt";
        String separator = ",";
        String outputfile = "D:\\bishe\\out.txt";
        float eta = 0.02f;
        int nIter = 5000;
        DataUtil util = DataUtil.getInstance();
        List<DataNode> trainList = util.getDataList(trainfile, separator);
        List<DataNode> testList = util.getDataList(testfile, separator);
        BufferedWriter output = new BufferedWriter(new FileWriter(new File(
                outputfile)));
        int typeCount = util.getTypeCount();
        AnnClassifier annClassifier = new AnnClassifier(trainList.get(0)
                .getAttribList().size(), trainList.get(0).getAttribList()
                .size() + 12, typeCount);
        annClassifier.setTrainNodes(trainList);
        annClassifier.train(eta, nIter);
        for (int i = 0; i < testList.size(); i++) {
            DataNode test = testList.get(i);
            int type = annClassifier.test(test);
            List<Float> attribs = test.getAttribList();
            for (int n = 0; n < attribs.size(); n++) {
                output.write(attribs.get(n) + ",");
                output.flush();
            }
            output.write(util.getTypeName(type) + "\n");
            System.out.println("正确：" + util.getTypeName(testList.get(i).getType()) + "-----预测：" +util.getTypeName(type));
            output.flush();
        }
        output.close();

    }

}
