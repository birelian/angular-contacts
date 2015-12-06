/**
 * Copyright 2015 Guillermo Bauzá (birelian) - birelianATgmailDOTcom
 *
 *
 * This file is part of angularContacts.
 *
 * angularContacts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * angularContacts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with angularContacts.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package net.birelian.angular_contacts.service;

import net.birelian.angular_contacts.model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> findAll();
    List<Contact> getByName(String name);
    List<Contact> getBySurname(String surmane);
    List<Contact> getByPhone(String phone);
    List<Contact> getByEmail(String email);
    void saveContact(Contact contact);
    Contact findOne(Integer id);
    void delete(Integer id);

}
