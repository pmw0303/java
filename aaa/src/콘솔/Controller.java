package 콘솔;

import java.text.DecimalFormat;

public class Controller extends Thread{

	
	public static void cls() {
		for(int i = 1 ; i <= 60; i++) {
			System.out.println();
		}
	}

	public static void 화면출력메소드() {
		DecimalFormat df = new DecimalFormat("#,##0");
		while(true) {
			if(Drink.경고횟수>=4) { 
				break;
			}
			for(int i = 0 ; i < 2 ; i++) {
				if(i == 0) {
					cls();
					String money = df.format(Drink.자금);
					System.out.println("  ┌────────────────────────────────────────────────────────────┐ ");
					System.out.println("  │                                                            │ ");
					System.out.println("  │     □□□□□□□□□□   □       □□□□□□□□   □     □□□□□□□□   □     │ ");
					System.out.println("  │         □□       □         □  □     □□□          □   □     │ ");
					System.out.println("  │         □□       □         □  □     □           □    □     │ ");
					System.out.println("  │        □  □      □□□     □□□□□□□□   □          □     □     │ ");
					System.out.println("  │       □    □     □                            □      □     │        ***********************************");
					System.out.printf ("  │      □      □    □         □                 □       □     │                       알림판                 \n");
					System.out.printf ("  │     □        □   □         □                □        □     │        %-15s 경고 횟수:%s              \n","Level : " + Drink.시간차이,Drink.경고횟수);
					System.out.printf ("  │                  □         □□□□□□□□□□□     □         □     │        %-30s              \n",Drink.메시지.get(4));
					System.out.printf ("  │                                                            │        %-30s              \n",Drink.메시지.get(3));
					System.out.printf ("  │                                                            │        %-30s              \n",Drink.메시지.get(2));
		            System.out.printf ("  │        COLA         FANTA        CIDER      RED BULL       │        %-30s              \n",Drink.메시지.get(1));
		            System.out.printf ("  │     ┌─────────┐  ┌─────────┐  ┌─────────┐  ┌─────────┐     │        %-30s              \n",Drink.메시지.get(0));
		            System.out.println("  │     │         │  │ ###     │  │    #    │  │####│    │     │        ***********************************");
		            System.out.println("  │     │COCA COLA│  │  ###    │  │# # # # #│  │####│    │     │ ");
		            System.out.println("  │     │     ####│  │         │  │  # # #  │  │####│    │     │                      현재 자금  ");
		            System.out.println("  │     │####*####│  │ F A N   │  │# # # # #│  │    │####│     │                      " + money);
		            System.out.println("  │     │####*    │  │     T A │  │    #    │  │    │####│     │ ");
		            System.out.println("  │     │         │  │         │  │  CIDER  │  │    │####│     │ ");
					System.out.println("  │     └─────────┘  └─────────┘  └─────────┘  └─────────┘     │                      버튼위치");
					System.out.printf ("  │        %3d          %3d           %3d          %3d         │        ┌─────────────────────────────────┐\n",Drink.콜라,Drink.환타,Drink.사이다,Drink.레드불);	
					System.out.print  ("  │                                                            │ 	│ 				  │\n");
					System.out.print  ("  │                                                            │ 	│ 				  │\n");
					System.out.print  ("  │                                               (|) (─)      │        │                                 │\n");
		            System.out.print  ("  │       ###  ####   ###  #   # ####              #####       │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #   #             ##          │        │                                 │\n");
		            System.out.print  ("  │      # ### ####  #   # #   # ####              ####        │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #                    ##       │        │                                 │\n");
		            System.out.print  ("  │       #### #   #  ###   ###  #                 ####        │        │                                 │\n");
					System.out.print  ("  │     ┌────────────────────────────────────────────────┐     │	└─────────────────────────────────┘\n");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     └────────────────────────────────────────────────┘     │ ");
					System.out.println("  └────────────────────────────────────────────────────────────┘ ");
					System.out.println();
				}
				else {
					cls();
					String money = df.format(Drink.자금);
					System.out.println("  ┌────────────────────────────────────────────────────────────┐ ");
					System.out.println("  │                                                            │ ");
					System.out.println("  │     ■■■■■■■■■■   ■       ■■■■■■■■   ■     ■■■■■■■■   ■     │ ");
					System.out.println("  │         ■■       ■         ■  ■     ■■■          ■   ■     │ ");
					System.out.println("  │         ■■       ■         ■  ■     ■           ■    ■     │ ");
					System.out.println("  │        ■  ■      ■■■     ■■■■■■■■   ■          ■     ■     │ ");
					System.out.println("  │       ■    ■     ■                            ■      ■     │        ***********************************");
					System.out.printf ("  │      ■      ■    ■         ■                 ■       ■     │                       알림판                 \n");
					System.out.printf ("  │     ■        ■   ■         ■                ■        ■     │        %-15s 경고 횟수:%s              \n","Level : " + Drink.시간차이,Drink.경고횟수);
					System.out.printf ("  │                  ■         ■■■■■■■■■■■     ■         ■     │        %-30s              \n",Drink.메시지.get(4));
					System.out.printf ("  │                                                            │        %-30s              \n",Drink.메시지.get(3));
					System.out.printf ("  │                                                            │        %-30s              \n",Drink.메시지.get(2));
		            System.out.printf ("  │        COLA         FANTA        CIDER      RED BULL       │        %-30s              \n",Drink.메시지.get(1));
		            System.out.printf ("  │     ┌─────────┐  ┌─────────┐  ┌─────────┐  ┌─────────┐     │        %-30s              \n",Drink.메시지.get(0));
		            System.out.println("  │     │         │  │ ###     │  │    #    │  │####│    │     │        ***********************************");
		            System.out.println("  │     │COCA COLA│  │  ###    │  │# # # # #│  │####│    │     │ ");
		            System.out.println("  │     │     ####│  │         │  │  # # #  │  │####│    │     │                      현재 자금  ");
		            System.out.println("  │     │####*####│  │ F A N   │  │# # # # #│  │    │####│     │                      " + money);
		            System.out.println("  │     │####*    │  │     T A │  │    #    │  │    │####│     │ ");
		            System.out.println("  │     │         │  │         │  │  CIDER  │  │    │####│     │ ");
					System.out.println("  │     └─────────┘  └─────────┘  └─────────┘  └─────────┘     │                      버튼위치");
					System.out.printf ("  │        %3d          %3d           %3d          %3d         │        ┌─────────────────────────────────┐\n",Drink.콜라,Drink.환타,Drink.사이다,Drink.레드불);	
					System.out.print  ("  │                                                            │ 	│ 				  │\n");
					System.out.print  ("  │                                                            │ 	│ 				  │\n");
					System.out.print  ("  │                                               (|) (─)      │        │                                 │\n");
		            System.out.print  ("  │       ###  ####   ###  #   # ####              #####       │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #   #             ##          │        │                                 │\n");
		            System.out.print  ("  │      # ### ####  #   # #   # ####              ####        │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #                    ##       │        │                                 │\n");
		            System.out.print  ("  │       #### #   #  ###   ###  #                 ####        │        │                                 │\n");
					System.out.print  ("  │     ┌────────────────────────────────────────────────┐     │	└─────────────────────────────────┘\n");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     └────────────────────────────────────────────────┘     │ ");
					System.out.println("  └────────────────────────────────────────────────────────────┘ ");
					System.out.println();
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // 출력메소드 end
	public static void 시작화면출력() {
		for(int i = 0 ; i <= 5 ; i++) {
			cls();
			System.out.println("┌───────────────────────────┐");
			System.out.println("│     자판기에 음료수가 모자라서    │");
			System.out.println("│     판매하지 못하면 경고입니다    │");
			System.out.println("│         열심히 채워요         │");
			System.out.println("└───────────────────────────┘");
			if(i==0) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==1) {			
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("          ▒▒                 ");
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("                  ▒▒         ");
				System.out.println("                  ▒▒         ");
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("          ▒▒     ▒▒          ");
				System.out.println("          ▒▒     ▒▒          ");
				System.out.println("          ▒▒     ▒▒          ");
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("                 ▒▒          ");
				System.out.println("                 ▒▒          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("                  ▒▒         ");
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("                  ▒▒         ");
				System.out.println("                  ▒▒         ");
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("                  ▒▒         ");
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("          ▒▒                 ");
				System.out.println("          ▒▒                 ");
				System.out.println("          ▒▒▒▒▒▒▒▒▒▒         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("              ▒▒             ");
				System.out.println("            ▒▒▒▒             ");
				System.out.println("              ▒▒             ");
				System.out.println("              ▒▒             ");
				System.out.println("              ▒▒             ");
				System.out.println("            ▒▒▒▒▒▒         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}

}
	
