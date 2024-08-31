package cn.lizhongbin.mybaking.response;

public enum ServiceCode {
    //枚举常量
    OK(2000),
    ERR_SELECT(5001),
    ERR_INSERT(5002);//自带构造器

    private Integer value;

    ServiceCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
