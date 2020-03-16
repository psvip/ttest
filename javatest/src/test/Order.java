package test;

import java.util.List;

/**
 * 订单
 * psvip
 * 2020/3/4 22：00
 */
public class Order {
    /**
     * 订单号
     */
    private String orderNumber;
    /**
     * 订单状态
     */
    private  String orderStatus;
    /**
     * 订单内容
     */
    private List<Goods> orderInformation;
    /**
     * 买家姓名
     */
    private  String buyerName;
    /**
     * 买家电话
     */
    private  String buyerPhoneNumber;
    /**
     * 买家地址
     */
    private  String buyerAddress;

    /**
     * 商家名称
     */
    private String merchants;
    /**
     * 商品信息
     */
    private  String goodsInformation;
    /**
     * 商品总价
     */
    private  float goodsprize;
    /**
     * 运费
     */
    private float freight;
    /**
     * 实付价格
     */
    private  float totalPrize;

    /**
     * 支付宝交易号
     */

    private  String alipayaTransactionNumber;
    /**
     * 创建时间
     */
    private  String createTime;
    /**
     * 付款时间
     */
    private  String payTime;
    /**
     * 发货时间
     */
    private  String deliveryTime;
    /**
     * 成交时间
     */
    private String dealTime;
}
