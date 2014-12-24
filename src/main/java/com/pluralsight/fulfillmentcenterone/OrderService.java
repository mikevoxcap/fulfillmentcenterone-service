package com.pluralsight.fulfillmentcenterone;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "orders" path)
 */
@Path("orderFulfillment")
public class OrderService {

   /**
    * Processing an order request.
    * 
    * @param orderRequest
    * @return
    */
   @POST
   @Path("processOrders")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public FulfillmentResponse processOrders(OrderRequest orderRequest) {
      System.err.println(orderRequest);
      FulfillmentResponse response = new FulfillmentResponse(200, "Success!");
      return response;
   }
}
