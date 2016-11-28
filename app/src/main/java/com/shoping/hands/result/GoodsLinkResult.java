package com.shoping.hands.result;

import java.util.List;

/**
 * Created by mingge on 2016/11/14.
 */

public class GoodsLinkResult {
    @Override
    public String toString() {
        return "GoodsLinkResult{" +
                "data=" + data +
                '}';
    }

    /**
     * data : {"api_type":"领券优惠v1.4","update_time":"2016/11/28 12:00","total_num":15,"api_content":"IOS专用API数据接口","result":[{"GoodsID":"45327309639","Title":"三塘陶瓷 创意陶瓷杯子带勺马克杯马克咖啡杯牛奶水杯","D_title":"三塘陶瓷 创意陶瓷杯子带勺马克杯","Pic":"http://img.alicdn.com/imgextra/i3/2455190501/TB2ZDXUbk1M.eBjSZFFXXc3vVXa_!!2455190501.jpg","Cid":"4","Org_Price":"13.90","Price":8.9,"IsTmall":"1","Sales_num":"3611","Dsr":"4.8","SellerID":"2455190501","Commission":"30.50","Commission_jihua":"30.50","Commission_queqiao":"0.00","Jihua_link":"http://pub.alimama.com/myunion.htm?spm=a220o.1000855.0.0.2lMna4#!/promo/self/campaign?campaignId=8040640&shopkeeperId=110577870&userNumberId=2455190501","Introduce":"创意个性风格带勺子情侣款，甜蜜搞怪马克杯，办公室，居家各种场合衬托出不一样效果，独特创意引领潮流。","Quan_id":"b1187944afb24023978591b0c2762f5f","Quan_price":"5.00","Quan_time":"2016-11-28 00:00:00","Quan_surplus":"3068","Quan_receive":"6932","Quan_condition":"单笔满12元可用，每人限领2 张","Quan_link":"http://shop.m.taobao.com/shop/coupon.htm?seller_id=2455190501&activity_id=b1187944afb24023978591b0c2762f5f","Quan_m_link":"http://dwz.cn/4FhVr7","ali_click":"https://detail.tmall.com/item.htm?id=45327309639"}]}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "api_type='" + api_type + '\'' +
                    ", update_time='" + update_time + '\'' +
                    ", total_num=" + total_num +
                    ", api_content='" + api_content + '\'' +
                    ", result=" + result +
                    '}';
        }

        /**
         * api_type : 领券优惠v1.4
         * update_time : 2016/11/28 12:00
         * total_num : 15
         * api_content : IOS专用API数据接口
         * result : [{"GoodsID":"45327309639","Title":"三塘陶瓷 创意陶瓷杯子带勺马克杯马克咖啡杯牛奶水杯","D_title":"三塘陶瓷 创意陶瓷杯子带勺马克杯","Pic":"http://img.alicdn.com/imgextra/i3/2455190501/TB2ZDXUbk1M.eBjSZFFXXc3vVXa_!!2455190501.jpg","Cid":"4","Org_Price":"13.90","Price":8.9,"IsTmall":"1","Sales_num":"3611","Dsr":"4.8","SellerID":"2455190501","Commission":"30.50","Commission_jihua":"30.50","Commission_queqiao":"0.00","Jihua_link":"http://pub.alimama.com/myunion.htm?spm=a220o.1000855.0.0.2lMna4#!/promo/self/campaign?campaignId=8040640&shopkeeperId=110577870&userNumberId=2455190501","Introduce":"创意个性风格带勺子情侣款，甜蜜搞怪马克杯，办公室，居家各种场合衬托出不一样效果，独特创意引领潮流。","Quan_id":"b1187944afb24023978591b0c2762f5f","Quan_price":"5.00","Quan_time":"2016-11-28 00:00:00","Quan_surplus":"3068","Quan_receive":"6932","Quan_condition":"单笔满12元可用，每人限领2 张","Quan_link":"http://shop.m.taobao.com/shop/coupon.htm?seller_id=2455190501&activity_id=b1187944afb24023978591b0c2762f5f","Quan_m_link":"http://dwz.cn/4FhVr7","ali_click":"https://detail.tmall.com/item.htm?id=45327309639"}]
         */

        private String api_type;
        private String update_time;
        private int total_num;
        private String api_content;
        private List<ResultBean> result;

        public String getApi_type() {
            return api_type;
        }

        public void setApi_type(String api_type) {
            this.api_type = api_type;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public int getTotal_num() {
            return total_num;
        }

        public void setTotal_num(int total_num) {
            this.total_num = total_num;
        }

        public String getApi_content() {
            return api_content;
        }

        public void setApi_content(String api_content) {
            this.api_content = api_content;
        }

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public static class ResultBean {
            @Override
            public String toString() {
                return "ResultBean{" +
                        "GoodsID='" + GoodsID + '\'' +
                        ", Title='" + Title + '\'' +
                        ", D_title='" + D_title + '\'' +
                        ", Pic='" + Pic + '\'' +
                        ", Cid='" + Cid + '\'' +
                        ", Org_Price='" + Org_Price + '\'' +
                        ", Price=" + Price +
                        ", IsTmall='" + IsTmall + '\'' +
                        ", Sales_num='" + Sales_num + '\'' +
                        ", Dsr='" + Dsr + '\'' +
                        ", SellerID='" + SellerID + '\'' +
                        ", Commission='" + Commission + '\'' +
                        ", Commission_jihua='" + Commission_jihua + '\'' +
                        ", Commission_queqiao='" + Commission_queqiao + '\'' +
                        ", Jihua_link='" + Jihua_link + '\'' +
                        ", Introduce='" + Introduce + '\'' +
                        ", Quan_id='" + Quan_id + '\'' +
                        ", Quan_price='" + Quan_price + '\'' +
                        ", Quan_time='" + Quan_time + '\'' +
                        ", Quan_surplus='" + Quan_surplus + '\'' +
                        ", Quan_receive='" + Quan_receive + '\'' +
                        ", Quan_condition='" + Quan_condition + '\'' +
                        ", Quan_link='" + Quan_link + '\'' +
                        ", Quan_m_link='" + Quan_m_link + '\'' +
                        ", ali_click='" + ali_click + '\'' +
                        '}';
            }

            /**
             * GoodsID : 45327309639
             * Title : 三塘陶瓷 创意陶瓷杯子带勺马克杯马克咖啡杯牛奶水杯
             * D_title : 三塘陶瓷 创意陶瓷杯子带勺马克杯
             * Pic : http://img.alicdn.com/imgextra/i3/2455190501/TB2ZDXUbk1M.eBjSZFFXXc3vVXa_!!2455190501.jpg
             * Cid : 4
             * Org_Price : 13.90
             * Price : 8.9
             * IsTmall : 1
             * Sales_num : 3611
             * Dsr : 4.8
             * SellerID : 2455190501
             * Commission : 30.50
             * Commission_jihua : 30.50
             * Commission_queqiao : 0.00
             * Jihua_link : http://pub.alimama.com/myunion.htm?spm=a220o.1000855.0.0.2lMna4#!/promo/self/campaign?campaignId=8040640&shopkeeperId=110577870&userNumberId=2455190501
             * Introduce : 创意个性风格带勺子情侣款，甜蜜搞怪马克杯，办公室，居家各种场合衬托出不一样效果，独特创意引领潮流。
             * Quan_id : b1187944afb24023978591b0c2762f5f
             * Quan_price : 5.00
             * Quan_time : 2016-11-28 00:00:00
             * Quan_surplus : 3068
             * Quan_receive : 6932
             * Quan_condition : 单笔满12元可用，每人限领2 张
             * Quan_link : http://shop.m.taobao.com/shop/coupon.htm?seller_id=2455190501&activity_id=b1187944afb24023978591b0c2762f5f
             * Quan_m_link : http://dwz.cn/4FhVr7
             * ali_click : https://detail.tmall.com/item.htm?id=45327309639
             */

            private String GoodsID;
            private String Title;
            private String D_title;
            private String Pic;
            private String Cid;
            private String Org_Price;
            private double Price;
            private String IsTmall;
            private String Sales_num;
            private String Dsr;
            private String SellerID;
            private String Commission;
            private String Commission_jihua;
            private String Commission_queqiao;
            private String Jihua_link;
            private String Introduce;
            private String Quan_id;
            private String Quan_price;
            private String Quan_time;
            private String Quan_surplus;
            private String Quan_receive;
            private String Quan_condition;
            private String Quan_link;
            private String Quan_m_link;
            private String ali_click;

            public String getGoodsID() {
                return GoodsID;
            }

            public void setGoodsID(String GoodsID) {
                this.GoodsID = GoodsID;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getD_title() {
                return D_title;
            }

            public void setD_title(String D_title) {
                this.D_title = D_title;
            }

            public String getPic() {
                return Pic;
            }

            public void setPic(String Pic) {
                this.Pic = Pic;
            }

            public String getCid() {
                return Cid;
            }

            public void setCid(String Cid) {
                this.Cid = Cid;
            }

            public String getOrg_Price() {
                return Org_Price;
            }

            public void setOrg_Price(String Org_Price) {
                this.Org_Price = Org_Price;
            }

            public double getPrice() {
                return Price;
            }

            public void setPrice(double Price) {
                this.Price = Price;
            }

            public String getIsTmall() {
                return IsTmall;
            }

            public void setIsTmall(String IsTmall) {
                this.IsTmall = IsTmall;
            }

            public String getSales_num() {
                return Sales_num;
            }

            public void setSales_num(String Sales_num) {
                this.Sales_num = Sales_num;
            }

            public String getDsr() {
                return Dsr;
            }

            public void setDsr(String Dsr) {
                this.Dsr = Dsr;
            }

            public String getSellerID() {
                return SellerID;
            }

            public void setSellerID(String SellerID) {
                this.SellerID = SellerID;
            }

            public String getCommission() {
                return Commission;
            }

            public void setCommission(String Commission) {
                this.Commission = Commission;
            }

            public String getCommission_jihua() {
                return Commission_jihua;
            }

            public void setCommission_jihua(String Commission_jihua) {
                this.Commission_jihua = Commission_jihua;
            }

            public String getCommission_queqiao() {
                return Commission_queqiao;
            }

            public void setCommission_queqiao(String Commission_queqiao) {
                this.Commission_queqiao = Commission_queqiao;
            }

            public String getJihua_link() {
                return Jihua_link;
            }

            public void setJihua_link(String Jihua_link) {
                this.Jihua_link = Jihua_link;
            }

            public String getIntroduce() {
                return Introduce;
            }

            public void setIntroduce(String Introduce) {
                this.Introduce = Introduce;
            }

            public String getQuan_id() {
                return Quan_id;
            }

            public void setQuan_id(String Quan_id) {
                this.Quan_id = Quan_id;
            }

            public String getQuan_price() {
                return Quan_price;
            }

            public void setQuan_price(String Quan_price) {
                this.Quan_price = Quan_price;
            }

            public String getQuan_time() {
                return Quan_time;
            }

            public void setQuan_time(String Quan_time) {
                this.Quan_time = Quan_time;
            }

            public String getQuan_surplus() {
                return Quan_surplus;
            }

            public void setQuan_surplus(String Quan_surplus) {
                this.Quan_surplus = Quan_surplus;
            }

            public String getQuan_receive() {
                return Quan_receive;
            }

            public void setQuan_receive(String Quan_receive) {
                this.Quan_receive = Quan_receive;
            }

            public String getQuan_condition() {
                return Quan_condition;
            }

            public void setQuan_condition(String Quan_condition) {
                this.Quan_condition = Quan_condition;
            }

            public String getQuan_link() {
                return Quan_link;
            }

            public void setQuan_link(String Quan_link) {
                this.Quan_link = Quan_link;
            }

            public String getQuan_m_link() {
                return Quan_m_link;
            }

            public void setQuan_m_link(String Quan_m_link) {
                this.Quan_m_link = Quan_m_link;
            }

            public String getAli_click() {
                return ali_click;
            }

            public void setAli_click(String ali_click) {
                this.ali_click = ali_click;
            }
        }
    }
}
