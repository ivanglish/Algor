package comscore;


public class StringBinary2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long decimal=Long.parseLong("1111111111111111111111111111111111111111111111111111111111111",2);  
        int resp=0;
        while (decimal>0) {
			if (decimal%2==0) decimal=decimal/2;
			else decimal=decimal-1;
			resp++;
		}
        System.out.println(resp);

	}
}
