package vuhso.bookinglabor.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vuhso.bookinglabor.dto.CustomerDto;
import vuhso.bookinglabor.entity.Customer;
import vuhso.bookinglabor.form.CustomerCreateForm;
import vuhso.bookinglabor.mapper.CustomerMapper;
import vuhso.bookinglabor.repository.CustomerRepository;

import java.util.LinkedList;
import java.util.List;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public CustomerDto createCustomer(CustomerCreateForm form) {
        var customer = CustomerMapper.map(form);
        var saveCustomer = customerRepository.save(customer);
        return CustomerMapper.map(saveCustomer);
    }

    @Override
    public List<CustomerDto> findAll() {
        var dtos = new LinkedList<CustomerDto>();

        for (Customer customer : customerRepository.findAll()) {
            dtos.add(CustomerMapper.map(customer));
        }
        return dtos;
    }
}
