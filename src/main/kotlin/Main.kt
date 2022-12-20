import factories.buyer.BuyerFactory
import factories.buyer.BuyerFactoryImpl
import factories.order.OrderFactory
import factories.order.OrderFactoryImpl
import repositories.buyer.*
import repositories.order.*
import java.util.*

fun main() {

    val buyerRepository: BuyerRepository = BuyerRepositoryImpl()
    val cardTypeRepository: CardTypeRepository = CardTypeRepositoryImpl()
    val paymentMethodRepository: PaymentMethodRepository = PaymentMethodRepositoryImpl()

    val addressRepository: AddressRepository = AddressRepositoryImpl()
    val itemRepository: ItemRepository = ItemRepositoryImpl()
    val orderRepository: OrderRepository = OrderRepositoryImpl()
    val orderStatusRepository: OrderStatusRepository = OrderStatusRepositoryImpl()

    val buyerFactory: BuyerFactory = BuyerFactoryImpl(buyerRepository, cardTypeRepository, paymentMethodRepository)
    val orderFactory: OrderFactory =
        OrderFactoryImpl(addressRepository, itemRepository, orderRepository, orderStatusRepository)

    val buyer = buyerFactory.createBuyer(UUID.randomUUID().toString())
    val order = orderFactory.createOrder(UUID.randomUUID().toString())

}
