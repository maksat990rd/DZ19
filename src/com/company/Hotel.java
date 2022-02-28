package com.company;

    import java.util.Arrays;

    public class Hotel  implements ToMakePeymentHols {
        private Person[] people;
        private String address;
        private int price;

        public Hotel(Person[] people, String address, int price) {
            this.people = people;
            this.address = address;
            this.price = price;
        }

        public Person[] getPeople() {
            return people;
        }

        public void setPeople(Person[] people) {
            this.people = people;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Hostels\n" +
                    "people: " + Arrays.toString(people) +
                    "address: " + address + '\n' ;
        }




        @Override
        public void toMakePayment() {
            System.out.println("Платят за аренду: "+price);

        }
    }
