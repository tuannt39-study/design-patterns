package vn.sapo.pattern.dto.javadesignpatterns;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerClientApp {

    public static void main(String[] args) {
        var customerResource = new CustomerResource(new ArrayList<>());
        customerResource.add(new CustomerDto(1, "a", "a"));
        customerResource.add(new CustomerDto(2, "b", "b"));
        customerResource.add(new CustomerDto(3, "c", "c"));
        customerResource.delete(2);
        var allCustomers = customerResource.getAll();
        printCustomerDetails(allCustomers);
    }

    private static void printCustomerDetails(List<CustomerDto> customerDtos) {
        customerDtos.forEach(customer -> log.debug(String.valueOf(customer.getId())));
    }

}
