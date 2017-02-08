package com.sky.sky.listviewandlistview.bean;

import java.util.List;

/**
 * Created by BlueSky on 17/2/6.
 */

public class DataResult {

    /**
     * error : false
     * results : [{"_id":1,"title":"今日特价","foodList":[{"ID":101,"foodName":"巧克力101","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":102,"foodName":"巧克力102","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":103,"foodName":"巧克力103","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":104,"foodName":"巧克力104","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":105,"foodName":"巧克力105","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":106,"foodName":"巧克力106","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":107,"foodName":"巧克力107","foodPrice":22.5,"salesCount":101,"imageUrl":"1"}],"type":"Android","desc":""},{"_id":2,"title":"新品推荐","foodList":[{"ID":201,"foodName":"小鲜肉201","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":202,"foodName":"小鲜肉202","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":203,"foodName":"小鲜肉203","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":204,"foodName":"小鲜肉204","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":205,"foodName":"小鲜肉205","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":3,"title":"精选水果","foodList":[{"ID":301,"foodName":"海南香蕉301","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":302,"foodName":"海南香蕉302","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":303,"foodName":"海南香蕉303","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":304,"foodName":"海南香蕉304","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":305,"foodName":"海南香蕉305","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":306,"foodName":"海南香蕉306","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":4,"title":"鲜切果盘","foodList":[{"ID":"401","foodName":"ssss401","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":"402","foodName":"ssss402","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":"403","foodName":"ssss403","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":"404","foodName":"ssss404","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":5,"title":"精品干过","foodList":[{"ID":501,"foodName":"金钩大蜜女501","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":502,"foodName":"金钩大蜜女502","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":503,"foodName":"金钩大蜜女503","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":504,"foodName":"金钩大蜜女504","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":505,"foodName":"金钩大蜜女505","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":506,"foodName":"金钩大蜜女506","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":6,"title":"精品零食","foodList":[{"ID":601,"foodName":"三只老鼠601","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":602,"foodName":"三只老602","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":603,"foodName":"三只老鼠603","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":604,"foodName":"三只老鼠604","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""},{"_id":7,"title":"礼品专区","foodList":[{"ID":701,"foodName":"进店1则701","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":702,"foodName":"进店1则702","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":703,"foodName":"进店1则703","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":704,"foodName":"进店1则704","foodPrice":101,"salesCount":101,"imageUrl":101},{"ID":705,"foodName":"进店1则705","foodPrice":101,"salesCount":101,"imageUrl":101}],"type":"Android","desc":""}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 1
         * title : 今日特价
         * foodList : [{"ID":101,"foodName":"巧克力101","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":102,"foodName":"巧克力102","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":103,"foodName":"巧克力103","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":104,"foodName":"巧克力104","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":105,"foodName":"巧克力105","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":106,"foodName":"巧克力106","foodPrice":22.5,"salesCount":101,"imageUrl":"1"},{"ID":107,"foodName":"巧克力107","foodPrice":22.5,"salesCount":101,"imageUrl":"1"}]
         * type : Android
         * desc :
         */

        private int _id;
        private String title;
        private String type;
        private String desc;
        private List<FoodListBean> foodList;

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public List<FoodListBean> getFoodList() {
            return foodList;
        }

        public void setFoodList(List<FoodListBean> foodList) {
            this.foodList = foodList;
        }

        public static class FoodListBean {
            /**
             * ID : 101
             * foodName : 巧克力101
             * foodPrice : 22.5
             * salesCount : 101
             * imageUrl : 1
             */

            private int ID;
            private String foodName;
            private double foodPrice;
            private int salesCount;
            private String imageUrl;

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public String getFoodName() {
                return foodName;
            }

            public void setFoodName(String foodName) {
                this.foodName = foodName;
            }

            public double getFoodPrice() {
                return foodPrice;
            }

            public void setFoodPrice(double foodPrice) {
                this.foodPrice = foodPrice;
            }

            public int getSalesCount() {
                return salesCount;
            }

            public void setSalesCount(int salesCount) {
                this.salesCount = salesCount;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }
        }
    }
}
