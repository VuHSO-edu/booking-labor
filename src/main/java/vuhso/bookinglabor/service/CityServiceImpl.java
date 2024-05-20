package vuhso.bookinglabor.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vuhso.bookinglabor.dto.CityDto;
import vuhso.bookinglabor.entity.City;
import vuhso.bookinglabor.form.CityCreateForm;
import vuhso.bookinglabor.mapper.CityMapper;

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
public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    @Override
    public CityDto createCity(CityCreateForm form) {
        var city = CityMapper.map(form);
        var saveCity = cityRepository.save(city);
        return CityMapper.map(saveCity);
    }

    @Override
    public List<CityDto> findAll() {
        var dtos = new LinkedList<CityDto>();

        for (City city : cityRepository.findAll()) {
            dtos.add(CityMapper.map(city));
        }

        return dtos;
    }
}
