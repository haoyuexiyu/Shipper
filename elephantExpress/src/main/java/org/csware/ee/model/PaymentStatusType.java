package org.csware.ee.model;

/**
 * Created by Yu on 2015/6/25.
 * 付款方式
 */
public enum PaymentStatusType implements ICnEnum {

    /*付款时间(1:发货付款,2:到货付款,3:见票付款,4:见回单付款)*/


    NOT_YET("NotYet", "未付款", 0),
    GIVEN("Given", "货主已付款", 1),
    GOT("Got", "司机已收到", 2),;

    // 成员变量
    String name;
    String cnName;
    int value;

    // 构造方法
    PaymentStatusType(String name, String cnName, int value) {
        this.name = name;
        this.cnName = cnName;
        this.value = value;
    }

    //覆盖方法
    @Override
    public String toString() {
        return "[" + this.value + ":" + this.name + "][" + this.cnName + "]";
    }

    /**
     * 获得名称
     */
    public String toName() {
        return this.name;
    }

    public String toCnName() {
        return this.cnName;
    }

    /**
     * 获得int值
     */
    public int toValue() {
        return this.value;
    }

    public CnEnum toItem() {
        return new CnEnum(this);
    }

}
