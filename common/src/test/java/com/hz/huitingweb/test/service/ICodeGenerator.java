package com.hz.huitingweb.test.service;

/**
 * Created by huangzhe on 2017/12/8.
 */
public interface ICodeGenerator {
    void genCode(String... tableNames);
    void genCode(String tableName, String modelName);
    void genModelAndMapper(String tableName, String modelName);
    void genService(String tableName, String modelName);
    void genController(String tableName, String modelName);
}
