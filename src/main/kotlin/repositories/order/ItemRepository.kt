package repositories.order

import aggregates.order.Item

interface ItemRepository {
    fun getItemsByOrderId(orderId: String): List<Item>
}