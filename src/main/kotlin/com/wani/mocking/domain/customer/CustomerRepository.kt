package com.wani.mocking.domain.customer

import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long> {

    fun findCustomerByName(name: String): Customer?
}