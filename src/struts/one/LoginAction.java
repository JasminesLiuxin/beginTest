package struts.one;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

//public class LoginAction implements Action {

//	public String execute() {

//		return SUCCESS;
//	}}
//public String execute() {// �����ݣ�IOc���Ʒ�ת����Ա����----��Ϊaction����
//	// ����������strutsȥע��
//	System.out.println("HelloWord--Action");
//	if ("liuxin".equals(username) && "123456".equals(password)) {
//		// username��equals("liuxin")��usernameΪ��ʱû��equals����������ֿ�ָ���쳣
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
