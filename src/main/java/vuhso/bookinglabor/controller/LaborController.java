package vuhso.bookinglabor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vuhso.bookinglabor.dto.LaborDto;
import vuhso.bookinglabor.entity.Labor;
import vuhso.bookinglabor.form.LaborCreateForm;
import vuhso.bookinglabor.service.LaborSevice;

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
public class LaborController {
    private LaborSevice laborService;
    @PostMapping("vuhso/bookinglabor/labors")
    public LaborDto createLabor(@RequestBody LaborCreateForm form) {
        return laborService.createLabor(form);
    }

    @GetMapping("vuhso/bookinglabor/labors")
    public List<LaborDto> findAll() {
        return laborService.findAll();
    }
}
