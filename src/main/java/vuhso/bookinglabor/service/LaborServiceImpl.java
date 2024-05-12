package vuhso.bookinglabor.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vuhso.bookinglabor.dto.LaborDto;
import vuhso.bookinglabor.form.LaborCreateForm;
import vuhso.bookinglabor.mapper.LaborMapper;
import vuhso.bookinglabor.repository.LaborRepository;

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
public class LaborServiceImpl implements LaborSevice {

    private LaborRepository laborRepository;

    @Override
    public LaborDto createLabor(LaborCreateForm form) {
        var labor = LaborMapper.map(form);
        var saveLabor = laborRepository.save(labor);
        return LaborMapper.map(saveLabor);
    }
}
