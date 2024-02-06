package teamb.com.teamb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import teamb.com.teamb.Model.Course;
import teamb.com.teamb.Service.CourseService;


@RestController 
// @RequestMapping("/api/instructors") //localhost:8080/api/instructor/courses
public class CourseController {

    @Autowired
    private CourseService cService;

    @GetMapping("/courses")
    public List<Course> getCourses () {
        return cService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public String getCourses (@PathVariable Long id) {
        return "Fetching the courses details for the id " + id;

    }

    @PostMapping("/courses")
    public String saveCourses (@RequestBody Course course) {
        return "saving the course details to the database " +course;
    }

    @PutMapping("/courses/{id}")
    public Course updateCourse (@PathVariable Long id, @RequestBody Course course) {
        System.out.println("updating the course data for the id " +id);
        return course;
    }

    @DeleteMapping("/courses")
    public String deleteCourses (@RequestParam Long id) {
        return "Deleting the course details for the id " +id;

    }
}
