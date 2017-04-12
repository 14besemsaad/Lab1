import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option;
		TVManager t=new TVManager();
		Scanner in = new Scanner(System.in);
		
		System.out.println("1-Add Channel");
		System.out.println("2-Delete Channel");
		System.out.println("3-Replace Channel");
		System.out.println("4-Print Channel");
		
		System.out.println("Option:");
		option=in.nextInt();
		in.nextLine();
		String path;
		while(true)
		{
			switch(option)
			{
				case 1:
					System.out.println("Enter channel path");
					path=in.nextLine();
					t.addChannel(path);
					break;
				case 2:
					System.out.println("Enter channel path");
					path=in.nextLine();
					t.deleteChannel(path);
					break;
				case 3:
					System.out.println("Enter old channel path");
					String path1=in.nextLine();
					System.out.println("Enter new channel path");
					String path2=in.nextLine();
					t.replaceChannel(path1,path2);
					break;
					
				case 4:
					t.printChannel();
					break;
			}
			System.out.println("Option:");
			option=in.nextInt();
			in.nextLine();
		}
	}

}


