package Payload;

import java.util.List;

public class CoursesObject {
	private List<WebAutomationObject> WebAutomation;
	private List<APIObject> api;
	private List<MobileObject> mobile;

	public void setWebAutomation(List<WebAutomationObject> webAutomation) {
		WebAutomation = webAutomation;
	}

	public void setApi(List<APIObject> api) {
		this.api = api;
	}

	public void setMobile(List<MobileObject> mobile) {
		this.mobile = mobile;
	}

}
