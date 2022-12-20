package repositories.order

import aggregates.order.OrderStatus

interface OrderStatusRepository {
    fun getOrderStatusByOrderId(orderId: String): List<OrderStatus>
}