package vuhso.bookinglabor.mapper;

import vuhso.bookinglabor.dto.JobDto;
import vuhso.bookinglabor.entity.Job;
import vuhso.bookinglabor.form.JobCreateForm;

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
public class JobMapper {

    public static Job map(JobCreateForm form) {
        Job job = new Job();
        job.setNameJod(form.getNameJod());
        job.setImageJob(form.getImageJob());
        job.setDescription(form.getDescription());
        job.setPrice(form.getPrice());
        return job;
    }

    public static JobDto map(Job job) {
        var dto = new JobDto();
        dto.setId(job.getId());
        dto.setNameJod(job.getNameJod());
        dto.setImageJob(job.getImageJob());
        dto.setDescription(job.getDescription());
        dto.setPrice(job.getPrice());
        return dto;
    }
}
