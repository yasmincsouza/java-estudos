package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Enumeracao {
    public static void main(String[] args){
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        //Conversão de String para enum
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
