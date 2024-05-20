package vuhso.bookinglabor.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vuhso.bookinglabor.dto.BookingDto;
import vuhso.bookinglabor.entity.Booking;
import vuhso.bookinglabor.form.BookingCreateForm;
import vuhso.bookinglabor.mapper.BookingMapper;
import vuhso.bookinglabor.repository.BookingRepository;

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
public class BookingServiceImpl implements BookingSevice {
    private BookingRepository bookingRepository;

    @Override
    public BookingDto createBooking(BookingCreateForm form) {
        var booking = BookingMapper.map(form);
        var saveBooking = bookingRepository.save(booking);
        return BookingMapper.map(saveBooking);
    }

    @Override
    public List<BookingDto> findAll() {
        var dtos = new LinkedList<BookingDto>();

        for (Booking booking : bookingRepository.findAll()) {
            dtos.add(BookingMapper.map(booking));
        }
        return dtos;
    }
}
