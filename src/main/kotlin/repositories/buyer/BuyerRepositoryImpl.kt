package repositories.buyer

import aggregates.buyer.Buyer
import kotlin.random.Random

class BuyerRepositoryImpl : BuyerRepository {
    override fun getBuyerById(buyerId: String): Buyer {
        //get buyer from db or server
        return /*mock*/ object : Buyer {
            override val id: String = buyerId
            override val name: String = Random.nextBytes(16).decodeToString()
            override val age: Int = Random.nextInt(18, 60)
        }
    }
}