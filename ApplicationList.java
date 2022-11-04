

public class ApplicationList{

	public static void main(String[] args) 
	{
		GenLinkedList<Integer> myList = new GenLinkedList<>();
		
		myList.addNode(1);
		myList.addNode(2);
		
		GenNode<Integer> tempnode = myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode = tempnode.getNextNode();
		} while (tempnode!=null);

	}

}
