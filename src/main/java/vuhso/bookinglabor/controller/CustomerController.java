package vuhso.bookinglabor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vuhso.bookinglabor.dto.CustomerDto;
import vuhso.bookinglabor.form.CustomerCreateForm;
import vuhso.bookinglabor.service.CustomerService;

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
@RestController
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @PostMapping("vuhso/bookinglabor/customers")
    public CustomerDto createCustomer(@RequestBody CustomerCreateForm form) {
        return customerService.createCustomer(form);
    }
    @GetMapping("vuhso/bookinglabor/customers")
    public List<CustomerDto> findAll() {
        return customerService.findAll();
    }
}
