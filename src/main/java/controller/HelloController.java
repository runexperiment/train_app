package controller;
/**
 * 基于SSM第一个控制器
 * 1.添加@controller
 * 2.添加映射路径
 * @author 田帅华
 * @since jdk8
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hi")
	@ResponseBody
	public String hello() {
		return "hello nuc_a";
	}
}
