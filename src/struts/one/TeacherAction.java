package struts.one;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String add() {

		return "add_Teacher_success";
	}
	public String delete() {

		return "delete_Teacher_success";
	}

}
