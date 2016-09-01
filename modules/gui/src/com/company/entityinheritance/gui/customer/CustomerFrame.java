package com.company.entityinheritance.gui.customer;

import com.company.entityinheritance.entity.Customer;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;

public class CustomerFrame extends AbstractFrame {

    @Inject
    private Datasource<Customer> customerDs;

    public void setCustomer(Customer customer) {
        customerDs.setItem(customer);
    }
}