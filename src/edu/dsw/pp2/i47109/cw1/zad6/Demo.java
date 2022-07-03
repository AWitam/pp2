package edu.dsw.pp2.i47109.cw1.zad6;

public class Demo {
    public static void main (String[] args) {
        // Zadanie 6 - Wzorzec builder
        Osoba tajnyAgent = Osoba.builder()
                .imie("James")
                .nazwisko("Bond")
                .telefon("507-007-007")
                .email("007@sis.gov.uk")
                .opis("Agent do zadań specjalnych")
                .build();

        System.out.println(tajnyAgent);

        // rzuci wyjatek
        Osoba bot = Osoba.builder().imie("bot").nazwisko("xyz").telefon("123").email("fake.com").build();
        System.out.println(bot);
    }
}
