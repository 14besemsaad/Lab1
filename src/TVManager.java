
public class TVManager {
	Channel head;
	Channel tail;
	Channel prev;
	
	TVManager()
	{
		head=null;
		tail=null;
		prev=null;
		
	}
	
	public void addChannel(String path)
	{
		Channel temp=new Channel(path,null);
		if(head==null)
		{
			head=temp;
			tail=head;
			head.setNext(null);
		}
		else
		{
			tail.setNext(temp);
			tail=temp;
			tail.setNext(null);
		}
	}
	
	public void deleteChannel(String path)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			
		}
		else
		{
			
			Channel temp=head;
			prev=head;
			while(temp!=null)
			{
				
				if(temp.getPath().equals(path))
				{
					
					if(temp==head)                //if head is to be deleted
					{
						
						head=temp.getNext();
					}
					else if(temp.getNext()==null)				//if tail is to be deleted
					{
						
						prev.setNext(null);
						tail=prev;
					}
					else if(temp.getNext()!=null)		//if it is to be deleted from between
					{
						
						prev.setNext(temp.getNext());
						
					}
					
				}
				
				prev=temp;
				temp=temp.getNext();
				
			}
		}
	}
	
	void replaceChannel(String oldpath,String newpath)
	{
		Channel nchannel = new Channel(newpath,null);
		Channel temp=head;
		while(temp!=null)
		{
			if(temp.getPath().equals(oldpath))
			{
				Channel a = temp.getNext();
				temp.setNext(nchannel);
				nchannel.setNext(a);
			}
			temp=temp.getNext();
		}
		deleteChannel(oldpath);
		
	}
	
	public void printChannel()
	{
		Channel temp=head;
		while(temp!=null)
		{
			System.out.println(temp.getPath());
			temp=temp.getNext();
		}
	}
}
