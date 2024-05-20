package vuhso.bookinglabor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vuhso.bookinglabor.dto.JobDto;
import vuhso.bookinglabor.form.JobCreateForm;
import vuhso.bookinglabor.service.JobService;

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
public class JobController {
    private JobService jobService;

    @PostMapping("vuhso/bookinglabor/jobs")
    public JobDto createJob(@RequestBody JobCreateForm form) {
        return jobService.createJob(form);
    }

    @GetMapping("vuhso/bookinglabor/jobs")
    public List<JobDto> findAll() {
        return jobService.findAll();
    }

}
