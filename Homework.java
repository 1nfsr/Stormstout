public class Homework{
	public static void main(String[] args){
		//分别用整型,字符串,字符,浮点型定义学号,姓名,性别,身高
		//第一个学生信息
		int id = 1;
		String name = "张三";
		char gender = '男';
		double hight = 1.80;
		String showInfo = "学号: " + id + "\n"
			+ "姓名: " + name + "\n"
			+ "性别: " + gender + "\n"
			+ "身高: " + hight + "\n----------";
		System.out.println(showInfo);
		//第二个学生信息
		id = 2;
		name = "李四";
		gender = '女';
		hight = 1.65;
		showInfo = "学号: " + id + "\n"
			+ "姓名: " + name + "\n"
			+ "性别: " + gender + "\n"
			+ "身高: " + hight + "\n----------";
		System.out.println(showInfo);

	}
}