package edu.uom.enex.server.dao;


import edu.uom.enex.server.entity.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Himashi Nethinika on 4/2/2016.
 */
public interface CustomerDAOController extends DAOController<Customer, String> {

    ArrayList<Customer> getSelectedCustomers(String from, String to);

    ArrayList<Customer> getCreditCustomerList();

    ArrayList<Customer> getCustomerList(String value);

    String getLastCustomerId(String type);

    List<Customer> getAllCustomerByName(String name);
}
