package dxc;
class tv
{
	int channel=1;
	int volumelevel=1;
	boolean on=false;
	void turnon()
	{
		on=true;
	}
	void turnoff()
	{
		on=false;
	}
	void setchannel(int newchannel)
	{
		if(on==true && newchannel>=1 && newchannel<=120 )
		{
		channel=newchannel;	
		}
	}
	void setvolumelevel(int newvolumelevel)
	{
		if(on==true && newvolumelevel>=1 && newvolumelevel<=7 )
		{
			volumelevel=newvolumelevel;	
		}
	}
	void channelup()
	{
		if(on==true && channel<120)
		{
			channel++;
		}
	}
	void channeldown()
	{
		if(on==true && channel>1)
		{
			channel--;
		}
	}
	void volumeup()
	{
		if(on==true && volumelevel<7)
		{
			volumelevel++;
		}
	}
	void volumedown()
	{
		if(on==true && volumelevel>1)
		{
			volumelevel--;
		}
	}
	void print()
	{
		System.out.println("Channel:"+channel+" volume :"+volumelevel);
	}
	
	
}

public class tvchannel {

	public static void main(String[] args) 
	{
		tv watch=new tv();
		watch.turnon();
		watch.setchannel(6);
		watch.setvolumelevel(3);
		watch.channelup();
		//watch.channeldown();
		watch.volumeup();
		//watch.volumedown();
		watch.print();
		

	}

}
