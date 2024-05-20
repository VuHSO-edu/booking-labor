package vuhso.bookinglabor.service;

import vuhso.bookinglabor.dto.JobDto;
import vuhso.bookinglabor.form.JobCreateForm;

import java.util.List;

public interface JobService {
    JobDto createJob(JobCreateForm form);

    List<JobDto> findAll();
}
