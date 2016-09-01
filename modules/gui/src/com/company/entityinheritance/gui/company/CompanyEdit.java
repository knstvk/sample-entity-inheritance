package com.company.entityinheritance.gui.company;

import com.company.entityinheritance.entity.Company;
import com.company.entityinheritance.gui.customer.CustomerFrame;
import com.haulmont.cuba.gui.components.AbstractEditor;

import javax.inject.Inject;

public class CompanyEdit extends AbstractEditor<Company> {

    @Inject
    private CustomerFrame customerFrame;

    @Override
    protected void postInit() {
        customerFrame.setCustomer(getItem());
    }
}