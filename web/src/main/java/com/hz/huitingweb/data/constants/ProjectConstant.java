package com.hz.huitingweb.data.constants;

/**
 * 项目常量
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.hz.huitingweb.data";//项目基础包名称，根据自己公司的项目修改

    public static final String MODEL_PACKAGE = "com.hz.huitingweb.common.model";//Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";//Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";//Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = "com.hz.huitingweb.common.base.Mapper";//Mapper插件基础接口的完全限定名
}
