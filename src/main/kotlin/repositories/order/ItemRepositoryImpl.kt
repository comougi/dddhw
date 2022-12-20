package repositories.order

import aggregates.order.Item
import kotlin.random.Random

class ItemRepositoryImpl : ItemRepository {
    override fun getItemsByOrderId(orderId: String): List<Item> {
        //get items from db or server
        return listOf(
            //mocks
            object : Item {
                override val name: String = Random.nextBytes(16).decodeToString()
                override val amount: Int = Random.nextInt(0, 100)
            }
        )
    }
}