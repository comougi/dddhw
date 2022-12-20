package factories.order

import aggregates.order.*
import repositories.order.AddressRepository
import repositories.order.ItemRepository
import repositories.order.OrderRepository
import repositories.order.OrderStatusRepository

class OrderFactoryImpl(
    private val addressRepository: AddressRepository,
    private val itemRepository: ItemRepository,
    private val orderRepository: OrderRepository,
    private val orderStatusRepository: OrderStatusRepository,
) : OrderFactory {
    override fun createOrder(orderId: String): OrderRoot {
        val order = orderRepository.getOrderById(orderId)
        val items = itemRepository.getItemsByOrderId(orderId)
        val orderStatuses = orderStatusRepository.getOrderStatusByOrderId(orderId)
        val addresses = addressRepository.getAddressesByOrderId(orderId)
        return object : OrderRoot {
            override val order: Order = order
            override val items: List<Item> = items
            override val orderStatuses: List<OrderStatus> = orderStatuses
            override val addresses: List<Address> = addresses
        }
    }
}