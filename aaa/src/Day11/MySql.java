package Day11;

public class MySql implements DAO{
	@Override
	public void select() {
		System.out.println("MySql DB 검색");
		
	}
	@Override
	public void insert() {
		System.out.println("MySql DB 삽입");
		
	}
	@Override
	public void update() {
		System.out.println("MySql DB 수정");
		
	}
	@Override
	public void delete() {
		System.out.println("MySql DB 삭제");
		
	}

}
