package com.example.designpatterns.structural.facade

/**
 * @author Evdokimov on 04.03.2022.
 *
 * Фасад над системой заказа
 */
class Order {

    private val delivery = Delivery()
    private val warehouse = Warehouse()
    private val supplier = Supplier()

    fun makeOrder() {
        supplier.getFromSupplier()
        delivery.deliver()
        warehouse.getFromWarehouse()
        delivery.deliver()
    }
}