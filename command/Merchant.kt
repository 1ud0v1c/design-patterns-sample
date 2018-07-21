class Merchant {
	var orders = ArrayList<Order>() 

	fun takeOrder(order: Order) {
		orders.add(order)
	}

	fun placeOrders() {
		for (order in orders) {
			order.execute()
		}
		orders.clear()
	}
}
