package cn.zhz.auntaunt.javebean;

/**
 * Created by SYSTOP on 2016/8/11.
 */

public class Notice extends  Code {

    private  String noticeid;
    private  String title;//标题
    private  String noticeidType;//对应字典表
    private  String pushType;//对应字典表
    private  String concent;//内容
    private  int state;//0：待发布  1：发布
    private  String createTime;//创建时间
    private  String pushTime;//发布时间
    private  String createId;//对应系统用户
    private  String username;//用户名

    public Notice(String code, String data, String message) {
        super(code, data, message);
    }

    public Notice(String code, String data, String message, String noticeid,
                  String title, String noticeidType, String pushType,
                  String concent, int state, String createTime,
                  String pushTime, String createId, String username) {
        super(code, data, message);
        this.noticeid = noticeid;
        this.title = title;
        this.noticeidType = noticeidType;
        this.pushType = pushType;
        this.concent = concent;
        this.state = state;
        this.createTime = createTime;
        this.pushTime = pushTime;
        this.createId = createId;
        this.username = username;
    }

    public String getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNoticeidType() {
        return noticeidType;
    }

    public void setNoticeidType(String noticeidType) {
        this.noticeidType = noticeidType;
    }

    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType;
    }

    public String getConcent() {
        return concent;
    }

    public void setConcent(String concent) {
        this.concent = concent;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
