package PR_4;

public class PR_4_1{
    public static void main(String[] args) {
        int a=10,b=0;
        int c[] = {1,2,3};

        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Arithmatic Exception Occured");
        }
        try{
            for(int i=0;i<4;i++)
            {
                System.out.println(c[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println("Array Index Out Of Bound");
        }
        try{
            String s = null;
            System.out.println(s.charAt(0));
        }
        catch(Exception e)
        {
            System.out.println("Null Pointer Exception");
        }
    }
}