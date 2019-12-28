package br.com.mateuspada.dsl

import java.time.LocalDate.now

fun main() {
    val adresses = mutableListOf<Address>()

    adresses.add(Address("street", 1, "citt"))
    adresses.add(Address("street2", 2, "cidade2"))

    val person = Person("name", now(), adresses)

    println(person)
}