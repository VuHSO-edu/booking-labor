package vuhso.bookinglabor.mapper;

import vuhso.bookinglabor.dto.LaborDto;
import vuhso.bookinglabor.entity.Labor;
import vuhso.bookinglabor.form.LaborCreateForm;

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
public class LaborMapper {

    public static Labor map(LaborCreateForm form) {
        Labor labor = new Labor();
        labor.setFullName(form.getFullName());
        labor.setAddress(form.getAddress());
        labor.setPhoneNumber(form.getPhoneNumber());
        labor.setStatus(form.getStatus());
        labor.setBirthday(form.getBirthday());
        return labor;
    }

    public static LaborDto map(Labor labor) {
        var dto = new LaborDto();
        dto.setId(labor.getId());
        dto.setFullName(labor.getFullName());
        dto.setAddress(labor.getAddress());
        dto.setPhoneNumber(labor.getPhoneNumber());
        dto.setStatus(labor.getStatus());
        dto.setBirthday(labor.getBirthday());
        return dto;
    }
}
