package edu.dsw.pp2.i47109.cw1.zad6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Osoba {
    private final String imie;
    private final String nazwisko;
    private final String telefon;
    private final String email;
    private final String opis;

    private Osoba(Builder builder) {
        this.imie = builder.imie;
        this.nazwisko = builder.nazwisko;
        this.telefon = builder.telefon;
        this.email = builder.email;
        this.opis = builder.opis;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Osoba: " + this.imie + ", " + this.nazwisko + ", " + this.telefon + ", " + this.email + ", " + this.opis;
    }

    public static final class Builder {
        private String imie;
        private String nazwisko;
        private String telefon;
        private String email;
        private String opis;

        public Builder imie(String imie) {
            this.imie = imie;
            return this;
        }

        public Builder nazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder telefon(String telefon) {
            this.telefon = telefon;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder opis(String opis) {
            this.opis = opis;
            return this;
        }

        public Osoba build() throws IllegalStateException {
            Osoba osoba = new Osoba(this);
            validate(osoba);
            return osoba;
        }

        private void validate(Osoba osoba) {
            if (osoba.imie == null) {
                throw new IllegalStateException("Imie nie może być puste");
            }

            if (osoba.nazwisko == null) {
                throw new IllegalStateException("Nazwisko nie może być puste");
            }

            validatePhone(osoba.telefon);
            validateEmail(osoba.email);

        }

        private void validateEmail(String email) {
            if (!email.contains("@")) {
                throw new IllegalStateException("Adres email musi zawierać znak @");
            }
        }

        private void validatePhone(String telefon) {
            Pattern pattern = Pattern.compile("\\d{3}[-]\\d{3}[-]\\d{3}");
            Matcher matcher = pattern.matcher(telefon);
            if (!matcher.matches()) {
                throw new IllegalStateException("Wymagany format numeru telefonu to: xxx-xxx-xxx");
            }
        }
    }
}
