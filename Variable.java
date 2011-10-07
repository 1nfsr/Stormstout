/**
*   @author Infsr 
*   @since 1.0
*   @version 1.0
*/
public class Variable{
	// 类体
	public static void main(String[] args){
		// 方法体
		/* 
		   声明定义变量并赋值 (变量在同一个域中不能重复声明定义,但可以重复赋值)
		   可以一行声明多个变量
		   在方法体当中声明的变量: 局部变量
		   在方法体外,类体内声明的变量: 成员变量
		   局部变量只在方法体中有效,方法体执行结束该变量的内存就被释放
		*/
		int num;
		double pi;
		num = 100;
		pi = 3.14;
		System.out.println(num);
		System.out.println(pi);
	}

	public static void test(){
		System.out.println("hi test");
	}
}