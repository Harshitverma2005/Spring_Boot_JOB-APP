package com.example.spring_boot_rest_jobapp.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_boot_rest_jobapp.model.JobPost;

@Repository
public interface  JobRepo extends JpaRepository<JobPost,Integer > {

	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

    //using jpa repository and can say that we are extending the JpaRepository interface and using Hibernate also

}

// using simple hard code 
    // // ArrayList to store JobPost objects
    // List<JobPost> jobs = new ArrayList<>(Arrays.asList(

    //         new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
    //                 List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


    //         new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
    //                 List.of("HTML", "CSS", "JavaScript", "React")),


    //         new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
    //                 List.of("Python", "Machine Learning", "Data Analysis")),


    //         new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
    //                 List.of("Networking", "Cisco", "Routing", "Switching")),


    //         new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
    //                 List.of("iOS Development", "Android Development", "Mobile App"))
    // ));

    // // method to return all JobPosts
    // public List<JobPost> getAllJobs() {
    //     return jobs;
    // }

    // // method to save a job post object into arrayList
    // public void addJob(JobPost job) {
    //     jobs.add(job);
    //     System.out.println(jobs);

    // }


    // public JobPost job(int postID) {

    //     for (JobPost job : jobs)
    //     {
    //         if (job.getPostId()==postID)
    //         {
    //             return job;
    //         }
    //     }
    //     return null;
    // }

    // public void updateJob(JobPost jobPost) {
    //     for(JobPost jobPost1  : jobs)
    //     {
    //         if (jobPost1.getPostId()==jobPost.getPostId())
    //         {
    //             jobPost1.setPostDesc(jobPost.getPostDesc());
    //             jobPost1.setPostProfile(jobPost.getPostProfile());
    //             jobPost1.setPostTechStack(jobPost.getPostTechStack());
    //             jobPost1.setReqExperience(jobPost.getReqExperience());
    //         }
    //     }
    // }

    // public void deleteJob(int postID) {
    //     for (JobPost jobPost1 : jobs) {
    //         if (jobPost1.getPostId() == postID) {
    //             jobs.remove(jobPost1);
    //         }
    //     }
    // }

