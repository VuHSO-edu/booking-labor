package vuhso.bookinglabor.service;

import vuhso.bookinglabor.dto.JobDto;
import vuhso.bookinglabor.form.JobCreateForm;

public interface JobService {
    JobDto createJob(JobCreateForm form);
}
