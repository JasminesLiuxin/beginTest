package struts.one;

public class HelloAction {
	/**
	 * ������public������Ϊexecute�������в�����������String����ֵ������ֵĬ��Ϊsuccess
	 * @return
	 */
	public String execute() {
		System.out.println("HelloWord--Action");
		return "success";
	}
	//��ַ������Ŀ����/action��name
}
