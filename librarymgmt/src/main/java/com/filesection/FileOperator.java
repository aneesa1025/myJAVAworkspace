package com.filesection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileOperator {
    public void readFile(String filePath) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
            int data = inputStream.read();
            while (data != -1) {
                data = inputStream.read();
                char d = (char) data;
                System.out.print(d);
            }

        } finally {
            if (null != inputStream) {
                inputStream.close();
            }

        }
    }}

