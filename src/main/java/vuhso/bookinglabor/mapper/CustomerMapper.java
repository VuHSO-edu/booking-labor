package vuhso.bookinglabor.mapper;

import vuhso.bookinglabor.dto.CustomerDto;
import vuhso.bookinglabor.entity.Customer;
import vuhso.bookinglabor.form.CustomerCreateForm;

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
public class CustomerMapper {

    public static Customer map(CustomerCreateForm form) {
        var customer = new Customer();
        customer.setFullName(form.getFullName());
        customer.setIdentCode(form.getIdentCode());
        customer.setAddress(form.getAddress());
        customer.setPhoneNumber(form.getPhoneNumber());
        customer.setBirthdayCustomer(form.getBirthdayCustomer());
        return customer;
    }

    public static CustomerDto map(Customer customer) {
        var dto = new CustomerDto();
        dto.setId(customer.getId());
        dto.setFullName(customer.getFullName());
        dto.setIdentCode(customer.getIdentCode());
        dto.setAddress(customer.getAddress());
        dto.setPhoneNumber(customer.getPhoneNumber());
        dto.setBirthdayCustomer(customer.getBirthdayCustomer());
        return dto;
    }


}
