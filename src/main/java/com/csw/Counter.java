package com.csw;

import java.io.File;

public class Counter {
    public static void main(String[] args) {
//取得目标目录
        File file = new File("C:\\");
//获取目录下子文件及子文件夹
        File[] files = file.listFiles();
        readfile(files);

    }

    public static void readfile(File[] files) {
        if (files == null) {// 如果目录为空，直接退出
            return;
        }
        for (File f : files) {
//如果是文件，直接输出名字
            if (f.isFile()) {
                String fileName = f.getName();
                String prefix=fileName.substring(fileName.lastIndexOf(".")+1);
                if(prefix.equals("java"))
                System.out.println(f.getName());
            }
//如果是文件夹，递归调用
            else if (f.isDirectory()) {
                readfile(f.listFiles());
            }
        }
    }
}