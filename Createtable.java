import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	Scanner Obj = new Scanner(System.in);
	System.out.print("Enter number which you want create table:");        
	int num;
	num = Obj.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(num+ "  *  " +i+ "   =    " +num*i);
        }
	}
}
