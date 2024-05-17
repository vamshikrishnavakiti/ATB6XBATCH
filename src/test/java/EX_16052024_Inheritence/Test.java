package EX_16052024_Inheritence;

public class Test extends BaseTest {
  void accessExcelAndSQL() {
	   openExcel();
	   openSQL();
	   System.out.println(API_Version);
	  
  }
  void OpenJson() {
		System.out.println("Common to All(Test) ");
	}
}
