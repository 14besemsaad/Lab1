
public class Channel {
	String path;
	Channel next;
	
	Channel()
	{
		path=null;
		next=null;
	}
	
	Channel(String path,Channel next)
	{
		this.path=path;
		this.next=next;
	}
	
	public void setPath(String s)
	{
		this.path=s;
	}
	
	public void setNext(Channel c)
	{
		this.next=c;
	}
	
	public String getPath()
	{
		return path;
	}
	
	public Channel getNext()
	{
		return next;
	}
}
