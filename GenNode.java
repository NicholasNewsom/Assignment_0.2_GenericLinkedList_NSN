

public class GenNode <T>
{
	private T data;
	private GenNode<T> nextNode;
	
	public GenNode(T data)
	{
		this.nextNode = nextNode;
		this.data = data;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public GenNode<T> getNode()
	{
		return this;
	}
	
	public void setNextNode(GenNode<T> nextNode)
	{
		this.nextNode = nextNode;
	}
	
	public GenNode<T> getNextNode()
	{
		return nextNode;
	}
}
