package vishi.datastructures.linkedlist;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linklist list = new linklist();
		list.insert(10);
		list.insert(20);
		list.insertmid(40, 20);
		list.insert(30);
		list.show();
		list.delnode(20);
		System.out.println();
		list.show();
		list.find(10);
		System.out.println();
		list.find(40);
		System.out.println();
		list.find(30);
		System.out.println();
		list.find(20);
		list.delnode(10);
		list.show();
	}
	

}
