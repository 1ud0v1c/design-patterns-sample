fun main(args : Array<String>) { 
	val buyStockOrder = BuyStock(Stock("guitar", 1))
	val sellStockOrder = SellStock(Stock("book", 2))

	val merchant =  Merchant() 
	merchant.takeOrder(buyStockOrder)
	merchant.takeOrder(sellStockOrder)
	merchant.placeOrders()
}
