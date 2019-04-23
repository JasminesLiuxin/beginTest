package struts.one;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String add() {

		return "add_Student_success";
	}
	public String delete() {

		return "delete_Student_success";
	}

}

