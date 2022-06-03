package com.filesection;

import java.io.IOException;

import org.junit.Test;

public class FileOperatorTest {

    @Test
    public void readFileTest() {
        FileOperator fileOperator = new FileOperator();
        try {
            fileOperator.readFile("C:\\tmp\\log.txt");
            //fileOperator.readFileUsingTryWithResourceMethod("/tmp/log.txt");
            //fileOperator.readFile("/tmp/log.txt");
            //fileOperator.readFileUsingTryWithResourceUsingByteArray("/tmp/log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

