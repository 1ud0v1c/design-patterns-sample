data class BuyStock(val stock: Stock): Order {
	override fun execute() {
		stock.buy()	
	}
}
