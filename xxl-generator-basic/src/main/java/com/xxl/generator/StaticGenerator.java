package com.xxl.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * 静态文件生成
 *
 * @Author: xxl
 * @Date: 2024/02/04  14:08
 */
public class StaticGenerator {

    public static void main(String[] args) {
        // 获取整个项目的根路径
        String projectPath = System.getProperty("user.dir");
        // 获取上一级
        //File parentFile = new File(projectPath).getParentFile();
        // 输入路径：ACM 示例代码模板目录
        String inputPath = new File(projectPath, "xxl-generator-demo-projects/acm-template").getAbsolutePath();
        // 输出路径：直接输出到项目的根目录
        String outputPath = projectPath;
        copyFilesByHutool(inputPath, outputPath);
    }

    /**
     * 拷贝文件（Hutool 实现，会将输入目录完整拷贝到输出目录下）
     *
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

}
