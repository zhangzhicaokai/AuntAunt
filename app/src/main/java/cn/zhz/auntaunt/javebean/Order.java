package cn.zhz.auntaunt.javebean;

/**
 * Created by SYSTOP on 2016/8/12.
 */

public class Order extends  Code{

    private  String oid;//编号
    private  int orderType;//  0:普通订单   1：周期订单
    private  int contendCount;//竟单数量
    private  int weekNum;//服务周数
    private  String weekDays;//多个逗号隔开，1·7表示
    private  int serviceState;// 0：未完成   1：已完成
    private  int serviceCount;//总服务次数
    private  int useCount;//已服务次数
    private  String orderNo;//订单编号
    private  String creationDate;//创建时间
    private  String customerId;//消费者
    private  String addressArea;//住址区域和楼盘名
    private  String addressString;//门牌号
    private  int confirmDistance;//提交订单与服务订单距离
    private  String baiduMapLng;//百度经度
    private  String baiduMapLat;//百度纬度
    private  String orderAgreedTime;//预约时间
    private  float orderNum;//预约数量/服务次数
    private  String orderDurationTome;//预约结束时间
    private  String serviceClass;//服务品类
    private  String linkMan;//联系人
    private  String contactMobile;//联系电话
    private  String customerRemark;//业务补充说明
    private  int state;//1:竟单中 2：已生效等待服务3：取消4：超时
    // 5：阿姨确认等待支付6：已完成支付
    private  String providerId;//阿姨Id
    private  String confirmData;//成交时间
    private   float orderPrice;//单价
    private  float confirmNum;//实际数量
    private  float gold;//金币
    private  float payAmout;//订单总价（单价*数量）
    private  String payType;//支付方式对应字典表
    private  String paymentData;//支付时间
    private  float payMoney;//实付金额
    private  String payId;//支付id如：微信，支付宝
    private  int providerJudgeLevel;//订单评价  1:不太满意 2：有待提高 3：
    // 基本满意 4：我很满意  5：非常满意

    public Order(String code, String data, String message) {
        super(code, data, message);
    }

    public Order(String code, String data, String message, String oid,
                 int orderType, int contendCount, int weekNum,
                 String weekDays, int serviceState, int serviceCount,
                 int useCount, String orderNo, String creationDate,
                 String customerId, String addressArea, String addressString,
                 int confirmDistance, String baiduMapLng,
                 String baiduMapLat, String orderAgreedTime,
                 float orderNum, String orderDurationTome,
                 String serviceClass, String linkMan, String contactMobile,
                 String customerRemark, int state, String providerId,
                 String confirmData, float orderPrice, float confirmNum,
                 float gold, float payAmout, String payType,
                 String paymentData, float payMoney, String payId, int providerJudgeLevel) {
        super(code, data, message);
        this.oid = oid;
        this.orderType = orderType;
        this.contendCount = contendCount;
        this.weekNum = weekNum;
        this.weekDays = weekDays;
        this.serviceState = serviceState;
        this.serviceCount = serviceCount;
        this.useCount = useCount;
        this.orderNo = orderNo;
        this.creationDate = creationDate;
        this.customerId = customerId;
        this.addressArea = addressArea;
        this.addressString = addressString;
        this.confirmDistance = confirmDistance;
        this.baiduMapLng = baiduMapLng;
        this.baiduMapLat = baiduMapLat;
        this.orderAgreedTime = orderAgreedTime;
        this.orderNum = orderNum;
        this.orderDurationTome = orderDurationTome;
        this.serviceClass = serviceClass;
        this.linkMan = linkMan;
        this.contactMobile = contactMobile;
        this.customerRemark = customerRemark;
        this.state = state;
        this.providerId = providerId;
        this.confirmData = confirmData;
        this.orderPrice = orderPrice;
        this.confirmNum = confirmNum;
        this.gold = gold;
        this.payAmout = payAmout;
        this.payType = payType;
        this.paymentData = paymentData;
        this.payMoney = payMoney;
        this.payId = payId;
        this.providerJudgeLevel = providerJudgeLevel;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getContendCount() {
        return contendCount;
    }

    public void setContendCount(int contendCount) {
        this.contendCount = contendCount;
    }

    public int getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(int weekNum) {
        this.weekNum = weekNum;
    }

    public String getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(String weekDays) {
        this.weekDays = weekDays;
    }

    public int getServiceState() {
        return serviceState;
    }

    public void setServiceState(int serviceState) {
        this.serviceState = serviceState;
    }

    public int getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(int serviceCount) {
        this.serviceCount = serviceCount;
    }

    public int getUseCount() {
        return useCount;
    }

    public void setUseCount(int useCount) {
        this.useCount = useCount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    public int getConfirmDistance() {
        return confirmDistance;
    }

    public void setConfirmDistance(int confirmDistance) {
        this.confirmDistance = confirmDistance;
    }

    public String getBaiduMapLng() {
        return baiduMapLng;
    }

    public void setBaiduMapLng(String baiduMapLng) {
        this.baiduMapLng = baiduMapLng;
    }

    public String getBaiduMapLat() {
        return baiduMapLat;
    }

    public void setBaiduMapLat(String baiduMapLat) {
        this.baiduMapLat = baiduMapLat;
    }

    public String getOrderAgreedTime() {
        return orderAgreedTime;
    }

    public void setOrderAgreedTime(String orderAgreedTime) {
        this.orderAgreedTime = orderAgreedTime;
    }

    public float getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(float orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderDurationTome() {
        return orderDurationTome;
    }

    public void setOrderDurationTome(String orderDurationTome) {
        this.orderDurationTome = orderDurationTome;
    }

    public String getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getConfirmData() {
        return confirmData;
    }

    public void setConfirmData(String confirmData) {
        this.confirmData = confirmData;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public float getConfirmNum() {
        return confirmNum;
    }

    public void setConfirmNum(float confirmNum) {
        this.confirmNum = confirmNum;
    }

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public float getPayAmout() {
        return payAmout;
    }

    public void setPayAmout(float payAmout) {
        this.payAmout = payAmout;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(String paymentData) {
        this.paymentData = paymentData;
    }

    public float getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(float payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public int getProviderJudgeLevel() {
        return providerJudgeLevel;
    }

    public void setProviderJudgeLevel(int providerJudgeLevel) {
        this.providerJudgeLevel = providerJudgeLevel;
    }
}
