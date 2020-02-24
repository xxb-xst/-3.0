package jay;

import java.util.Scanner;

public class gust {

		public static void main(String[] args) {
			/*
			 * 生成随机数
			 */
			int num = (int) (Math.random() * 100 + 1);
			/*
			 * 输入数字
			 */
			Scanner scan = new Scanner(System.in);
			/*
			 * 统计次数
			 */
			int count = 0;
			System.out.println("chooose a nummber");
			while (true) {
				int gust = scan.nextInt();
				if (gust == num) {
					count++;
					if(count>7){
						System.out.println("Misfortune but Successful!!!FinallyCount:"+count+"!");
					}else{
						System.out.println("Lucky and Successful!!!FinallyCount:"+count+"!");
					}
					scan.close();
					break;
				}else if(gust<num){
					System.out.println("Smaller,please input again");
					count++;
				}else if(gust>num){
					System.out.println("Bigger,please input again");
					count++;
				}
			}
			
			
		}

	}



