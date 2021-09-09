package com.wani.mocking.domain.order

import com.wani.mocking.domain.customer.Customer
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class CustomerOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L,

    @Column(nullable = false)
    var orderDateTime: LocalDateTime,

    @Column(nullable = false)
    var address: String,

    @Column(nullable = false)
    var isGiftPackaging: Boolean,

    var memo: String,


    @OneToOne
    @JoinColumn(name = "customer_id", foreignKey = @ForeignKey(name = "FK_ORDER_CUSTOMER"))
    var customer: Customer,


) {
}