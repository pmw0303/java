package 濠っ晦;

import java.text.DecimalFormat;

public class Picture {
	
	public static void cls() { // 奩犒僥戲煎 綴奢除 塵橫頂憮 遺霜檜朝匙籀歲 ル⑷ж晦 嬪и 奩犒僥 轎溘詭模萄
		for(int i = 1 ; i <= 60; i++) { // 60還 轎溘 奩犒僥
			System.out.println();
		}
	}
	
	 public static void 衛濛�飛�() {
		 	for(int i = 1 ; i <= 34 ; i++) {
		 		System.out.println();
		 	}
			System.out.println("\t\t\t忙式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("\t\t\t弛         �飛橧黍仃蛨�        弛");
			System.out.println("\t\t\t戌式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			System.out.println("\t\t夔樂璽擊 譆渠�� п輿衛堅 �飛橧黍仃蛨� 夢蝶陛 梟雖雖 彊紫煙 �飛橉� �捎踿媮祤撚�");
			System.out.println(); //夔樂璽擊 憲蜃擎 餌檜鍔煎 褻瞰ж紫煙 ж朝 濰纂 
			System.out.println();
			
			System.out.println("\t\t\t********* 濠っ晦 啪歜 *********");
			System.out.println("\t\t\t     濠っ晦縑 擠猿熱陛 賅濠塭憮   ");
			System.out.println("\t\t\t     っ衙ж雖 跤ж賊 唳堅殮棲棻   ");
			System.out.println("\t\t\t         澀 瓣錶輿撮蹂!        ");
			System.out.println("\t\t\t*****************************");

	 }
	
	public static void �飛橨漞繡瑆珛�() { // �飛� 轎溘 詭模萄
		DecimalFormat df = new DecimalFormat("#,##0"); // 濠旎 轎溘⑽衝 撲薑
		while(true) { // 鼠и瑞Щ [謙猿 褻勒 : 唳堅�蝦� 4�蛻抳鄿
			if(Controller.唳堅�蝦�>=4) {  // 唳堅�蝦� 4�� 檜鼻衛 詭檣 蝶溯萄 謙猿
				break;
			}
			for(int i = 0 ; i < 2 ; i++) { // 濠っ晦 旋濠縑 奩礎檜朝 �膩� 輿晦嬪п 2偃曖 �飛橉虞� Щ溯歜 儅撩
				if(i == 0) {
					cls(); // �飛� 塵橫頂晦 詭模萄
					String money = df.format(Controller.濠旎); // 濠旎曖 轎溘⑽衝 撲薑ж罹 僥濠翮煎 盪濰
					System.out.println("  忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖 ");
					System.out.println("  弛                                                            弛 ");
					System.out.println("  弛     ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤   ﹤       ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤     ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤     弛 ");
					System.out.println("  弛         ﹤﹤       ﹤         ﹤  ﹤     ﹤﹤﹤          ﹤   ﹤     弛 ");
					System.out.println("  弛         ﹤﹤       ﹤         ﹤  ﹤     ﹤           ﹤    ﹤     弛 ");
					System.out.println("  弛        ﹤  ﹤      ﹤﹤﹤     ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤          ﹤     ﹤     弛 ");
					System.out.println("  弛       ﹤    ﹤     ﹤                            ﹤      ﹤     弛        ***********************************");
					System.out.printf ("  弛      ﹤      ﹤    ﹤         ﹤                 ﹤       ﹤     弛                       憲葡っ                 \n");
					System.out.printf ("  弛     ﹤        ﹤   ﹤         ﹤                ﹤        ﹤     弛        %-15s 唳堅 �蝦�:%s              \n","Level : " + Controller.衛除離檜,Controller.唳堅�蝦�);
					System.out.printf ("  弛                  ﹤         ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤     ﹤         ﹤     弛        %-30s              \n",Controller.詭衛雖.get(4)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
					System.out.printf ("  弛                                                            弛        %-30s              \n",Controller.詭衛雖.get(3)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
					System.out.printf ("  弛                                                            弛        %-30s              \n",Controller.詭衛雖.get(2)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
		            System.out.printf ("  弛        COLA         FANTA        CIDER      RED BULL       弛        %-30s              \n",Controller.詭衛雖.get(1)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
		            System.out.printf ("  弛     忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖     弛        %-30s              \n",Controller.詭衛雖.get(0)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
		            System.out.println("  弛     弛         弛  弛 ###     弛  弛    #    弛  弛####弛    弛     弛        ***********************************");
		            System.out.println("  弛     弛COCA COLA弛  弛  ###    弛  弛# # # # #弛  弛####弛    弛     弛 ");
		            System.out.println("  弛     弛     ####弛  弛         弛  弛  # # #  弛  弛####弛    弛     弛                      ⑷營 濠旎  ");
		            System.out.println("  弛     弛####*####弛  弛 F A N   弛  弛# # # # #弛  弛    弛####弛     弛                      " + money);
		            System.out.println("  弛     弛####*    弛  弛     T A 弛  弛    #    弛  弛    弛####弛     弛 ");
		            System.out.println("  弛     弛         弛  弛         弛  弛  CIDER  弛  弛    弛####弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎     弛                      幗が嬪纂");
					System.out.printf ("  弛        %3d          %3d           %3d          %3d         弛        忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖\n",Controller.屬塭,Controller.�級�,Controller.餌檜棻,Controller.溯萄碳);	
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                               (|) (式)      弛        弛                                 弛\n");
		            System.out.print  ("  弛       ###  ####   ###  #   # ####              #####       弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   #             #           弛        弛                                 弛\n");
		            System.out.print  ("  弛      # ### ####  #   # #   # ####              ####        弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #                     #       弛        弛                                 弛\n");
		            System.out.print  ("  弛       #### #   #  ###   ###  #                 ####        弛        弛                                 弛\n");
					System.out.print  ("  弛     忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖     弛        戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎\n");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎     弛 ");
					System.out.println("  戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎 ");
				}
				else {
					cls();
					String money = df.format(Controller.濠旎);
					System.out.println("  忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖 ");
					System.out.println("  弛                                                            弛 ");
					System.out.println("  弛     ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥   ﹥       ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥     ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥     弛 ");
					System.out.println("  弛         ﹥﹥       ﹥         ﹥  ﹥     ﹥﹥﹥          ﹥   ﹥     弛 ");
					System.out.println("  弛         ﹥﹥       ﹥         ﹥  ﹥     ﹥           ﹥    ﹥     弛 ");
					System.out.println("  弛        ﹥  ﹥      ﹥﹥﹥     ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥          ﹥     ﹥     弛 ");
					System.out.println("  弛       ﹥    ﹥     ﹥                            ﹥      ﹥     弛        ***********************************");
					System.out.printf ("  弛      ﹥      ﹥    ﹥         ﹥                 ﹥       ﹥     弛                       憲葡っ                 \n");
					System.out.printf ("  弛     ﹥        ﹥   ﹥         ﹥                ﹥        ﹥     弛        %-15s 唳堅 �蝦�:%s              \n","Level : " + Controller.衛除離檜,Controller.唳堅�蝦�);
					System.out.printf ("  弛                  ﹥         ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥     ﹥         ﹥     弛        %-30s              \n",Controller.詭衛雖.get(4));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Controller.詭衛雖.get(3));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Controller.詭衛雖.get(2));
		            System.out.printf ("  弛        COLA         FANTA        CIDER      RED BULL       弛        %-30s              \n",Controller.詭衛雖.get(1));
		            System.out.printf ("  弛     忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖     弛        %-30s              \n",Controller.詭衛雖.get(0));
		            System.out.println("  弛     弛         弛  弛 ###     弛  弛    #    弛  弛####弛    弛     弛        ***********************************");
		            System.out.println("  弛     弛COCA COLA弛  弛  ###    弛  弛# # # # #弛  弛####弛    弛     弛 ");
		            System.out.println("  弛     弛     ####弛  弛         弛  弛  # # #  弛  弛####弛    弛     弛                      ⑷營 濠旎  ");
		            System.out.println("  弛     弛####*####弛  弛 F A N   弛  弛# # # # #弛  弛    弛####弛     弛                      " + money);
		            System.out.println("  弛     弛####*    弛  弛     T A 弛  弛    #    弛  弛    弛####弛     弛 ");
		            System.out.println("  弛     弛         弛  弛         弛  弛  CIDER  弛  弛    弛####弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎     弛                      幗が嬪纂");
					System.out.printf ("  弛        %3d          %3d           %3d          %3d         弛        忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖\n",Controller.屬塭,Controller.�級�,Controller.餌檜棻,Controller.溯萄碳);	
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                               (|) (式)      弛        弛                                 弛\n");
		            System.out.print  ("  弛       ###  ####   ###  #   # ####              #####       弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   #             #           弛        弛                                 弛\n");
		            System.out.print  ("  弛      # ### ####  #   # #   # ####              ####        弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #                     #       弛        弛                                 弛\n");
		            System.out.print  ("  弛       #### #   #  ###   ###  #                 ####        弛        弛                                 弛\n");
					System.out.print  ("  弛     忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖     弛        戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎\n");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎     弛 ");
					System.out.println("  戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎 ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // 轎溘詭模萄 end
	
	public static void 衛濛蘋遴お() {
		for(int i = 0 ; i <= 5 ; i++) {
			cls();
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
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("\t\t\t          〤〤                 ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("\t\t\t                  〤〤         ");
				System.out.println("\t\t\t                  〤〤         ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("\t\t\t          〤〤     〤〤          ");
				System.out.println("\t\t\t          〤〤     〤〤          ");
				System.out.println("\t\t\t          〤〤     〤〤          ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("\t\t\t                 〤〤          ");
				System.out.println("\t\t\t                 〤〤          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("\t\t\t                  〤〤         ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("\t\t\t                  〤〤         ");
				System.out.println("\t\t\t                  〤〤         ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("\t\t\t                  〤〤         ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("\t\t\t          〤〤                 ");
				System.out.println("\t\t\t          〤〤                 ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("\t\t\t              〤〤             ");
				System.out.println("\t\t\t            〤〤〤〤             ");
				System.out.println("\t\t\t              〤〤             ");
				System.out.println("\t\t\t              〤〤             ");
				System.out.println("\t\t\t              〤〤             ");
				System.out.println("\t\t\t          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}
	
	 public static void gameover() {
	      System.out.println();      
	      System.out.println("   ##########       ######      ####    ####   ############");
	      System.out.println("  ############     ########     #####  #####   ############");
	      System.out.println("  ####    ####   ####    ####   ############   ####");
	      System.out.println("  ###            ####    ####   ##  ####  ##   ############");
	      System.out.println("  ###    #####   ############   ##  ####  ##   ############");
	      System.out.println("  ####      ##   ############   ##  ####  ##   ####");
	      System.out.println("  ############   ####    ####   ##  ####  ##   ############");
	      System.out.println("   ##########    ####    ####   ##  ####  ##   ############");
	      System.out.println();
	      System.out.println("     ######      ####    ####   ############   ##########");
	      System.out.println("   ####  ####    ####    ####   ############   ####  #####");
	      System.out.println("  ####    ####   ####    ####   ####           ###    #####");
	      System.out.println("  ###      ###   ####    ####   ############   ####  #####");
	      System.out.println("  ###      ###   ####    ####   ############   ##########");
	      System.out.println("  ####    ####    ####  ####    ####           ###    ###");
	      System.out.println("   ####  ####      ########     ############   ###     ###");
	      System.out.println("     ######          ####       ############   ###      ###");
	   }
	 
	 public static void 楨觼轎溘() { // 楨觼 轎溘 詭模萄
		cls();
		System.out.println("\t\t\t---------------- 牖嬪ル ----------------");
		System.out.println("\t\t\t楨韁\t檜葷\tЫ溯檜衛除\t囀詮お");
		for(int i = 0 ; i < 10 ; i++) {
		System.out.println("\t\t\t"+(i+1)+"\t"+ Controller.楨韁.get(i).getName()+"\t"+ Controller.楨韁.get(i).getPlaytime()+"蟾\t"+ Controller.楨韁.get(i).getContent());
		}
		System.out.println("\t\t\t---------------------------------------");
	 }

}
