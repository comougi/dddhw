package repositories.order

import aggregates.order.Order
import java.util.*

class OrderRepositoryImpl : OrderRepository {
    override fun getOrderById(orderId: String): Order {
        //get order from db or server
        return /*mock*/ object : Order {
            override val id: String = UUID.randomUUID().toString()
        }
    }
}