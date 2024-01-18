package org.simple;

import org.simple.dto.Note;
import org.simple.dto.Person;
import org.simple.manager.CustomEntityManager;
import org.simple.manager.CustomEntityManagerFactory;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "[USER]";
        String password = "[PASSWORD]";

        CustomEntityManagerFactory entityManagerFactory = new CustomEntityManagerFactory(url, user, password);

        try (CustomEntityManager customEntityManager = entityManagerFactory.createEntityManager()) {
            Person foundPerson = customEntityManager.findById(Person.class, 1);
            System.out.println("foundPerson = " + foundPerson);
            Person foundPerson2 = customEntityManager.findById(Person.class, 1);
            System.out.println("foundPerson2 = " + foundPerson2);

            Note note1 = customEntityManager.findById(Note.class, "SUPER_ID_1");
            System.out.println("note1 = " + note1);
            Note note2 = customEntityManager.findById(Note.class, "SUPER_ID_2");
            System.out.println("note2 = " + note2);
            Note note1Cache = customEntityManager.findById(Note.class, "SUPER_ID_1");
            System.out.println("note1Cache = " + note1Cache);
        }
    }
}
