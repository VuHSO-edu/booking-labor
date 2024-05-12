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
        Customer customer = new Customer();
        customer.setFull_name(form.getFull_name());
        customer.setIdent_code(form.getIdent_code());
        customer.setAddress(form.getAddress());
        customer.setPhone_number(form.getPhone_number());
        customer.setBirthday_customer(form.getBirthday_customer());
        return customer;
    }

    public static CustomerDto map(Customer customer) {
        CustomerDto dto = new CustomerDto();
        dto.setId(customer.getId());
        dto.setFull_name(customer.getFull_name());
        dto.setIdent_code(customer.getIdent_code());
        dto.setAddress(customer.getAddress());
        dto.setPhone_number(customer.getPhone_number());
        dto.setBirthday_customer(customer.getBirthday_customer());
        return dto;
    }


}
