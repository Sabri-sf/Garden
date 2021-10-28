package edu.tsc;

import java.util.Scanner;

public class GoBang {
	public static void main(String[] args) {
		System.out.println("*******************************");
		System.out.println("欢迎小可爱");
		System.out.println("1.开始游戏");
		System.out.println("2.退出游戏");
		System.out.println("*******************************");
		Scanner scanner=new Scanner(System.in);
		
		int patten=scanner.nextInt();
		switch(patten) {
		case 1:
		int size = 10;
	int i,j = 0;
		//创造一个棋盘10行10列
		System.out.println("五子棋游戏开始");
//		声明二维数组
		char[][] checkerboard=new char[size][size];
//			换行
		for(i=0;i<checkerboard.length;i++)
		{
			for(j=0;j<checkerboard[i].length;j++) 
			{
				checkerboard[i][j]= '+';
//				输出棋盘
				System.out.print(checkerboard[i][j]);
			}
			System.out.println();
		}
//		初始化黑子,白子
		char BlackPicec='●';
		char WhitePicec='○';
//		回合计数器
		int count=1;
		while(true) {
//			黑子先行
			if(count%2==1) {
				System.out.println("第"+count+"手");
				System.out.println("黑子下");
				Scanner scanner1=new Scanner(System.in);
				System.out.println("请输入横坐标");
				int x=scanner1.nextInt();
//				下棋坐标不大于棋盘长度
				if(x>=size) {
					System.out.println("亲，请输入正确的坐标");
				continue;
				}
				System.out.println("请输入纵坐标");
				int y=scanner1.nextInt();
//				下棋坐标不大于棋盘长度
				if(x>=size) {
					System.out.println("亲，请输入正确的坐标");
				continue;
				}
                if(checkerboard[x-1][y-1]!='+') {
                	System.out.println("亲，此处已被白棋占领");
                	continue;
                }
				checkerboard[x-1][y-1]=BlackPicec;
				for(i=0;i<checkerboard.length;i++)
				{
					for(j=0;j<checkerboard[i].length;j++) 
					{
						
//						输出棋盘
					
						System.out.print(checkerboard[i][j]);
					}

				System.out.println();
			}
				count++;
				if(count>=size*size) {
					break;
				}
				continue;
		}
//			白棋下
			else {
				System.out.println("第"+count+"");
				System.out.println("白子下");
				Scanner scanner1=new Scanner(System.in);
				System.out.println("请输入横坐标");
				int x=scanner.nextInt();
//				下棋坐标不大于棋盘长度
				if(x>=size) {
					System.out.println("亲，请输入正确的坐标");
				continue;
				}
				
				System.out.println("请输入纵坐标");
				int y=scanner.nextInt();
//				下棋坐标不大于棋盘长度
				if(x>=size) {
					System.out.println("亲，请输入正确的坐标");
				continue;
				}
				
				 if(checkerboard[x-1][y-1]!='+') {
	                	System.out.println("亲，此处已被黑棋占领");
	                	continue;
	                }

				checkerboard[x-1][y-1]=WhitePicec;
				for(i=0;i<checkerboard.length;i++)
				{
					for(j=0;j<checkerboard[i].length;j++)
					{
//				if(x>checkerboard[i].length) {
//					System.out.println("请输入正确的坐标");
//				}
				System.out.print(checkerboard[i][j]);
				}
					System.out.println("");
				}
			}
			count++;
			if(count==size*size) {
				break;
			}
			continue;
		}
		break;
		case 2:
			System.out.println("游戏愉快，期待您下次玩耍");
			break;
			default:
				System.out.println("抱歉，还没有此功能，程序员正在玩命创造中");
		}
		}
	}

				
			