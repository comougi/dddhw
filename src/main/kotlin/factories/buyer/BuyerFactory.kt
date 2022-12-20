package factories.buyer

import aggregates.buyer.BuyerRoot

interface BuyerFactory {
    fun createBuyer(buyerId: String): BuyerRoot
}