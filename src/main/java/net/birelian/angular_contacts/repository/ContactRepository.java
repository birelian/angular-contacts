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

package net.birelian.angular_contacts.repository;

import net.birelian.angular_contacts.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

    List<Contact> findByName(String name);
    List<Contact> findBySurname(String surname);
    List<Contact> findByPhone(String phone);
    List<Contact> findByEmail(String email);
}