/**
 * Copyright 2015 Guillermo Bauzá (birelian) - birelianATgmailDOTcom
 * <p>
 * <p>
 * This file is part of angularContacts.
 * <p>
 * angularContacts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * angularContacts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with angularContacts.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.birelian.angular_contacts.service;

import net.birelian.angular_contacts.model.Contact;
import net.birelian.angular_contacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private
    ContactRepository contactRepository;

    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public List<Contact> getByName(String name) {
        return contactRepository.findByName(name);
    }

    @Override
    public List<Contact> getBySurname(String surname) {
        return contactRepository.findBySurname(surname);
    }

    @Override
    public List<Contact> getByPhone(String phone) {
        return contactRepository.findByPhone(phone);
    }

    @Override
    public List<Contact> getByEmail(String email) {
        return contactRepository.findByEmail(email);
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public Contact findOne(Integer id) {
        return contactRepository.getOne(id);
    }

    @Override
    public void delete(Integer id) {
        contactRepository.delete(id);
    }
}
