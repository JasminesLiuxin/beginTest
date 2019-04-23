package struts.one;

public class HelloAction {
	/**
	 * 方法是public，名字为execute，不能有参数；必须有String返回值，返回值默认为success
	 * @return
	 */
	public String execute() {
		System.out.println("HelloWord--Action");
		return "success";
	}
	//地址栏：项目名称/action的name
}
