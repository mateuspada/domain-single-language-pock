package br.com.mateuspada.dsl

import java.time.LocalDate
import java.time.LocalDate.now
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofPattern

//fun person(block: Person.() -> Unit) = Person().apply(block)
//
//fun Person.address(block: Address.() -> Unit) {
//    address = Address().apply(block)
//}

fun person(block: PersonBuilder.() -> Unit): Person = PersonBuilder().apply(block).build()

class PersonBuilder {

    var name: String = ""

    private var dob: LocalDate = now()
    var dateOfBirth: String = ""
        set(value) {
            dob = LocalDate.parse(value, ofPattern("yyyy-MM-dd"))
        }

    private val addresses = mutableListOf<Address>()

    fun addresses(block: ADDRESSES.() -> Unit) {
        addresses.addAll(ADDRESSES().apply(block))
    }

    fun build(): Person = Person(name, dob, addresses)

}

class ADDRESSES: ArrayList<Address>() {
    fun address(block: AddressBuilder.() -> Unit) {
        add(AddressBuilder().apply(block).build())
    }
}

class AddressBuilder {

    var street: String = ""
    var number: Int = 0
    var city: String = ""

    fun build() : Address = Address(street, number, city)

}