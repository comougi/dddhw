package aggregates.buyer

//Root
interface BuyerRoot {
    val buyer: Buyer
    val cardTypes: List<CardType>
    val paymentMethods: List<PaymentMethod>
}