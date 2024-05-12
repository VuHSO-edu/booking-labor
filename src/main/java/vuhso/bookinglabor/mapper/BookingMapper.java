package vuhso.bookinglabor.mapper;

import vuhso.bookinglabor.dto.BookingDto;
import vuhso.bookinglabor.entity.Booking;
import vuhso.bookinglabor.form.BookingCreateForm;

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
public class BookingMapper {

    public static Booking map(BookingCreateForm form) {
        Booking booking = new Booking();
        booking.setAccept(form.getAccept());
        booking.setStatus(form.getStatus());
        booking.setTotal_price(form.getTotal_price());
        booking.setBook_address(form.getBook_address());
        booking.setMessage(form.getMessage());
        booking.setCity_name(form.getCity_name());
        return booking;
    }

    public static BookingDto map(Booking booking) {
        var dto = new BookingDto();
        dto.setId(booking.getId());
        dto.setAccept(booking.getAccept());
        dto.setStatus(booking.getStatus());
        dto.setTotal_price(booking.getTotal_price());
        dto.setBook_address(booking.getBook_address());
        dto.setMessage(booking.getMessage());
        dto.setCity_name(booking.getCity_name());
        dto.setCheckin(booking.getCheckin());
        dto.setCheckout(booking.getCheckout());
        dto.setCancel_time(booking.getCancel_time());
        return dto;
    }

}
