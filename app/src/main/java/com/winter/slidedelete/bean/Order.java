package com.winter.slidedelete.bean;

public class Order
{
    /**
     * orderId : 5721750899641754
     * orderTotal : 0.16
     * discountTotal : 0.16
     * activity_total : 0.00
     * paidTotal : 0.00
     * activityName :
     * activityBeginDate :
     * activityEndDate :
     * activityFlag :
     * qr : {"alipay":{"result_code":-1,"result_desc":"Fail"},"weixin":{"result_code":-1,"result_desc":"Fail"}}
     */

    private String orderId;
    private String orderTotal;
    private String discountTotal;
    private String activity_total;
    private String paidTotal;
    private String activityName;
    private String activityBeginDate;
    private String activityEndDate;
    private String activityFlag;
    private QrBean qr;

    public String getOrderId()
    {
        return orderId;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    public String getOrderTotal()
    {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal)
    {
        this.orderTotal = orderTotal;
    }

    public String getDiscountTotal()
    {
        return discountTotal;
    }

    public void setDiscountTotal(String discountTotal)
    {
        this.discountTotal = discountTotal;
    }

    public String getActivity_total()
    {
        return activity_total;
    }

    public void setActivity_total(String activity_total)
    {
        this.activity_total = activity_total;
    }

    public String getPaidTotal()
    {
        return paidTotal;
    }

    public void setPaidTotal(String paidTotal)
    {
        this.paidTotal = paidTotal;
    }

    public String getActivityName()
    {
        return activityName;
    }

    public void setActivityName(String activityName)
    {
        this.activityName = activityName;
    }

    public String getActivityBeginDate()
    {
        return activityBeginDate;
    }

    public void setActivityBeginDate(String activityBeginDate)
    {
        this.activityBeginDate = activityBeginDate;
    }

    public String getActivityEndDate()
    {
        return activityEndDate;
    }

    public void setActivityEndDate(String activityEndDate)
    {
        this.activityEndDate = activityEndDate;
    }

    public String getActivityFlag()
    {
        return activityFlag;
    }

    public void setActivityFlag(String activityFlag)
    {
        this.activityFlag = activityFlag;
    }

    public QrBean getQr()
    {
        return qr;
    }

    public void setQr(QrBean qr)
    {
        this.qr = qr;
    }

    public static class QrBean
    {
        /**
         * alipay : {"result_code":-1,"result_desc":"Fail"}
         * weixin : {"result_code":-1,"result_desc":"Fail"}
         */

        private AlipayBean alipay;
        private WeixinBean weixin;

        public AlipayBean getAlipay()
        {
            return alipay;
        }

        public void setAlipay(AlipayBean alipay)
        {
            this.alipay = alipay;
        }

        public WeixinBean getWeixin()
        {
            return weixin;
        }

        public void setWeixin(WeixinBean weixin)
        {
            this.weixin = weixin;
        }

        public static class AlipayBean
        {
            /**
             * result_code : -1
             * result_desc : Fail
             */

            private int result_code;
            private String result_desc;

            public int getResult_code()
            {
                return result_code;
            }

            public void setResult_code(int result_code)
            {
                this.result_code = result_code;
            }

            public String getResult_desc()
            {
                return result_desc;
            }

            public void setResult_desc(String result_desc)
            {
                this.result_desc = result_desc;
            }
        }

        public static class WeixinBean
        {
            /**
             * result_code : -1
             * result_desc : Fail
             */

            private int result_code;
            private String result_desc;

            public int getResult_code()
            {
                return result_code;
            }

            public void setResult_code(int result_code)
            {
                this.result_code = result_code;
            }

            public String getResult_desc()
            {
                return result_desc;
            }

            public void setResult_desc(String result_desc)
            {
                this.result_desc = result_desc;
            }
        }
    }
}
