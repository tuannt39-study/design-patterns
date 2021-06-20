package vn.sapo.pattern.dto.javadesignpatterns;

import java.util.List;

public class CustomerResource {

    private final List<CustomerDto> customers;

    public CustomerResource(List<CustomerDto> customerDtos) {
        this.customers = customerDtos;
    }

    public List<CustomerDto> getAll() {
        return customers;
    }

    public void add(CustomerDto customerDto) {
        customers.add(customerDto);
    }

    public void delete(int id) {
        customers.removeIf(customerDto -> customerDto.getId() == id);
    }

}
