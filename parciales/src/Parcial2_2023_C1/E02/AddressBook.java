package Parcial2_2023_C1.E02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBook {
    private final Map<AddressBookGroup, Map<String, Contact>> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(AddressBookGroup group, String name, String number) {
        contacts.putIfAbsent(group, new HashMap<>());
        var groupContacts = contacts.get(group);

        groupContacts.putIfAbsent(name, new Contact(name, number));
    }

    public Contact getContact(AddressBookGroup group, String name) {
        var groupContacts = contacts.get(group);
        if (groupContacts == null) {
            throw new IllegalArgumentException();
        }

        var contact = groupContacts.get(name);
        if (contact == null) {
            throw new IllegalArgumentException();
        }

        return contact;
    }

    public void renameContact(AddressBookGroup group, String oldName, String newName) {
        getContact(group, oldName).setName(newName);
    }

    public Collection<Contact> getAllContacts(AddressBookGroup group) {
        var groupContacts = contacts.get(group);
        if (groupContacts == null) {
            return new ArrayList<>();
        }

        return groupContacts.values().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public Collection<Contact> getAllContacts() {
        return contacts.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .flatMap(e -> e.getValue().values().stream().sorted())
                .collect(Collectors.toList());
    }
}
