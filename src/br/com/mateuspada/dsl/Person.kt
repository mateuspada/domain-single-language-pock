package br.com.mateuspada.dsl

import java.time.LocalDate

data class Person(
    val name: String,
    val dateOfBirth: LocalDate,
    val addresses: List<Address>
)