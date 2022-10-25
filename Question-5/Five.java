public class Five
{
	public static void main(String[] args) {
	    int n = 14;
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=n;j++)
	        {
	            if(i==0||i==(n-1)||j==0&&i<(n-1)||i==1&&j<(n-1)/2||i==2&&j<5||i==3&&j<4||i==4&&j<3||i==5&&j<2||i==6&&j<1||
	            i==12&&j<7||i==11&&j<6||i==10&&j<5||i==9&&j<4||i==8&&j<3||i==7&&j<2)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
