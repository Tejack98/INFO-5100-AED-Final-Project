/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.person;

import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }
    
    public Person createAndAddDonor(String personName, long contactNumber){
        Person person = new Person();
        person.setPersonName(personName);
        person.setContactNumber(contactNumber);
        personList.add(person);
        return person;
    }
    
    public Person createAndAddPerson(String personName, String address, String city, String state, long zipcode, long contactNumber){
        Person person = new Person();
        person.setPersonName(personName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZipcode(zipcode);
        person.setContactNumber(contactNumber);
        personList.add(person);
        return person;
    }
    
    public Person createAndAddPersonAdmin(String personName){
        Person person = new Person();
        person.setPersonName(personName);
        personList.add(person);
        return person;
    }
    
    
    public void removePerson(Person person){
        personList.remove(person);
    }
    
}
