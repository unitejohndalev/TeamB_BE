package teamb.com.teamb.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import teamb.com.teamb.Model.CourseModel;


@RestController 
public class CourseController {


    @GetMapping("/courses")
    public String getCourses () {
        return "displaying the list of Courses";
    }

    @GetMapping("/courses/{id}")
    public String getCourses (@PathVariable Long id) {
        return "Fetching the courses details for the id " + id;

    }

    @PostMapping("/courses")
    public String saveCourses (@RequestBody CourseModel course) {
        return "saving the course details to the database " +course;
    }

    @DeleteMapping("/courses")
    public String deleteCourses (@RequestParam Long id) {
        return "Deleting the course details for the id " +id;

    }
}
