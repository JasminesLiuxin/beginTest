package struts.one;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

//public class LoginAction implements Action {

//	public String execute() {

//		return SUCCESS;
//	}}
//public String execute() {// 传数据，IOc控制反转：成员控制----变为action控制
//	// 属性依赖于struts去注入
//	System.out.println("HelloWord--Action");
//	if ("liuxin".equals(username) && "123456".equals(password)) {
//		// username。equals("liuxin")当username为空时没有equals方法，会出现空指针异常
//		return "success";
//	} else
//		return "failture";
public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	public String login() {
		return LOGIN;
	}

	public String execute() {

		return SUCCESS;
	}

	public String add() {

		return ERROR;
	}

}
