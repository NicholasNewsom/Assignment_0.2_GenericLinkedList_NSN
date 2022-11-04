

public class GenLinkedList <T>
{
	protected int length;
	protected GenNode<T> head, tail;
	public GenLinkedList()
	{
		this.head = head;
		length = 0;
		tail = head;
	}
	public boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;
	}
	
	public int size()
	{
		return length;
	}
	
	public GenNode<T> getList()
	{
		return head;
	}
	
	public void addNode(T data)
	{
		GenNode<T> tempNode = new GenNode<T>(data);
		
		if(this.head == null)
		{
			this.head = this.tail = tempNode;
		}
		else
		{
			tail.setNextNode(tempNode);
			tail = tempNode;
		}
		length++;
	}
	
	public T remove(T targetElement) throws EmptyCollectionException, ElementNotFoundException	
	{
		if(isEmpty())
			throw new EmptyCollectionException("GenLinkedList");
		boolean found = false;
		GenNode<T> previous = null;
		GenNode<T> current = head;
		
		while(current != null && !found)
		{
			if(targetElement.equals(current.getData()))
				found = true;
			else
			{
				previous = current;
				current = current.getNextNode();
			}
			if(!found)
				throw new ElementNotFoundException("GenLinkedList");
			if(size() == 1)
				head = tail = null;
			else if(current.equals(head))
				head = current.getNextNode();
			else if(current.equals(tail))
			{
				tail = previous;
				tail.setNextNode(null);
			}
			else
				previous.setNextNode(current.getNextNode());
			length--;
		}
		return current.getData();
	}
}

