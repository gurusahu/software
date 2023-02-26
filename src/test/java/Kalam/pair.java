package Kalam;

public class pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int a[]={2,8,6,4,7,3,10,0};
		        int num=10;
		        int count=0;
		        for(int i=0;i<a.length;i++)
		        {
		            for(int j=i+1;j<a.length;j++)
		            {
		                if(a[i]+a[j]==num)
		                {
		                    System.out.println("number of pairs"+a[i]+" "+a[j]);
		                    count++;
		                }
		            }
		        }
		        System.out.println("nb pair"+count);
		    }
		}
	


