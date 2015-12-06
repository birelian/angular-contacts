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

package net.birelian.angular_contacts.rest;

import net.birelian.angular_contacts.model.Contact;
import net.birelian.angular_contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/")
class ContactController {

    @Autowired
    private
    ContactService contactService;

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public Collection<Contact> getAll() {

        System.out.println("getAll");
        return contactService.findAll();
    }

    @RequestMapping(value = "contacts/{id}", method = RequestMethod.GET)
    public Contact getById(@PathVariable Integer id) {

        System.out.println("getById -> " + id);
        return contactService.findOne(id);
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public
    @ResponseBody
    Contact saveContact(@RequestBody Contact contact) {

        System.out.println("saveContact " + contact);
        contactService.saveContact(contact);

        return contact;
    }

    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Integer id) {

        System.out.println("deleteById -> " + id);
        contactService.delete(id);
    }

}
