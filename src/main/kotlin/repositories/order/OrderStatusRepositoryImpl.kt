package repositories.order

import aggregates.order.DeliveryStatus
import aggregates.order.OrderStatus
import kotlin.random.Random

class OrderStatusRepositoryImpl : OrderStatusRepository {
    override fun getOrderStatusByOrderId(orderId: String): List<OrderStatus> {
        //get order statuses from db or server
        return listOf(
            //mocks
            object : OrderStatus {
                override val isPaid: Boolean = Random.nextBoolean()
                override val deliveryStatus: DeliveryStatus = DeliveryStatus.DELIVERY
            }
        )
    }
}