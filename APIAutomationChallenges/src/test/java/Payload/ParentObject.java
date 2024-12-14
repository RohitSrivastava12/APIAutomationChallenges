package Payload;

public class ParentObject {
	private String url;
	private String services;
	private String expertise;
	private CoursesObject courses;
	private String linkedin;
	private String instructor;

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public CoursesObject getCourses() {
		return courses;
	}

	public void setCourses(CoursesObject courses) {
		this.courses = courses;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
}
