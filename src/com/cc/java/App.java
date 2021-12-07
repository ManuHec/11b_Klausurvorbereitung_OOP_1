package com.cc.java;

public class App {

    public static void main(String[] args) {

        // test --> Referenzvaribale / RAM- Adresse des Objekts/Instanz
        // Test --> Referenztype ( reference type) // Sicht von außen
        // <--> Instanz // sicht von innen

        Test test = new Test();
        System.out.println("Referenzvariable: + test");
        test.showAddresse();

    }

}
