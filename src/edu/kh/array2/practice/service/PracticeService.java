package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice7() {

		String[][] student1 = {
				{"강건강", "남나나",},
				{"도대담", "류라라",},
				{"문미미", "박보배"}
		};
		String[][] student2 = {
				{"송성실", "윤예의"},
				{"진재주", "차천축"},
				{"피풍표", "홍하하"}
		};
		System.out.println("==1분단==");
		for(int x = 0; x < student1.length; x++) {
			for(int y = 0; y < student1[x].length; y++) {
				System.out.print(student1[x][y] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==2분단==");
		for(int x = 0; x < student2.length; x++) {
			for(int y = 0; y < student2[x].length; y++) {
				System.out.print(student2[x][y] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		
		String str = "";
		
		for(int x = 0; x < student1.length; x++) {
			for(int y = 0; y < student1[x].length; y++) {
					if(name.equals(student1[x][y])) {
						if(y == 0) {
							str = "왼쪽";
						} else {
							str = "오른쪽";
						}
						
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.",
								name, x + 1, str);
					}
			}
		}
		
		for(int x = 0; x < student2.length; x++) {
			for(int y = 0; y < student2[x].length; y++) {
					if(name.equals(student2[x][y])) {
						if(y == 0) {
							str = "왼쪽";
						} else {
							str = "오른쪽";
						}
						
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다.",
								name, x + 1, str);
					}
			}
		}
		
		
	}
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = {
				{" ", " 0", " 1", " 2", " 3", " 4"},
				{"0", "  ", "  ", "  ", "  ", "  "},
				{"1", "  ", "  ", "  ", "  ", "  "},
				{"2", "  ", "  ", "  ", "  ", "  "},
				{"3", "  ", "  ", "  ", "  ", "  "},
				{"4", "  ", "  ", "  ", "  ", "  "},
		};
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				if(x - 1 == row && y - 1 == col) {
					arr[x][y] = " x";
				}
				System.out.print(arr[x][y]);
			}
			System.out.println();
		}
		
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = {
				{" ", " 0", " 1", " 2", " 3", " 4"},
				{"0", "  ", "  ", "  ", "  ", "  "},
				{"1", "  ", "  ", "  ", "  ", "  "},
				{"2", "  ", "  ", "  ", "  ", "  "},
				{"3", "  ", "  ", "  ", "  ", "  "},
				{"4", "  ", "  ", "  ", "  ", "  "},
		};
		
		try {
			
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				if(x - 1 == row && y - 1 == col) {
					arr[x][y] = " x";
					arr[y][x] = " x";
				}
				System.out.print(arr[x][y]);
			}
			System.out.println();
		}
		
		} catch(Exception e) {
			System.out.println("잘못된 입력을 하셨습니다.");
		}
		
		
		
		
	}
	
	
	
}
