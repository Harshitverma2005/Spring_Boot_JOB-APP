package com.example.spring_boot_rest_jobapp.Config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_rest_jobapp.model.JobPost;
import com.example.spring_boot_rest_jobapp.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;
     
    @GetMapping("/allJobs")
   
    public List<JobPost> getAlljobs(){

        return service.getAllJobs();
    }

    @GetMapping("Job/{postID}")
    public JobPost job (@PathVariable int postID)
    {
        return service.job(postID);
    }

    @PostMapping("allJobs")
    public JobPost addJob(@RequestBody JobPost jobPost)
    {
      service.addJob(jobPost);
      return service.job(jobPost.getPostId());
    }


    @PutMapping("allJobs")
    public JobPost updateJob(@RequestBody JobPost jobPost)
    {
        service.updateJob(jobPost);
        return service.job(jobPost.getPostId());
    }

    @DeleteMapping("Job/{postID}")
    public String deleteJob (@PathVariable int postID)
    {
        service.deleteJob(postID);
        return "Deleted SuccessFully";

    }

    @GetMapping("/load")
    public String load ()
    {

        service.load();
        return "Succeeded to load data" ;
    }

    @GetMapping("job/keyword/{keyword}")
    public List<JobPost> jobByKeyword(@PathVariable String keyword) {
        return service.search(keyword);
    }



}
