package cn.zhz.auntaunt.javebean;

/**
 * Created by SYSTOP on 2016/8/11.
 */

public class Code {

    private  String code;
    private  String data;
    private  String message;

    //无参构造方法
    public Code() {
    }

    //带参构造方法
    public Code(String code, String data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
