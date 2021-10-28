package tsc.com;
import java.util.Scanner;

public class Multplication {
	public static void main(String[] arge) {
		Scanner scanner=new Scanner(System.in);
		first:while(true) {
		System.out.println("**********************");
		System.out.println("欢迎登录峰总乘法口诀表系统");
		System.out.println("1.展示完整乘法表");
		System.out.println("2.展示部分乘法表");
		System.out.println("3.进行数学计算");
		System.out.println("4.退出系统");
		System.out.println("***********************");
//		设计一个登录界面
		@SuppressWarnings("resource")
		int pattern=scanner.nextInt();
		switch(pattern) {
		case 1:
       second:while(true) {
//    	   初始化得数
		int num;
//		打印乘法口诀表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				num=i*j;
				System.out.print(j+"*"+i+"="+num+"\t");
			}
			System.out.println();		
	}
		System.out.println("输入1返回上一级");
		System.out.println("输入2退出系统");
//		二级界面
		int pattern1=scanner.nextInt();
		switch(pattern1) {
	case 1:
		System.out.println("返回上级菜单");
		break second;
	case 2:
		System.out.println("欢迎下次登录");
		break first;
	default:
		break;
}
}
//		跳出switch
   break;
//   功能2
		case 2:
			second:while(true) {
			System.out.println("请输入你要查询的区间");
			System.out.println("如：输入1,2"+ "\t"+"1*1=1"+"\t"+"1*2=2");
			Scanner scanner11=new Scanner(System.in);
			int size=scanner11.nextInt();
			int size1=scanner11.nextInt();
			for(int i=size;i<=size1;i++) {
				if(size>size1) {
					System.out.println("亲，请输入正确的区间");
				}
				else
				for(int j=1;j<=i;j++) {
					int num1 = i*j;
					System.out.print(i+"*"+j+"="+num1+"\t");
				}
				System.out.println();
			}
			System.out.println("输入1返回上一级");
			System.out.println("输入2退出系统");		
//			二级界面
			int pattern1=scanner.nextInt();
			switch(pattern1) {
		case 1:
			System.out.println("返回上级菜单");
			break second;
		case 2:
			System.out.println("欢迎下次登录");
			break first;
		default:
			break;
	}
}
    break;
//    功能3
		case 3:
			second:while(true) {
				System.out.println("1.加法");
				System.out.println("2.减法");
				System.out.println("3.乘法");
				System.out.println("4.除法");
				System.out.println("5.返回上一级");
				int pattern1=scanner.nextInt();
    switch(pattern1) {
case 1:
	third:while(true) {
	System.out.println("请输入两个数字");
	double num1=scanner.nextInt();
	double num2=scanner.nextInt();
	double result1;
	result1=num1+num2;
	System.out.println("亲"+num1+"+"+num2+"="+result1);
	System.out.println("输入1返回上一级");
//	三级界面
int pattern2=scanner.nextInt();
if(pattern2==1) {
	break third;
	}
else {
	System.out.println("由于你输入了错误的选项，系统坏了");
	}
	}
	break;	
	
case 2:
	third:while(true) {
	System.out.println("请输入两个数字");
	double num3=scanner.nextInt();
	double num4=scanner.nextInt();
	double result2;
	result2=num3-num4;
	System.out.println("亲"+num3+"-"+num4+"="+result2);
	System.out.println("输入1返回上一级");
//三级界面
int pattern3=scanner.nextInt();
if(pattern3==1) {
break third;
}
else {
System.out.println("由于你输入了错误的选项，系统坏了");
}
	}
	break;
case 3:
	third:while(true) {
			System.out.println("亲，请输入两个任意乘数");
			System.out.println("第一个乘数：");
			double x=scanner.nextInt();
			System.out.println("第二个乘数：");
			double y=scanner.nextInt();
			double result3;
			result3=x*y;
			System.out.println("亲"+x+"*"+y+"="+result3);
			System.out.println("输入1返回上一级");
	
//三级界面
int pattern4=scanner.nextInt();
if(pattern4==1) {
break third;
}
else {
System.out.println("由于你输入了错误的选项，系统坏了");
}
	}
			break;
case 4:
	third:while(true) {
	System.out.println("亲，请输入两个任意数字");
	System.out.println("第一个被除数：");
	double x1=scanner.nextInt();
	System.out.println("第二个除数：");
	double y1=scanner.nextInt();
	double result4;
	result4=x1/y1;
	System.out.println("亲"+x1+"/"+y1+"="+result4);
	System.out.println("输入1返回上一级");
	
//三级界面
int pattern5=scanner.nextInt();
if(pattern5==1) {
break third;
}
else {
System.out.println("由于你输入了错误的选项，系统坏了");
}
	}
	break;
	default:
		break;
    
    case 5:		
//			返回二级界面	
			break second;	
    }		
			}
			break;		
		case 4:
			System.out.println("欢迎下次登录");
	break first;
			default:
				System.out.println("亲，抱歉还没有其他功能，程序员正在努力中");
				System.out.println("请重新输入正确的选项");
				break;
		}
		}
		}
		}
	
		
