package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Тима");
        Person person1 = new Person("Айба");
        Person person2 = new Person("Нурчи");
        Person person3 = new Person("Алмаз");
        Person person4 = new Person("Захид");
        Person person5 = new Person("Мухаммед");
        Person person6 = new Person("Бекжан");
        Person person7 = new Person("Макс");
        Person person8 = new Person("Улан");
        Person person9 = new Person("Садыр");
        Person[] flats = {person, person1, person2, person3};
        Person[] hostel = {person4, person5, person6};
        Person[] hotels = {person7, person8, person9};
        int counter = 0;
        for (Person a : flats) {
            counter++;
        }

        int counter1 = 0;
        for (Person b : hostel) {
            counter1++;
        }
        int counter2 = 0;
        for (Person c : hotels) {
            counter2++;
        }
        Flat flat = new Flat("Киевская №56", 5000, flats);
        System.out.println(flat);
        System.out.println(" проживают: " + counter + " человек");
        flat.toMakePayment();
        System.out.println("_____________________________________________________");

        Hostels hostels = new Hostels(hostel, "Чуйская № 433", 4500);
        System.out.println(hostels);
        System.out.println(" проживают: " + counter1 + " человек");
        hostels.toMakePayment();
        System.out.println("_________________________________________________________________");

        Hotel hotel = new Hotel(hotels, "Жукеева - Пудовкина № 28", 12000);
        System.out.println(hotel);
        System.out.println(" проживают: " + counter2 + " человек");
        hotel.toMakePayment();

    }
    }

