package com.pluralsight.fulfillmentcenterone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;

@XmlRootElement
public class OrderRequest {

   private List<Order> orders;

   public OrderRequest() {

   }

   public OrderRequest(List<Order> orders) {
      super();
      this.orders = orders;
   }

   /**
    * @return the orders
    */
   public List<Order> getOrders() {
      return orders;
   }

   /**
    * @param orders
    *           the orders to set
    */
   public void setOrders(List<Order> orders) {
      this.orders = orders;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("OrderRequest [");
      if (orders != null) {
         builder.append("orders=");
         builder.append(orders);
      }
      builder.append("]");
      return builder.toString();
   }

   public static void main(String[] args) {
      OrderItem orderItem = new OrderItem("1234", new BigDecimal(12.33), 5);
      List<OrderItem> orderItems = new ArrayList<OrderItem>();
      orderItems.add(orderItem);
      Order order = new Order("Tester", "Test", "test@test.com", "1234", new Date(
            System.currentTimeMillis()), orderItems);
      List<Order> orders = new ArrayList<Order>();
      orders.add(order);
      OrderRequest orderRequest = new OrderRequest(orders);
      System.err.println(new Gson().toJson(orderRequest));
   }

}
