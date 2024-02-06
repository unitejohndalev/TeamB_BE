package teamb.com.teamb.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseModel {

@JsonProperty("CourseTitle")
private String CourseTitle;

@JsonProperty("CourseDescription")
private String CourseDescription;

@JsonProperty("CourseStartDate")
private Date CourseStartDate;

@JsonProperty("CourseEndDate")
private Date CourseEndDate;


    @Override
    public String toString() {
        return "{" +
            " CourseTitle='" + getCourseTitle() + "'" +
            ", CourseDescription='" + getCourseDescription() + "'" +
            ", CourseStartDate='" + getCourseStartDate() + "'" +
            ", CourseEndDate='" + getCourseEndDate() + "'" +
            "}";
    }


    public String getCourseTitle() {
        return this.CourseTitle;
    }

    public void setCourseTitle(String CourseTitle) {
        this.CourseTitle = CourseTitle;
    }

    public String getCourseDescription() {
        return this.CourseDescription;
    }

    public void setCourseDescription(String CourseDescription) {
        this.CourseDescription = CourseDescription;
    }

    public Date getCourseStartDate() {
        return this.CourseStartDate;
    }

    public void setCourseStartDate(Date CourseStartDate) {
        this.CourseStartDate = CourseStartDate;
    }

    public Date getCourseEndDate() {
        return this.CourseEndDate;
    }

    public void setCourseEndDate(Date CourseEndDate) {
        this.CourseEndDate = CourseEndDate;
    }


}
