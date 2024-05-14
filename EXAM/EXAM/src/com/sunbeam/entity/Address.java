package com.sunbeam.entity;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Address implements Serializable {
    private String area;
    private String dist;
    private int pin;

    public Address(String area, String dist, int pin) {
        this.area = area;
        this.dist = dist;
        this.pin = pin;
    }

    // Getters and setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Area: " + area + ", District: " + dist + ", PIN: " + pin;
    }
}


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final LinkedHashSet<Person> people = new LinkedHashSet<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new person");
            System.out.println("2. Display all");
            System.out.println("3. Find by name");
            System.out.println("4. Save in file");
            System.out.println("5. Load from file");
            System.out.println("6. Display in sorted order of dist and name");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    findByName();
                    break;
                case 4:
                    saveInFile();
                    break;
                case 5:
                    loadFromFile();
                    break;
                case 6:
                    displaySorted();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }

    private static void addPerson() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (personExists(name)) {
            System.out.println("Person with the same name already exists!");
            return;
        }

        System.out.print("Enter birth date (dd/MM/yyyy): ");
        String birthDateStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate;
        try {
            birthDate = sdf.parse(birthDateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format! Please use dd/MM/yyyy.");
            return;
        }

        System.out.println("Enter address details:");
        System.out.print("Area: ");
        String area = scanner.nextLine();
        System.out.print("District: ");
        String dist = scanner.nextLine();
        System.out.print("PIN: ");
        int pin = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Address address = new Address(area, dist, pin);
        Person person = new Person(name, birthDate, address);
        people.add(person);
        System.out.println("Person added successfully!");
    }

    private static boolean personExists(String name) {
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    private static void displayAll() {
        System.out.println("All People:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void findByName() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                System.out.println("Person found:");
                System.out.println(person);
                return;
            }
        }
        System.out.println("Person not found!");
    }

    private static void saveInFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.ser"))) {
            oos.writeObject(people);
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while saving data: " + e.getMessage());
        }
    }

    private static void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.ser"))) {
            @SuppressWarnings("unchecked")
            LinkedHashSet<Person> loadedPeople = (LinkedHashSet<Person>) ois.readObject();
            people.clear();
            people.addAll(loadedPeople);
            System.out.println("Data loaded successfully!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while loading data: " + e.getMessage());
        }
    }

    private static void displaySorted() {
        List<Person> sortedPeople = new ArrayList<>(people);
        Collections.sort(sortedPeople, Comparator.comparing(Person::getHomeAddr, Comparator.comparing(Address::getDist)).thenComparing(Person::getName));
        System.out.println("People sorted by District and Name:");
        for (Person person : sortedPeople) {
            System.out.println(person);
        }
    }
}
