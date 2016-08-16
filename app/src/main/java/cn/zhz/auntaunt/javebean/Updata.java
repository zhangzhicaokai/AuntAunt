package cn.zhz.auntaunt.javebean;

/**
 * Created by SYSTOP on 2016/8/12.
 */

public class Updata extends  Code {

    private  int updataCode;//版本号
    private  String updataInfo;//升级内容
    private  String updataSize;//升级包大小
    private  int updataForce; //是否强制升级     0：否    1 ：是

    public Updata(String code, String data, String message) {
        super(code, data, message);
    }

    public Updata(String code, String data, String message, int updataCode,
                  String updataInfo, String updataSize, int updataForce) {
        super(code, data, message);
        this.updataCode = updataCode;
        this.updataInfo = updataInfo;
        this.updataSize = updataSize;
        this.updataForce = updataForce;
    }

    public int getUpdataCode() {
        return updataCode;
    }

    public void setUpdataCode(int updataCode) {
        this.updataCode = updataCode;
    }

    public String getUpdataInfo() {
        return updataInfo;
    }

    public void setUpdataInfo(String updataInfo) {
        this.updataInfo = updataInfo;
    }

    public String getUpdataSize() {
        return updataSize;
    }

    public void setUpdataSize(String updataSize) {
        this.updataSize = updataSize;
    }

    public int getUpdataForce() {
        return updataForce;
    }

    public void setUpdataForce(int updataForce) {
        this.updataForce = updataForce;
    }
}
