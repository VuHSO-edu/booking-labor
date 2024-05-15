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
        booking.setTotalPrice(form.getTotalPrice());
        booking.setBookAddress(form.getBookAddress());
        booking.setMessage(form.getMessage());
        booking.setCityName(form.getCityName());
        booking.setCheckin(form.getCheckin());
        booking.setCheckout(form.getCheckout());
        booking.setCancelTime(form.getCancelTime());
        return booking;
    }

    public static BookingDto map(Booking booking) {
        var dto = new BookingDto();
        dto.setId(booking.getId());
        dto.setAccept(booking.getAccept());
        dto.setStatus(booking.getStatus());
        dto.setTotalPrice(booking.getTotalPrice());
        dto.setBookAddress(booking.getBookAddress());
        dto.setMessage(booking.getMessage());
        dto.setCityName(booking.getCityName());
        dto.setCheckin(booking.getCheckin());
        dto.setCheckout(booking.getCheckout());
        dto.setCancelTime(booking.getCancelTime());
        dto.setCreatedAt(booking.getCreatedAt());
        dto.setUpdatedAt(booking.getUpdatedAt());
        return dto;
    }

}
