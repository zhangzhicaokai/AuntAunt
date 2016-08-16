package cn.zhz.auntaunt.javebean;

/**
 * Created by SYSTOP on 2016/8/11.
 */

public class Users extends  Code {

    private int id;
    private String integral;//累积积分
    private String wechatUnionId;
    private String wechatOpenId;
    private int subScribe;//是否订阅
    private int ismeMber;//是否会员  0：否  1： 是
    private String userName;
    private String wechatName;//微信用户名
    private String realName;//真实姓名
    private String sex;
    private int age;
    private String birthday;
    private int experience;//工作经验
    private String tel;
    private String mobile;
    private String mobile2;//备用手机
    private String email;
    private String password;
    private String pwdSalt;//加密辅助随机字符串
    private String language;
    private String country;
    private String province;//省份
    private String city;//城市
    private String address;//住址
    private String idCard;//身份证
    private String imgA;//身份证A面
    private String imgB;//身份证B面
    private String icon;//头像
    private String headImg;//微信头像
    private int userType;//用户类型  1：阿姨  2：业主
    private int balance;//账户余额
    private int activity;//是否激活
    private int status;//状态  1：活动  2：锁定  3：退出
    private String creationDate;
    private String modifiedDate;
    private String invitecode;//邀请码
    private String referrerid;//推荐人id

    public Users(String code, String data, String message) {
        super(code, data, message);
    }

    public Users(String code, String data, String message,
                 int id, String integral, String wechatUnionId,
                 String wechatOpenId, int subScribe, int ismeMber,
                 String userName, String wechatName,
                 String realName, String sex, int age,
                 String birthday, int experience,
                 String tel, String mobile, String mobile2,
                 String email, String password, String pwdSalt,
                 String language, String country, String province,
                 String city, String address, String idCard, String imgA,
                 String imgB, String icon, String headImg, int userType,
                 int balance, int activity, int status, String creationDate,
                 String modifiedDate, String invitecode, String referrerid) {
        super(code, data, message);
        this.id = id;
        this.integral = integral;
        this.wechatUnionId = wechatUnionId;
        this.wechatOpenId = wechatOpenId;
        this.subScribe = subScribe;
        this.ismeMber = ismeMber;
        this.userName = userName;
        this.wechatName = wechatName;
        this.realName = realName;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.experience = experience;
        this.tel = tel;
        this.mobile = mobile;
        this.mobile2 = mobile2;
        this.email = email;
        this.password = password;
        this.pwdSalt = pwdSalt;
        this.language = language;
        this.country = country;
        this.province = province;
        this.city = city;
        this.address = address;
        this.idCard = idCard;
        this.imgA = imgA;
        this.imgB = imgB;
        this.icon = icon;
        this.headImg = headImg;
        this.userType = userType;
        this.balance = balance;
        this.activity = activity;
        this.status = status;
        this.creationDate = creationDate;
        this.modifiedDate = modifiedDate;
        this.invitecode = invitecode;
        this.referrerid = referrerid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getWechatUnionId() {
        return wechatUnionId;
    }

    public void setWechatUnionId(String wechatUnionId) {
        this.wechatUnionId = wechatUnionId;
    }

    public String getWechatOpenId() {
        return wechatOpenId;
    }

    public void setWechatOpenId(String wechatOpenId) {
        this.wechatOpenId = wechatOpenId;
    }

    public int getSubScribe() {
        return subScribe;
    }

    public void setSubScribe(int subScribe) {
        this.subScribe = subScribe;
    }

    public int getIsmeMber() {
        return ismeMber;
    }

    public void setIsmeMber(int ismeMber) {
        this.ismeMber = ismeMber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPwdSalt() {
        return pwdSalt;
    }

    public void setPwdSalt(String pwdSalt) {
        this.pwdSalt = pwdSalt;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getImgA() {
        return imgA;
    }

    public void setImgA(String imgA) {
        this.imgA = imgA;
    }

    public String getImgB() {
        return imgB;
    }

    public void setImgB(String imgB) {
        this.imgB = imgB;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode;
    }

    public String getReferrerid() {
        return referrerid;
    }

    public void setReferrerid(String referrerid) {
        this.referrerid = referrerid;
    }
}
