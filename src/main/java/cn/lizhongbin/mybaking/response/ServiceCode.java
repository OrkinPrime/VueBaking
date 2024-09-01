package cn.lizhongbin.mybaking.response;

public enum ServiceCode {
    //枚举常量
    OK(2000),
    ERR_SELECT(5001),
    ERR_INSERT(5002),
    ERR_UNKNOWN(5500),
    ERR_UPDATE(5003),
    ERR_DELETE(5004);//自带构造器

    private Integer value;

    ServiceCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
