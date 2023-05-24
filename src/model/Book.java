package model;

import Exceptions.ContactNotFoundException;
import Exceptions.NoNameException;

import java.security.Key;
import java.util.TreeMap;
import java.util.random.RandomGenerator;

public class Book {

    private TreeMap<String, Person> contactTreeMap;
    private int contactQuantity;


    public Book ()
    {
        contactTreeMap = new TreeMap<>();
        contactQuantity = 0;
    }


    public void addPerson(Person person)
    {
        contactTreeMap.put(person.getName(), person);
        contactTreeMap.put(person.getPhoneNumber(), person);
        contactQuantity++;

    }

    public Person searchPerson (String key)throws NoNameException, ContactNotFoundException
    {
        if(key.isEmpty())
        {
            throw new NoNameException("You have not a name.");

        }
        Person person;
         if (contactTreeMap.containsKey(key))
        {
            person = contactTreeMap.get(key);
        }
        else{
            throw new ContactNotFoundException("Not found, sorry.");

            }
        return person;
    }

    public int getContactQuantity()
    {
        return contactQuantity;
    }

    private TreeMap<String, Person> getContactTreeMap() {
        return contactTreeMap;
    }

    private void setContactTreeMap(TreeMap<String, Person> contactTreeMap) {
        this.contactTreeMap = contactTreeMap;
    }
}
