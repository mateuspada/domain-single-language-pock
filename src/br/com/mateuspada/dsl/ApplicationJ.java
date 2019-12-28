package br.com.mateuspada.dsl;

import static br.com.mateuspada.dsl.DslKt.person;

public class ApplicationJ {
    public static void main(String[] args) {
        Person person = person(p -> {
            p.setName("Mateus");
            p.setDateOfBirth("2019-01-01");
            p.addresses(addresses -> {
                addresses.address(a -> {
                    a.setCity("Campinas");
                    a.setNumber(1639);
                    a.setStreet("Avenida Francisco Glicério");
                    return null;
                });

                addresses.address(a -> {
                    a.setCity("Campinas2");
                    a.setNumber(16392);
                    a.setStreet("Avenida Francisco Glicério2");
                    return null;
                });

                return null;
            });
            return null;
        });

        System.out.println(person);
    }
}
