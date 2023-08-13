package menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;








public class MenuService {

	private Scanner sc = new Scanner(System.in);
	
	
	private List<Menu> menuList = new LinkedList<Menu>(); 
	
	public MenuService() {
		menuList.add(new Menu(1,"기본김밥","김밥",3000));
		menuList.add(new Menu(2,"참치김밥","김밥",4000));
		menuList.add(new Menu(3,"기본라면","라면",4000));
		menuList.add(new Menu(4,"하얀라면","라면",5000));
		menuList.add(new Menu(5,"돈까스","돈까스",8000));
		menuList.add(new Menu(6,"등심돈까스","돈까스",9000));
	
		
		
	}

	public void menuplay() {
		
		
		 
		try {
			
			int menuNum = 0;
			
	        do {
				System.out.println("--메뉴---");
				System.out.println("1.메뉴 조회");
				System.out.println("2.메뉴 추가");
				System.out.println("3.메뉴 삭제");
				System.out.println("0.종료");
				System.out.print("번호 입력 : ");
				menuNum = sc.nextInt();
				
				switch(menuNum){
				
				case 1 : menuCheck(); break;
				case 2 : menuAdd(); break;
				case 3 : menuDelte(); break;
				case 0 : System.out.println("종료되었습니다.");break;
				default : System.out.println("잘못 입력했습니다.메뉴 숫자를 입력해주세요");
			
				}
				
		
				
		
				
				
		}while(menuNum!=0);
			
		
		
		
		
		}catch(Exception e) {
			System.out.println("잘못입력했습니다.");
			
			sc.next();
			

		}	
	}
	
	public void menuCheck() {
		
		
		for (Menu temp : menuList) {
			System.out.println(temp);
		}
	
		
		
	}

	
	public void menuAdd() {
	    System.out.println("음식 번호 : ");
	     int input1 =sc.nextInt();
	    System.out.println("음식 이름 : ");
		sc.nextLine();
	    String input2 = sc.nextLine();
	    System.out.println("음식 종류 : ");
	    String input3 = sc.nextLine();
	    System.out.println("가격 : ");
	    int input4 = sc.nextInt();
	    
	    Menu menuNew = new Menu(input1,input2,input3,input4);
	    
	    menuList.add(menuNew);
	    
	    
		System.out.println("완료");
			
			
		}
	
	
	public void  menuDelte() {
		
	
		
	
		
		System.out.print("삭제할 메뉴 번호 : ");
		int input = sc.nextInt();
		
		for( Menu temp : menuList) {
			
			if(temp.getFoodNumber() == input) {
				int index =menuList.indexOf(temp);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					menuList.remove(index);
					break;
				} else {
					System.out.println("삭제를 진행하지 않습니다.");
				}
			}
			
		}
		
		
		System.out.println("삭제 끝");
		
		
	}
	
	
	
}
