package vuhso.bookinglabor.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vuhso.bookinglabor.dto.JobDto;
import vuhso.bookinglabor.entity.Job;
import vuhso.bookinglabor.form.JobCreateForm;
import vuhso.bookinglabor.mapper.JobMapper;
import vuhso.bookinglabor.repository.JobRepository;

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
public class JobServiceImpl implements JobService {
    private JobRepository jobRepository;

    @Override
    public JobDto createJob(JobCreateForm form) {
        var job = JobMapper.map(form);
        var saveJob = jobRepository.save(job);
        return JobMapper.map(saveJob);
    }

    @Override
    public List<JobDto> findAll() {
        var dtos = new LinkedList<JobDto>();

        for (Job job : jobRepository.findAll()) {
            dtos.add(JobMapper.map(job));
        }

        return dtos;
    }
}
