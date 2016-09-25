package com.github.pengqiangx.demo.dp.proxy.two;

/**
 * 订单的代理对象
 */
public class OrderProxy implements OrderApi {

    /**
     * 持有被代理的具体的目标对象
     */
    private Order order = null;

    public OrderProxy(Order realSubject) {
        this.order = realSubject;
    }



    @Override
    public String getProductName() {
        return this.order.getProductName();

    }

    @Override
    public void setProductName(String productName, String user) {
        //控制访问权限,只有创建订单的人员才能够修改
        if(user != null && user.equals(this.getOrderUser())){
            order.setProductName(productName,user);
        }else{
            System.out.print("sorry,"+user+",你无权修改订单中的产品名称");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if(user != null && user.equals (this.getOrderUser()) ){
            order.setOrderNum(orderNum,user);
        }else{
            System.out.print("sorry,"+user+",你无权修改订单中的订购数量");
        }
    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user != null && user.equals (this.getOrderUser()) ){
            order.setOrderUser(orderUser,user);
        }else{
            System.out.print("sorry,"+user+",你无权修改订单中的订购人");
        }
    }

    @Override
    public String toString() {
        return "OrderProxy{" +
                "order=" + order.getOrderUser() +","+order.getProductName() + ","+ order.getOrderNum()+
                '}';
    }
}

