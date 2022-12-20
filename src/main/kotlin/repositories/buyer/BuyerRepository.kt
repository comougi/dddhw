package repositories.buyer

import aggregates.buyer.Buyer

interface BuyerRepository {
    fun getBuyerById(buyerId: String): Buyer
}
