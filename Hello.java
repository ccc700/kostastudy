class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		MemberDAO dao = new MemberDAO();
		dao.insert();
		dao.update();
	}
}
