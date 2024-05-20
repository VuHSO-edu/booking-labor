package vuhso.bookinglabor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vuhso.bookinglabor.dto.BookingDto;
import vuhso.bookinglabor.form.BookingCreateForm;
import vuhso.bookinglabor.service.BookingSevice;

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
public class BookingController {
    private BookingSevice bookingService;

    @PostMapping("vuhso/bookinglabor/bookings")
    public BookingDto createBooking(@RequestBody BookingCreateForm form) {
        return bookingService.createBooking(form);
    }

    @GetMapping("vuhso/bookinglabor/bookings")
    public List<BookingDto> findAll() {
        return bookingService.findAll();
    }
}
