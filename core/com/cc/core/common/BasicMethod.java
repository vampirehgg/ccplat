package com.cc.core.common;

/**
 * 功能模块实现接口，定义所有数据方法。
 * 功能模块数据有关全部通过接口方法实现。
 * 具体某一详细功能再自定义方法，达到入口统一目的。
 *
 * @author Legendary
 * @version 
 * @createtime 2014.8.30
*/

public interface BasicMethod {
    /*-------------------------------------------------------------------------------------------*/

    /**
     * 数据采集（所有原始数据录入入口，包括用户直接输入，机器读取，设备获取，如：读取NFC卡，GPS定位信息）
     * @param param 方法
     * @param param
     * @return
     */
    public Object Collect(String met, Object param);

    /*-------------------------------------------------------------------------------------------*/

    /**
     * 数据处理（对已存在数据（包括原始录入、处理后存储等）操作，如：计算购物金额，减免费用等）
     * @param param 方法
     * @param param
     * @return
     */
    public Object Handle(String met, Object param);

    /*-------------------------------------------------------------------------------------------*/

    /**
     * 数据控制（数据流等待过程，数据流动过程中等待控制，如：等待审核，等待审批等）
     * @param param 方法
     * @param param
     * @return
     */
    public Object Control(String met, Object param);

    /*-------------------------------------------------------------------------------------------*/

    /**
     * 数据联动（数据传输，控制数据流向，某一具体功能整个数据流动，如：申请请假，提交后自动推送到上级领导）
     * @param param 方法
     * @param param
     * @return
     */
    public Object Linkage(String met, Object param);

    /*-------------------------------------------------------------------------------------------*/

    /**
     * 数据分析（数据查询，截取，组合，联动数据分析，如：各种报表显示）
     * @param param 方法
     * @param param
     * @return
     */
    public Object Analysis(String met, Object param);

    /*-------------------------------------------------------------------------------------------*/

    /**
     * 获取未处理信息
     * @param param
     * @return JSON数据格式，如: {name:"注册审批",count:"5",功能编号:"10001"} 
     */
    public Object getUntreated(Object param);

    /*-------------------------------------------------------------------------------------------*/

}
