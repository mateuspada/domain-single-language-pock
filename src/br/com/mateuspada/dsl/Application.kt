package br.com.mateuspada.dsl

fun main() {
    val person = person {
        name = "Mateus"
        dateOfBirth = "1994-01-11"
        addresses {
            address {
                street = "Avenida Francisco Glicério"
                number = 1639
                city = "Campinas"
            }
            address {
                street = "Rua Embú"
                number = 84
                city = "Catanduva"
            }
        }
    }

    println(person)
}