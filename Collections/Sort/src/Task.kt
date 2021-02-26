// Return a list of customers, sorted in the descending by number of orders they have made
fun Shop.getCustomersSortedByOrders() =
        this.customers.sortedByDescending { it.orders.size }.toList()
