package com.example.demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void removePerson(PersonType person) {
        personList.remove(person);
    }

    public int size(){
        return personList.size();
    }

    public void clearList() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personList){
        this.personList.addAll((Collection<? extends PersonType>) personList);
    }

    public PersonType findById(Long id) {
        for(PersonType person : personList) {
            if(person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public String toString() {
        String people = "";
        for(PersonType person : personList) {
            people += "id: " + person.getId() + "\n";
            people += "name: " + person.getName() + "\n";
        }
        return people;
    }
}
