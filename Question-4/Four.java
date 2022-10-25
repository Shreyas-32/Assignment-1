public class Four
{
	public static void main(String[] args) {
	    int n =14;
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=n;j++)
	        {
	            if(i==14||i==13||i==12&&j!=7&&j!=6&&j!=8||i==11&&j!=7&&j!=6&&j!=8&&j!=9&&j!=5||
	            i==10&&j!=7&&j!=6&&j!=8&&j!=9&&j!=5&&j!=10&&j!=4||
	            i==9&&j!=7&&j!=6&&j!=8&&j!=9&&j!=5&&j!=10&&j!=4&&j!=11&&j!=3||
	            i==8&&j!=7&&j!=6&&j!=8&&j!=9&&j!=5&&j!=10&&j!=4&&j!=11&&j!=3&&j!=12&&j!=2
	            ||i==7&&j!=7&&j!=6&&j!=8&&j!=9&&j!=5&&j!=10&&j!=4&&j!=11&&j!=3&&j!=12&&j!=2&&j!=13&&j!=1)
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
