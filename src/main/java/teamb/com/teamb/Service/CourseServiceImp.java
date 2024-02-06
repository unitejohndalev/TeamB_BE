package teamb.com.teamb.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import teamb.com.teamb.Model.Course;

@Service
public class CourseServiceImp implements CourseService{

    private static List<Course> list = new ArrayList<>();

static {
    Course c = new Course();
    c.setCourseTitle("Course Title 1");
    c.setCourseDescription("Course Description 1");
    c.setCourseStartDate(null);
    c.setCourseEndDate(null);
    list.add(c);

    c.setCourseTitle("Course Title 2");
    c.setCourseDescription("Course Description 2");
    c.setCourseStartDate(null);
    c.setCourseEndDate(null);
    list.add(c);
}

    @Override
    public List<Course> getCourses() {
        return list;
    }

}
